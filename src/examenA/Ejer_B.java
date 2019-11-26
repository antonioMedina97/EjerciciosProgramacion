package examenA;

import toolbox.UtilsArray;

public class Ejer_B {

	public static void main(String[] args) {
		int array[] = UtilsArray.createRandomArray(5, 0, 100);
		
		//Mostrar hacia delante
		System.out.println("Array hacia delante");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Mostrar hacia atras
		System.out.println("\nArray hacia atrás");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
