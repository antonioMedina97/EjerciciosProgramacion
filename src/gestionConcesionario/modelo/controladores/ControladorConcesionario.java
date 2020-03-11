package gestionConcesionario.modelo.controladores;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gestionConcesionario.modelo.Concesionario;


public class ControladorConcesionario extends ControladorBBDD {

	public static List <Concesionario> getAll() {
		List<Concesionario> concesionarios = new ArrayList<Concesionario>();
			
			Connection conn = null;
			
			try {
				conn = ConnectionManagerV2.getConexion();
				
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("Select * from concesionario");
				
				while(rs.next()) {
					Concesionario c = new Concesionario();
					c.setId(rs.getInt(1));
					c.setCif(rs.getString(2));
					c.setNombre(rs.getString(3));
					c.setLocalidad(rs.getString(4));
					concesionarios.add(c);
				}
				rs.close();
				s.close();
				
			}catch (SQLException  | ImposibleConectarException e) {
				e.printStackTrace();
				
			}
		return concesionarios;
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 */
	
	public static Concesionario get (int id) throws ErrorBBDDException {
		Connection conn = null;
		Concesionario conc = null;
		
		try {
			conn =  ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from concesionario where id = " + id);
			
			if(rs.next()) {
				conc = new Concesionario();
				conc.setId(id);
				conc.setCif(rs.getString("cif"));
				conc.setNombre(rs.getString("nombre"));
				conc.setLocalidad(rs.getString("localidad"));
			}
			rs.close();
			s.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException();
		}
		
		return conc;
	}
	/**
	 * 
	 * @param conc
	 * @throws ErrorBBDDException
	 */
	private static void almacenarNuevo (Concesionario conc) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("insert into concesionario (id, cif, nombre, localidad) values (?,?,?,?)");
			int registrosInsertados;
			ps.setInt(1, nextIdEnTabla(conn, "concesionario"));
			ps.setString(2, conc.getCif());
			ps.setString(3, conc.getNombre());
			ps.setString(4, conc.getLocalidad());
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No ha sido posible insertadnir el nuevo registro");
			}
			ps.close();
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}
	/**
	 * 
	 * @param conc
	 * @throws ErrorBBDDException
	 */
	
	private static void almacenarModificado (Concesionario conc) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("update concesionario set cif = ?, nombre = ?, localidad = ? where id = ?");
			
			int registrosInsertados;
			ps.setString(1, conc.getCif());
			ps.setString(2, conc.getNombre());
			ps.setString(3, conc.getLocalidad());
			ps.setInt(4, conc.getId());
			
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No se ha podido modificar el registro");
			}
			ps.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}
	
	public static void almacenar (Concesionario conc) throws ErrorBBDDException {
		if (get(conc.getId()) != null) {
			almacenarModificado(conc);
		}
		else almacenarNuevo(conc);
	}
	/**
	 * 
	 * @param conc
	 * @throws ErrorBBDDException
	 */
	
	public static void eliminar (Concesionario conc) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("delete from concesionario where id = ?");
			
			int registrosInsertados;
			ps.setInt(1, conc.getId());
			
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
