package gestionConcesionario;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import gestionConcesionario.modelo.Coche;
import gestionConcesionario.modelo.controladores.ControladorCoche;
import gestionConcesionario.modelo.controladores.ControladorFabricante;
import gestionConcesionario.modelo.controladores.ErrorBBDDException;

public class GestionCoche {

	public static void menu() throws ParseException  {
		Scanner sc;
		int opcion = -1;
		do {
			try {
				System.out.println("GESTION DE COCHES: "+
						"\n1.-Listado de Coches."+
						"\n2.- Alta a un Coche."+
						"\n3.- Modificar un Coche."+
						"\n4.- Baja a un Coche."+					
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
	 * @throws ErrorBBDDException 
	 * 
	 */
	public static void listado() throws ErrorBBDDException {
		List<Coche> coches = ControladorCoche.getAll();
		System.out.println("Listado de coches:\n");
		for (Coche co : coches) {
			System.out.println("\t"+ co.toString());
		}
		
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void alta() throws ErrorBBDDException {
		System.out.println("\nAlta de coche\n");
		Scanner sc = new Scanner(System.in);
		Coche co = new Coche();
		do {
			System.out.println("Introduzca 'id' del fabricante ('-1' - ver lista de Fabricante, '0' - salir):");
				co.setIdFabricante(Utils.getIntConsola(-1));
			
				if (co.getIdFabricante() == -1) {
				GestionFabricante.listado(true);
				}
		}while (co.getIdFabricante() == -1);		
				
			
		
		System.out.println("Introduzca 'bastidor' del coche:");
		co.setBastidor(sc.nextLine());
		System.out.println("Introduzca 'modelo' del coche:");
		co.setModelo(sc.nextLine());
		System.out.println("Introduzca 'color' del coche:");
		co.setColor(sc.nextLine());
		
		ControladorCoche.almacenar(co);
	}
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Coche seleccionPorUsuario() throws ErrorBBDDException {
		Coche co = null;
		int id = -2;		
		do {
			System.out.println("Introduzca 'ID' del coche ('-1' - ver listado, '0' - salir):");
			id = Utils.getIntConsola(-1);
			
			if (id == -1) {
				listado();
			}
			else {
				if (id != 0) {
					co = ControladorCoche.get(id);
					if(co == null) {
						System.out.println("Error. ID invalido");
					}
				}
			}
		} while (co == null && id != 0);
		return co;
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion() throws ErrorBBDDException {
		System.out.println("\nModificación de coche\n");
		
		Coche co = seleccionPorUsuario();
		
		
		if (co != null) {				
			String str = Utils.getStringConsola();
			
			do {
				System.out.println("Introduzca 'id' del fabricante ('-1' - ver lista de Fabricante, '0' - salir):");
					co.setIdFabricante(Utils.getIntConsola(-1));
				
					if (co.getIdFabricante() == -1) {
					GestionFabricante.listado(true);
					}
			}while (co.getIdFabricante() == -1);
			
			if (!str.equals("")) {
				co.setIdFabricante(Integer.parseInt(str));
			}
			System.out.println("\nIntroduzca 'bastidor' del coche ('Intro' para no modificar):");
			str = Utils.getStringConsola();
			if (!str.equals("")) {
				co.setBastidor(str);
			}
			System.out.println("\nIntroduzca 'modelo' del coche ('Intro' para no modificar):");
			Utils.getStringConsola();
			if (!str.equals("")) {
				co.setModelo(str);
			}
			System.out.println("\nIntroduzca 'color' del concesionario ('Intro' para no modificar):");
			Utils.getStringConsola();
			if (!str.equals("")) {
				co.setColor(str);
			} 
			
			ControladorCoche.almacenar(co);
			System.out.println("Se ha modificado correctamente");
		}
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja() throws ErrorBBDDException {
		System.out.println("Baja de coche");
		Coche co = seleccionPorUsuario();
			Scanner sc = new Scanner(System.in);
		if (co != null) {
			System.out.println("¿Realmente desea eliminar este registro? (S/N)");
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("S")) {
				ControladorCoche.eliminar(co);
				System.out.println("Se ha eliminado correctamente");
			}
		}
	}

}
