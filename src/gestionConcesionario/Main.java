package gestionConcesionario;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			menuPrincipal();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void menuPrincipal() throws ParseException {
		Scanner sc;
		int opcion;
		do {
			System.out.println("GESTION DE VENTAS: " + "\n1.-Gestion de Fabricantes."
					+ "\n2.- Gestion de Concesionario." + "\n3.- Gestion de Clientes." + "\n4.- Gestion de Coches."
					+ "\n5.- Gestion de Ventas." + "\n Pulse 0 para salir");

			sc = new Scanner(System.in);

			opcion = sc.nextInt();
			System.out.println("opcion: " + opcion);

			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;

			case 1:
				GestionFabricante.menuGestion();

			case 2:
				GestionConcesionario.menu();

			case 3:
				GestionCliente.menu();

			case 4:
				GestionCoche.menu();

			case 5:
				GestionVenta.menu();

			default:
				if (opcion > 5 || opcion < 0) {
					System.out.println("Escoja una de las opciones del menú.");
				}

			}

			System.out.println();

		} while (opcion != 0);

	}

}
