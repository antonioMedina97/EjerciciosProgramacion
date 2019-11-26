package examenB;

import toolbox.UtilsArray;

public class EjerE {

	public static void main(String[] args) {
		// Declare array
		int array[] = new int[100];
		// Introduce first two positions
		array[0] = 1;
		array[1] = 1;

		// Recorrer array hacia delante
		for (int i = 2; i < array.length; i++) {
			// Guardar en la posicion actual la suma de las dos anteriores
			array[i] = array[i - 1] + array[i - 2];
		}
		// Imprimir array
		System.out.println("Er fibonacci decía o siguiente:");
		UtilsArray.printArray(array);
	}

}
