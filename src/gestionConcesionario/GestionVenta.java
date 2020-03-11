package gestionConcesionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import gestionConcesionario.modelo.Venta;
import gestionConcesionario.modelo.controladores.ControladorVenta;
import gestionConcesionario.modelo.controladores.ErrorBBDDException;

public class GestionVenta {

	public static void menu() throws ParseException  {
		Scanner sc;
		int opcion = -1;
		do {
			try {
				System.out.println("GESTION DE VENTAS: "+
						"\n1.-Listado de Ventas."+
						"\n2.- Alta a una Venta."+
						"\n3.- Modificar una Venta."+
						"\n4.- Baja a una Venta."+					
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
					
				case 4: baja();


				
				case 0:	Main.menuPrincipal(); 
				
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
	
	private static void listado() throws ParseException {
		List<Venta> ventas = ControladorVenta.getAll();
		System.out.println("Listado de clientes:\n");
		for (Venta ven: ventas) {
			System.out.println("\t"+ ven.toString());
		}
		
	}
	
	private static void alta () throws ErrorBBDDException, ParseException {
		System.out.println("\n\tAlta de Venta"
				+ "\n");
		
		Venta ven = new Venta();
		
		do {
			System.out.print("\nIntroduzca 'id del cliente' de la venta ('-1' - ver lista de Fabricante, '0' - salir): ");
			ven.setIdCliente(Utils.getIntConsola(-1));
			
				if (ven.getIdCliente() == -1) {
				GestionCliente.listado(true);
				}
		}while (ven.getIdCliente() == -1);
		
		do {
			System.out.print("\nIntroduzca 'id del concesionario' de la venta ('-1' - ver lista de Fabricante, '0' - salir): ");
			ven.setIdConcesionario(Utils.getIntConsola(-1));
			
				if (ven.getIdConcesionario() == -1) {
				GestionConcesionario.listado();
				}
		}while (ven.getIdConcesionario() == -1);
		
		do {
			System.out.print("\nIntroduzca 'id del coche' de la venta ('-1' - ver lista de Fabricante, '0' - salir): ");
			ven.setIdCoche(Utils.getIntConsola(-1));
			
				if (ven.getIdCoche() == -1) {
				GestionCoche.listado();
				}
		}while (ven.getIdCoche() == -1);
		
		System.out.print("\nIntroduzca 'fecha' de la venta: ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ven.setFecha(sdf.parse(Utils.getStringConsola()));
		System.out.println("\nIntroduzca 'precio venta': ");
		ven.setPrecioVenta(Float.parseFloat(Utils.getStringConsola()));
		
		ControladorVenta.almacenar(ven);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}
	
	private static Venta seleccionPorUsuario() throws ErrorBBDDException, ParseException {
		Venta ven = null;
		int id = -2;
		
		do {
			System.out.println("Introduzca 'ID' de la Venta ('-1' - ver listado, '0' - salir):");
			id = Utils.getIntConsola(-1);
			
			if (id == -1) {
				listado();
			}
			else {
				if (id != 0) {
					ven = ControladorVenta.get(id);
					if(ven == null) {
						System.out.println("Error. ID invalido");
					}
				}
			}
		} while (ven == null && id != 0);
		return ven;
	}
	
	private static void modificacion () throws ErrorBBDDException, ParseException {
		System.out.println("\n\tModificación de Venta\n");
		
		Venta ven = seleccionPorUsuario();
		
		if (ven != null) {		
			System.out.print("\nIntroduzca 'idCliente' de la venta ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			if (!str.equals("")) 
				ven.setIdCliente(Integer.parseInt(str));
			System.out.print("\nIntroduzca 'idConcesionario' de la venta  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				ven.setIdConcesionario(Integer.parseInt(str));		
			System.out.print("\nIntroduzca 'idCoche' de la venta  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				ven.setIdCoche(Integer.parseInt(str));
			System.out.print("\nIntroduzca 'fecha' de la venta  ('Intro' para no modificar): ");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				ven.setFecha(sdf.parse(str));
			System.out.print("\nIntroduzca 'precio venta' de la venta  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				ven.setPrecioVenta(Float.parseFloat(str));
			
			ControladorVenta.almacenar(ven);  

			System.out.println("\n\tModificado correctamente!. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
	}
	
	private static void baja () throws ErrorBBDDException, ParseException {
		System.out.println("\n\tBaja de Venta\n");
		
		Venta ven = seleccionPorUsuario();
		
		if (ven != null) {		
			System.out.print("\n¿Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorVenta.eliminar(ven);  
				System.out.println("\n\tEliminado correctamente!. Pulse 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}

}
