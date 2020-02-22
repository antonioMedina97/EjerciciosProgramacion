package gestionFabricantes;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void menu(Connection conn) throws SQLException {

		System.out.println("\t\tGESTION DE FABRICANTES");
		System.out.println();
		System.out.println("\t1.Listar Fabricantes");
		System.out.println("\t2.Añadir Fabricantes");
		System.out.println("\t3.Eliminar Fabricantes");
		System.out.println("\t4.Modificar Fabricantes");

		Scanner sc = new Scanner(System.in);

		switch (sc.nextInt()) {
		case 1: getListaFabricantes(conn); break;
		case 2: addFabricante(conn); break;
		case 3: deleteFabricante(conn); break;
		case 4: modifyFabricante(conn);
		default:
			break;
		}

	}

	/**
	 * This method uses a Oracle's connection pool class to reach the database and
	 * prints every column received
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	public static void getListaFabricantes(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		ResultSet rs = s.executeQuery("select * from fabricante");

		while (rs.next()) {
			System.out.println("ID: " + rs.getInt(1) + "\tCIF: " + rs.getString(2) + "\tNombre: " + rs.getString(3));
		}

		rs.close();
		s.close();
	}

	public static void addFabricante(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca ID");
		String id = sc.nextLine();
		
		System.out.println("Introduzca CIF");
		String cif = sc.nextLine();
		
		System.out.println("Introduzca Nombre");
		String nombreF = sc.nextLine();
		
		String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " +

				"VALUES  ('" + id + "', '" + cif + "', '" + nombreF + "')";
		s.execute(sql);
		s.close();

	}
	
	public static void deleteFabricante(Connection conn) throws SQLException {
		
		Statement s = (Statement) conn.createStatement();
		
	
		int id = getIdEnTabla(conn);
		
		
		String sql = "DELETE FROM tutorialjavacoches.fabricante F WHERE F.id = " + id + ";";
		
		s.execute(sql);
		
		System.out.println("Fabricante con ID " + id + " eliminado.");
		s.close();
		
	}	
	
	public static void modifyFabricante(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca id del fabricante a modificar");
		String sql;
		int idEnTabla = getIdEnTabla(conn);
		boolean isCIFEdited = true, isNameEdited = true;
		
		System.out.println("Introduzca nueva ID, 0 para no modificar");
		int id = sc.nextInt();
		if (id == 0) {
			id = idEnTabla;
		}
		
		
		
		System.out.println("Introduzca nuevo CIF, 0 para no modificar");
		String cif = sc.nextLine();
		if (cif.equals(String.valueOf(0))) {
			isCIFEdited = false;
		}
		
		
		System.out.println("Introduzca Nombre, 0 para no modificar");
		String nombreF = sc.nextLine();
		if (nombreF.equals(String.valueOf(0))) {
			isNameEdited = false;
		}
		
		
		if (isCIFEdited && isNameEdited) {
			sql = "UPDATE tutorialjavacoches.fabricante SET id = '" + id + "', cif= '" + cif + "', nombre= '" + nombreF + "' WHERE id = "+ idEnTabla +";";
		}
		else {
			if (isCIFEdited) {
				sql = "UPDATE tutorialjavacoches.fabricante SET id = '" + id + "', cif= '" + cif + "' WHERE id = "+ idEnTabla +";";	
			}
			else {
				sql = "UPDATE tutorialjavacoches.fabricante SET id = '" + id + "',  nombre= '" + nombreF + "' WHERE id = "+ idEnTabla +";";
			}
		}
		s.execute(sql);
		s.close();

	}
	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	private static int getIdEnTabla (Connection conn) throws SQLException {
		
		Statement s = (Statement) conn.createStatement();
		ResultSet rs;
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca ID");
		
		int id = sc.nextInt();
		
		boolean idValido = true;
		int idEnTabla = 0;
		
		do {
			rs = s.executeQuery("select id from tutorialjavacoches.fabricante order by id");
			while (rs.next()) {
			
				idValido = false;
				if (id == rs.getInt(1)) {
					System.out.println("El id existe en la tabla");
					idValido = true;
					idEnTabla = rs.getInt(1);
				}
				
			}
		} while (!idValido);
		
		rs.close();
		s.close();
		return idEnTabla;
	}


	public static void main(String[] args) {

		
		do {
			try {
				Connection conn;
				conn = ConnectionManagerV2.getConexion();

				menu(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ImposibleConectarException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while (true);

	}

}
