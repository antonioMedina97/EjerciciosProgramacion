package gestionConcesionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import gestionConcesionario.modelo.Cliente;
import gestionConcesionario.modelo.controladores.ControladorCliente;
import gestionConcesionario.modelo.controladores.ErrorBBDDException;

public class GestionCliente {

	public static void menu() throws ParseException  {
		Scanner sc;
		int opcion = -1;
		do {
			try {
				System.out.println("GESTION DE CLIENTES: "+
						"\n1.-Listado de Clientes."+
						"\n2.- Alta a un Cliente."+
						"\n3.- Modificar un Cliente."+
						"\n4.- Baja a un Cliente."+					
						"\n Pulse 0 para salir");
				
					sc = new Scanner(System.in);
					opcion = sc.nextInt();
				switch (opcion) {
				case 1:
						listado(true);
					break;
				case 2:
						alta();
					break;
					
				case 3:
					modificacion();
					break;
					
				case 4: baja();


				
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
	 * @throws ParseException 
	 * 
	 */
	public static void listado(boolean pausafinal) throws ParseException {
		List<Cliente> clientes = ControladorCliente.getAll();
		System.out.println("Listado de clientes:\n");
		for (Cliente cli: clientes) {
			System.out.println("\t"+ cli.toString());
		}
		
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
	private static void alta () throws ErrorBBDDException, ParseException {
		System.out.println("\n\tAlta de cliente\n");
		
		Cliente cli = new Cliente();
		System.out.print("\nIntroduzca 'Nombre' del cliente: ");
		cli.setNombre(Utils.getStringConsola());
		System.out.print("\nIntroduzca 'Apellidos' del cliente: ");
		cli.setApellidos(Utils.getStringConsola());		
		System.out.print("\nIntroduzca 'Localidad' del cliente: ");
		cli.setLocalidad(Utils.getStringConsola());
		System.out.print("\nIntroduzca 'DNI/NIE' del cliente: ");
		cli.setDni(Utils.getStringConsola());
		System.out.print("\nIntroduzca 'Fecha de Nacimiento dd/MM/aaaa' del cliente: ");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		cli.setFechaNac(sdf.parse(Utils.getStringConsola()));
		
		
		
		ControladorCliente.almacenar(cli);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
	private static Cliente seleccionPorUsuario() throws ErrorBBDDException, ParseException {
		Cliente cli = null;
		int id = -2;
		
		do {
			System.out.println("Introduzca 'ID' del Cliente ('-1' - ver listado, '0' - salir):");
			id = Utils.getIntConsola(-1);
			
			if (id == -1) {
				listado(true);
			}
			else {
				if (id != 0) {
					cli = ControladorCliente.get(id);
					if(cli == null) {
						System.out.println("Error. ID invalido");
					}
				}
			}
		} while (cli == null && id != 0);
		return cli;
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
	private static void modificacion () throws ErrorBBDDException, ParseException {
		System.out.println("\n\tModificación de cliente\n");
		
		Cliente cli = seleccionPorUsuario();
		
		if (cli != null) {		
			System.out.print("\nIntroduzca 'Nombre' del cliente ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			if (!str.equals("")) 
				cli.setNombre(str);
			System.out.print("\nIntroduzca 'Apellidos' del cliente  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				cli.setApellidos(str);			
			System.out.print("\nIntroduzca 'Localidad' del cliente  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				cli.setLocalidad(str);
			System.out.print("\nIntroduzca 'DNI/NIE' del cliente  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				cli.setDni(str);
			System.out.print("\nIntroduzca 'Fecha de Nacimiento' del cliente  ('Intro' para no modificar): ");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String fecha;
			fecha = Utils.getStringConsola();
			if (!str.equals("")) {
				cli.setFechaNac(sdf.parse(fecha));
			}
			
			
			ControladorCliente.almacenar(cli);  

			System.out.println("\n\tModificado correctamente!. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
	}
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
	private static void baja () throws ErrorBBDDException, ParseException {
		System.out.println("\n\tBaja de cliente\n");
		
		Cliente cli = seleccionPorUsuario();
		
		if (cli != null) {		
			System.out.print("\n¿Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorCliente.eliminar(cli);  
				System.out.println("\n\tEliminado correctamente!. Pulse 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}

}
