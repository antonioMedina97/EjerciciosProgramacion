package matriz_bloque4;

import toolbox.Utils;
import toolbox.UtilsArray;

public class Bloque_4_Ejer_1_metodo {

	public static void main(String[] args) {
		boolean esPar = false;//bandera
		
		do {
			
			esPar = false;
			//Pedir numero usuario
			int longitud = Utils.requestUserNumber("Introduzca longitud del array: ");
			//Crear array
			int array[] = UtilsArray.createRandomArray(longitud, 0, 100);
			
			UtilsArray.printArray(array);
			System.out.println();

			
			if ((longitud % 2) == 0) {
				System.out.println("La longitud del array es par");
				esPar = true;
			}
			else {
				System.out.println("El valor medio es " + array[array.length / 2]);
			}
		}while(esPar);
	}

}
