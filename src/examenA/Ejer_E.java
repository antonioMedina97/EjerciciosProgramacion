package examenA;

import toolbox.Utils;
import toolbox.UtilsArray;

public class Ejer_E {

	public static void main(String[] args) {
		//Declarar array
		int array[] = new int[20];
		int aux = 0;
		boolean estaRepetido = false;
		for (int i = 0; i < array.length; i++) {
			//Sacar número aleatorio sin repetir
			do {
				estaRepetido = false;
				aux = Utils.generateRandomNum(0, 40);
				//Recorrer para ver si está
				for (int j = 0; j < i; j++) {
					if (array[j] == aux) {
						estaRepetido = true; //Bandera para salir del bucle do while
					}
					
				}
			} while (estaRepetido);
			//Asignar valor al array
			array[i] = aux;
		
		}
		//Imprimir el array
		UtilsArray.printArray(array);
	}

}
