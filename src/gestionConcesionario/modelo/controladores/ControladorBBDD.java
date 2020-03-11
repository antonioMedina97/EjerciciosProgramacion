package gestionConcesionario.modelo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class ControladorBBDD {

	protected static SimpleDateFormat sdfMySQL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 
	 */
	protected static void iniciaConnectionPool() {
		//Creación de un nuevo hilo para arrancar la conexión
		//de la conection pool de oracle.
		//En una clase anónima se instancia la clase y se pide
		//una conexión.
		Thread conexionUCP = new Thread(new Runnable() {
			
			@Override
			public void run() {
			try {
				ConnectionManagerV2.getConexion();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ImposibleConectarException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		});
		conexionUCP.start();
	}
	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	protected static int nextIdEnTabla(Connection conn, String tabla)	throws SQLException{
		return maxIdEnTabla(conn, tabla) + 1;
	}
	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	protected static int maxIdEnTabla (Connection conn, String tabla) throws SQLException{
		PreparedStatement ps = conn.prepareStatement("select max(id) from " + tabla);
		
		int max = 1;
		if (ps != null) {
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				max = rs.getInt(1);
			}
			rs.close();
		}
		return max;
	}
	
	protected static int eliminarTodoEnTabla() throws ErrorBBDDException{
		Connection conn = null;
		
		try {
			Statement s = conn.createStatement();
			int registrosModificados = s.executeUpdate("delete from " + JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME") + ".actor");
			s.close();
			return registrosModificados;
		} catch (SQLException e) {
			throw new ErrorBBDDException(e);
		}
		
		
	}
	
}
