package gestionConcesionario.modelo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gestionConcesionario.modelo.Coche;
import gestionConcesionario.modelo.Fabricante;


public class ControladorCoche extends ControladorBBDD {

	
	public static List<Coche> getAll() throws ErrorBBDDException{
		List<Coche> coches = new ArrayList<Coche>();
		
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from coche");
			
			while(rs.next()) {
				Coche c = new Coche();
				c.setId(rs.getInt("id"));
				c.setIdFabricante(rs.getInt("idFabricante"));
				c.setBastidor(rs.getString("bastidor"));
				c.setModelo(rs.getString("modelo"));
				c.setColor(rs.getString("color"));
				coches.add(c);
			}
			s.close();
			
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
		
		return coches;
		
	}
	
	public static Coche get (int id) throws ErrorBBDDException {
		Connection conn = null;
		Coche c = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from coche where id = " + id);
			
			if (rs.next()) {
				c = new Coche();
				c.setId(rs.getInt("id"));
				c.setIdFabricante(rs.getInt("idFabricante"));
				c.setBastidor(rs.getString("bastidor"));
				c.setModelo(rs.getString("modelo"));
				c.setColor(rs.getString("color"));
				
			}
			s.close();
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
		return c;
		
	}
	
	private static void almacenarNuevo(Coche c) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement("INSERT INTO `tutorialjavacoches`.`coche`" + 
							"(`id`," + 
							"`idfabricante`," + 
							"`bastidor`," + 
							"`modelo`," + 
							"`color`)" + 
							"VALUES" + 
							"(?, ?, ?, ?, ?);");
			int registrosInsertados;
			
			ps.setInt(1, nextIdEnTabla(conn, "coche"));
			ps.setInt(2, c.getIdFabricante() /*TODO METODO MOSTRAR FABRICANTES*/);
			ps.setString(3, c.getBastidor());
			ps.setString(4, c.getModelo());
			ps.setString(5, c.getColor());
			
			registrosInsertados = ps.executeUpdate();
			
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException("No ha sido posible conectar con la base de datos");
			}
			
			ps.close();
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}
	
	private static void almacenarModificado(Coche c) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement(
					"update coche set idFabricante = ?, bastidor = ?, modelo = ?, color = ? where id = ?");
			int registrosInsertados;
			
			ps.setInt(1, c.getIdFabricante());
			ps.setString(2, c.getBastidor());
			ps.setString(3, c.getModelo());
			ps.setString(4, c.getColor());
			ps.setInt(5, c.getId());
			
			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				System.out.println("No se ha podido modificar el registro");
			}
			ps.close();
		} catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
			
		}
	}
	
	public static void almacenar (Coche c) throws ErrorBBDDException {
		if (get(c.getId()) != null) { // Solo modificar
			almacenarModificado(c);
		}
		else { // Crear nuevo objeto en la BBDD
			almacenarNuevo(c);
		}
	}
	
	public static void eliminar (Coche c) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement)
					conn.prepareStatement(
					"delete from coche where id = ?");
			int registrosInsertados;
			
			ps.setInt(1, c.getId());
			
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
