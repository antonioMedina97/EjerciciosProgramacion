package examenB;

import toolbox.Utils;
import toolbox.UtilsArray;

public class EjerC {

	public static void main(String[] args) {
		int arrayPrimo[] = new int[20];
		int numero;
		boolean esPrimo;
		for (int i = 0; i < arrayPrimo.length; i++) {
			do {
				//Generar número a evaluar
				numero = Utils.generateRandomNum(1, 100);
				esPrimo = true;
				
				
				//Comprobar si todos los números entre 2 y él mismo menos 1
				//son divisores
				for (int j = 2; j < numero-1; j++) {
					
					//si hay divisores en numero es compuesto
					if (numero % j == 0) {
						
						esPrimo = false;
					}
				}
				
			} while (!esPrimo);
			//Se escribe en el array
			arrayPrimo[i] = numero;
			
		}
		UtilsArray.printArray(arrayPrimo);
	}

}
