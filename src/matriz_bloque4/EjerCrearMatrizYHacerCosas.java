package matriz_bloque4;

import toolbox.Utils;

public class EjerCrearMatrizYHacerCosas {

	public static void main(String[] args) {
		int longitud = Utils.requestUserNumber("Introduzca longitud del array");
		
		int matriz[][] = new int[longitud][longitud];
		Bloque_4_Ejer_4_matriz.crearMatrizAleatoria(matriz, 0, 100);
		Bloque_4_Ejer_4_matriz.printMatrix(matriz);
		
		int number = Utils.requestUserNumber("Introduzca fila/columna o lo que sea que yo quiera hacer jaja salu2");
		
		sumarFila(matriz, number);
		sumaColumna(matriz, number);
		sumaDiagonalPrincipal(matriz);
		sumaDiagonalInversa(matriz);
		mediaMatriz(matriz);
		
	}
	
	public static void sumarFila(int matriz[][], int number) {
		if (number > matriz.length ) {
			System.out.println("El número es mayor que la longitud de la matriz, try again");
			return;
		}
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma += matriz[number][i];
		}
		System.out.println("La suma de la fila " + number + " es igual a " + suma);
	}
	
	public static void sumaColumna(int matriz[][], int number) {
		if (number > matriz.length ) {
			System.out.println("El número es mayor que la longitud de la matriz, try again");
			return;
		}
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma += matriz[i][number];
		}
		System.out.println("La suma de la columna " + number + " es igual a " + suma);
	}
	
	public static void sumaDiagonalPrincipal(int matriz[][]) {

		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					suma += matriz[i][j];
				}
			}
		}
		System.out.println("La suma de la diagonal principal es igual a " + suma);
	}

	public static void sumaDiagonalInversa(int matriz[][]) {

		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i+j) == matriz.length) {
					suma += matriz[i][j];
				}
			}
		}
		System.out.println("La suma de la diagonal inversa es igual a " + suma);
	}
	
	public static void mediaMatriz(int matriz[][]) {
		int contador = 0;
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
				contador++;

			}
		}
		System.out.println("La media es igual a " + suma / contador);
	}

}
