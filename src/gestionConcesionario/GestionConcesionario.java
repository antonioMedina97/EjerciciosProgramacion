package gestionConcesionario;



import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import gestionConcesionario.modelo.Concesionario;
import gestionConcesionario.modelo.controladores.ControladorConcesionario;
import gestionConcesionario.modelo.controladores.ErrorBBDDException;

public class GestionConcesionario {

	public static void menu() throws ParseException  {
		Scanner sc;
		int opcion = -1;
		do {
			try {
				System.out.println("GESTION DE CONCESIONARIOS: "+
						"\n1.-Listado de Concesionarios."+
						"\n2.- Alta a un Concesionario."+
						"\n3.- Modificar un Concesionario."+
						"\n4.- Baja a un Concesionario."+					
						"\n Pulse 0 para salir");
				
					sc = new Scanner(System.in);
					opcion = sc.nextInt();
				switch (opcion) {
				case 1:
						listado();
					break;
				case 2:
						alta();
					break;
					
				case 3:
					modificacion();
					break;
					
				case 4:
					baja();
				
				case 0: Main.menuPrincipal(); 
				
				default: 
					if (opcion > 4 || opcion < 0) {
						System.out.println("Elija una de las opciones existentes...");
					}
				}
			}catch (ErrorBBDDException e) {
				System.out.println("Error de acceso a datos:" + e.getMessage()+"\n");
				e.printStackTrace();
			}
			
			
		}while (opcion != 0);

	}
	/**
	 * 
	 */	
	public static void listado() {
		List<Concesionario> concesionarios = ControladorConcesionario.getAll();
		System.out.println("Listado de concesionarios:\n");
		for (Concesionario conc : concesionarios) {
			System.out.println("\t"+ conc.toString());
		}
		
	}
	
	private static void alta() throws ErrorBBDDException {
		System.out.println("\nAlta de concesionario\n");
		Scanner sc = new Scanner(System.in);
		Concesionario conc = new Concesionario();
		System.out.println("Introduzca 'CIF' del concesionario:");
		conc.setCif(sc.nextLine());
		System.out.println("Introduzca 'nombre' del concesionario:");
		conc.setNombre(sc.nextLine());
		System.out.println("Introduzca 'localidad' del concesionario:");
		conc.setLocalidad(sc.nextLine());
		
		ControladorConcesionario.almacenar(conc);
	}
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Concesionario seleccionPorUsuario() throws ErrorBBDDException {
		Concesionario conc = null;
		int id = -2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca 'ID' del fabricante ('-1' - ver listado, '0' - salir):");
			id = sc.nextInt();
			
			if (id == -1) {
				listado();
			}
			else {
				if (id != 0) {
					conc = ControladorConcesionario.get(id);
					if(conc == null) {
						System.out.println("Error. ID invalido");
					}
				}
			}
		} while (conc == null && id != 0);
		return conc;
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion() throws ErrorBBDDException {
		System.out.println("\nModificación de concesionario\n");
		
		Concesionario conc = seleccionPorUsuario();
		Scanner sc = new Scanner(System.in);
		
		if (conc != null) {
			System.out.println("\nIntroduzca 'CIF' del concesionario ('Intro' para no modificar):");
			String str = sc.nextLine();
			if (!str.equals("")) {
				conc.setCif(str);
			}
			System.out.println("\nIntroduzca 'nombre' del concesionario ('Intro' para no modificar):");
			str = sc.nextLine();
			if (!str.equals("")) {
				conc.setNombre(str);
			}
			System.out.println("\nIntroduzca 'localidad' del concesionario ('Intro' para no modificar):");
			str = sc.nextLine();
			if (!str.equals("")) {
				conc.setLocalidad(str);
			} 
			
			ControladorConcesionario.almacenar(conc);
			System.out.println("Se ha modificado correctamente");
		}
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja() throws ErrorBBDDException {
		System.out.println("Baja de concesionario");
		Concesionario conc = seleccionPorUsuario();
			Scanner sc = new Scanner(System.in);
		if (conc != null) {
			System.out.println("¿Realmente desea eliminar este registro? (S/N)");
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("S")) {
				ControladorConcesionario.eliminar(conc);
				System.out.println("Se ha eliminado correctamente");
			}
		}
	}

}
