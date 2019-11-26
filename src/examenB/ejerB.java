package examenB;

import toolbox.Utils;

public class ejerB {

	public static void main(String[] args) {
		// Generar número a evaluar
		int numero =3;
		// Imprimir el número
		System.out.println("número a examinar: " + numero);
		// Comprobar si todos los números entre 2 y él mismo menos 1
		// son divisores
		for (int i = 2; i < numero - 1; i++) {
			// si hay divisores en numero es compuesto
			if (numero % i == 0) {
				// Se imprime y se acaba aquí el programa
				System.out.println("\nEl número es compuesto");
				return;
			}
		}
		// Si el número no es compuesto, es primo
		System.out.println("\nEl número es primo");
	}

}
