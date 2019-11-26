package ordenacionArrays;

import toolbox.UtilsArray;

public class Bloque_3_Ejer_4_seleccion {

	public static void main(String[] args) {
		int array[] = UtilsArray.createRandomArray(10, 0, 20);
		UtilsArray.printArray(array);
		int min, j;
		
		for (int i = 0; i < array.length; i++) {
			min = i; //Asignar a una variable el primer numero
			//Recorrer array buscando el menor
			for ( j = i; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;//Guardar el número menor
				}
			}
			int aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		UtilsArray.printArray(array);
	}

}
