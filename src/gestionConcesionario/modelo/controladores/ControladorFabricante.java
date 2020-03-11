package gestionConcesionario.modelo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gestionConcesionario.modelo.Fabricante;

public class ControladorFabricante extends ControladorBBDD {

	
	public static List<Fabricante> getAll() throws ErrorBBDDException{
		List<Fabricante> fabricantes = new ArrayList<Fabricante>();
		
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from fabricante");
			
			while(rs.next()) {
				Fabricante f = new Fabricante();
				f.setId(rs.getInt("id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
				fabricantes.add(f);
			}
			s.close();
			
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
		
		return fabricantes;
		
	}
	
	public static Fabricante get (int id) throws ErrorBBDDException {
		Connection conn = null;
		Fabricante f = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from fabricante where id = " + id);
			
			if (rs.next()) {
				f = new Fabricante();
				f.setId(id);
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}
			s.close();
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
		return f;
		
	}
	
	private static void almacenarNuevo(Fabricante f) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement("INSERT INTO fabricante (id, cif, nombre) VALUES (?,?,?)");
			int registrosInsertados;
			
			ps.setInt(1, nextIdEnTabla(conn, "fabricante"));
			ps.setString(2, f.getCif());
			ps.setString(3, f.getNombre());
			
			registrosInsertados = ps.executeUpdate();
			
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException("No ha sido posible conectar con la base de datos");
			}
			
			ps.close();
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}
	
	private static void almacenarModificado(Fabricante f) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement(
					"update fabricante set cif = ?, nombre = ? where id = ?");
			int registrosInsertados;
			
			ps.setString(1, f.getCif());
			ps.setString(2, f.getNombre());
			ps.setInt(3, f.getId());
			
			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				System.out.println("No se ha podido modificar el registro");
			}
			ps.close();
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
			
		}
	}
	
	/**
	 * 
	 * @param fabricante
	 * @throws ErrorBBDDException
	 */
	public static void almacenar (Fabricante fabricante) throws ErrorBBDDException {
		if (get(fabricante.getId()) != null) { // Solo modificar
			almacenarModificado(fabricante);
		}
		else { // Crear nuevo objeto en la BBDD
			almacenarNuevo(fabricante);
		}
	}

	/**
	 * 
	 * @param f
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Fabricante f) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement(
					"delete from fabricante where id = ?");
			int registrosInsertados;
			
			ps.setInt(1, f.getId());
			
			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				System.out.println("No se ha podido eliminar el registro");
			}
			ps.close();
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
			
		}
	}
}
