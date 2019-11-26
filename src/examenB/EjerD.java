package examenB;

import toolbox.Utils;
import toolbox.UtilsArray;

public class EjerD {

	public static void main(String[] args) {
		//Creo el array
		int array[] = new int[100];
		//Creo array auxiliar
		int arrayPosiciones[]= new int[10];
		//Crear bandera
		boolean bandera = false;
		int posicion;
		for (int i = 0; i <= 10; i++) {
			
			do {
				posicion = Utils.generateRandomNum(0, array.length-1);
				for (int j = 0; j < i; j++) {
					if(arrayPosiciones[j] == posicion) bandera = true;
				}
			} while (bandera);
			arrayPosiciones[i] = posicion;
		}
		UtilsArray.printArray(arrayPosiciones);
	}

}
