package gestionConcesionario.modelo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import gestionConcesionario.modelo.Coche;
import gestionConcesionario.modelo.Concesionario;
import gestionConcesionario.modelo.Venta;

public class ControladorVenta extends ControladorBBDD{

	public static List<Venta> getAll() throws ParseException{
		List<Venta> ventas = new ArrayList<Venta>();
		
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from venta");
			
			while(rs.next()) {
				Venta ven = new Venta();
				ven.setId(rs.getInt("id"));
				ven.setIdCliente(rs.getInt("idCliente"));
				ven.setIdConcesionario(rs.getInt("idConcesionario"));
				ven.setIdCoche(rs.getInt("idCoche"));
				ven.setFecha(rs.getDate("fecha"));
				ven.setPrecioVenta(rs.getFloat("precioVenta"));
				
				ventas.add(ven);
			}
			rs.close();
			s.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			e.printStackTrace();
		}
		return ventas;
		
	}
	
	public static Venta get (int id) throws ErrorBBDDException, ParseException {
		Connection conn = null;
		Venta ven = null;
		
		try {
			conn =  ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from venta where id = " + id);
			
			if(rs.next()) {
				ven = new Venta();
				ven.setId(id);				
				ven.setIdCliente(rs.getInt("idCliente"));
				ven.setIdConcesionario(rs.getInt("idConcesionario"));
				ven.setIdCoche(rs.getInt("id"));
				ven.setFecha(rs.getDate("fecha"));
				ven.setPrecioVenta(rs.getFloat("precioVenta"));
				
			}
			rs.close();
			s.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException();
		}
		
		return ven;
	}
	
	private static void almacenarNuevo (Venta ven) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("insert into venta (id, idCliente, idConcesionario, idCoche, fecha, precioVenta) values (?,?,?,?,?,?)");
			int registrosInsertados;
			ps.setInt(1, nextIdEnTabla(conn, "venta"));
			ps.setInt(2, ven.getIdCliente());
			ps.setInt(3, ven.getIdConcesionario());
			ps.setInt(4, ven.getIdCoche());
			ps.setString(5, ven.getFecha());
			ps.setFloat(6, ven.getPrecioVenta());
			
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No ha sido posible insertar el nuevo registro");
			}
			ps.close();
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}		
		
	}
	
	private static void almacenarModificado (Venta ven) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("update venta set idCliente = ?, idConcesionario = ?, idCoche = ?, fecha = ?, precioVenta = ? where id = ?");
			
			int registrosInsertados;
			ps.setInt(1, ven.getIdCliente());
			ps.setInt(2, ven.getIdConcesionario());
			ps.setInt(3, ven.getIdCoche());
			ps.setString(4, ven.getFecha());
			ps.setFloat(5, ven.getPrecioVenta());
			ps.setInt(6, ven.getId());
			
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No se ha podido modificar el registro");
			}
			ps.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}
	
	public static void almacenar (Venta ven) throws ErrorBBDDException, ParseException {
		if (get(ven.getId()) != null) {
			almacenarModificado(ven);
		}
		else almacenarNuevo(ven);
	}
	
	public static void eliminar (Venta ven) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("delete from venta where id = ?");
			
			int registrosInsertados;
			ps.setInt(1, ven.getId());
			
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
