package ordenacionArrays;

import toolbox.UtilsArray;

public class Bloque_3_Ejer_2_InsercionDirecta {

	public static void main(String[] args) {
		//Declarar array
		int array[] = UtilsArray.createRandomArray(10, 0, 10);
		int num, j;
		UtilsArray.printArray(array);
		//Recorrer array de izquierda a derecha
		for (int i = 0; i < array.length; i++) {
		
			//Guardar valor para compararlo
			num = array[i];
			
			//Recorrer array hacia atrás comparando
			for (j = i; j > 0 && array[j-1] > num; j--) {
				array[j] = array[j - 1];
			}
			array[j] = num;
		}
		UtilsArray.printArray(array);
	}

}
