package gestionConcesionario.modelo.controladores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import gestionConcesionario.modelo.Cliente;
import gestionConcesionario.modelo.Concesionario;

public class ControladorCliente  extends ControladorBBDD {

	public static List<Cliente> getAll() throws ParseException{
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from cliente");
			
			while(rs.next()) {
				Cliente cli = new Cliente();
				cli.setId(rs.getInt("id"));
				cli.setNombre(rs.getString("nombre"));
				cli.setApellidos(rs.getString("apellidos"));
				cli.setLocalidad(rs.getString("localidad"));
				cli.setDni(rs.getString("dniNie"));
				cli.setFechaNac(rs.getDate("fechaNac"));
				
				cli.setActivo(rs.getBoolean("activo"));
				clientes.add(cli);
			}
			
			s.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
	public static Cliente get (int id) throws ErrorBBDDException, ParseException {
		Connection conn = null;
		Cliente cli = null;
		
		try {
			conn =  ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from cliente where id = " + id);
			
			if(rs.next()) {
				cli = new Cliente();
				cli.setId(id);				
				cli.setNombre(rs.getString("nombre"));
				cli.setApellidos(rs.getString("apellidos"));
				cli.setLocalidad(rs.getString("localidad"));
				cli.setDni(rs.getString("dniNie"));
				cli.setFechaNac(rs.getDate("fechaNac"));
				cli.setActivo(true);
				
			}
			rs.close();
			s.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException();
		}
		
		return cli;
	}
	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 */
	private static void almacenarNuevo (Cliente cli) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("insert into cliente (id, nombre, apellidos, localidad, dniNie, fechaNac, activo) values (?,?,?,?,?,?,?)");
			int registrosInsertados;
			ps.setInt(1, nextIdEnTabla(conn, "cliente"));
			ps.setString(2, cli.getNombre());
			ps.setString(3, cli.getApellidos());
			ps.setString(4, cli.getLocalidad());
			ps.setString(5, cli.getDni());
			ps.setString(6, cli.getFechaNac());
			ps.setBoolean(7, true);
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No ha sido posible insertar el nuevo registro");
			}
			ps.close();
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}		
		
	}
	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 */
	private static void almacenarModificado (Cliente cli) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("update cliente set nombre = ?, apellidos = ?, localidad = ?, dniNie = ?, fechaNac = ? where id = ?");
			
			int registrosInsertados;
			ps.setString(1, cli.getNombre());
			ps.setString(2, cli.getApellidos());
			ps.setString(3, cli.getLocalidad());
			ps.setString(4, cli.getDni());
			ps.setString(5, cli.getFechaNac());
			ps.setInt(6, cli.getId());
			
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No se ha podido modificar el registro");
			}
			ps.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}
	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
	public static void almacenar (Cliente cli) throws ErrorBBDDException, ParseException {
		if (get(cli.getId()) != null) {
			almacenarModificado(cli);
		}
		else almacenarNuevo(cli);
	}
	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Cliente cli) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("delete from cliente where id = ?");
			
			int registrosInsertados;
			ps.setInt(1, cli.getId());
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No se ha podido eliminar el registro");
			}
			ps.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}

}
