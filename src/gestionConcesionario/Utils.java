package gestionConcesionario;

import java.util.Scanner;

public class Utils {

	private static Scanner scanner = null;
	
	
	public static Scanner getScanner() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	
	public static int getIntConsola(int min, int max) {
		boolean numeroValido = false;
		int numero = 0;
		
		do {
			try {
				numero = Integer.parseInt(getScanner().nextLine());
					if (numero >= min && numero <= max) {
						numeroValido = true;
					}
				}catch (Exception e) {
					if (!numeroValido) System.out.println("Número incorrecto. Debe introducir un numero entre el "+ min+ "y el "+ max);
				}
		} while (!numeroValido);
		
		return numero;
	}
	/**
	 * 
	 * @param minimo
	 * @return
	 */
	
	public static int getIntConsola(int minimo) {
		boolean numeroValido = false;
		int numero = 0;
		
		do {
			try {
				numero = Integer.parseInt(getScanner().nextLine());
					if (numero >= minimo) {
						numeroValido = true;
					}
				}catch (Exception e) {
					if (!numeroValido) System.out.println("Número incorrecto. Debe introducir un numero mayor de "+ minimo);
				}
		} while (!numeroValido);
		
		return numero;
	}
	/**
	 * 
	 * @return
	 */
	
	public static String getStringConsola() {
		return getScanner().nextLine();
	}
	/**
	 * 
	 */
	
	public static void pausa() {
		getScanner().nextLine();
	}
	
	

}
