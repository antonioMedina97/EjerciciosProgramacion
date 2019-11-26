package examenA;

import toolbox.Utils;
import toolbox.UtilsArray;

public class ejer_c {
	
	public static void main(String[] args) {
		//Declaro el array
		int array[] = new int[5];
		//recorro el array
		for (int i = 0; i < array.length; i++) {
			boolean esImpar = true;
			//comprobar si son pares y asignar
			do {
			int aux = Utils.generateRandomNum(25, 100);	//obtener numero
			if ((aux & 1) == 0) { //si es par
				array[i] = aux; //asignar el valor al array
				esImpar = false; //y cambiar la bandera
			}
			} while (esImpar);
			
		}
		//Imprimir resultado
		UtilsArray.printArray(array);
	}
}
