package ordenacionArrays;

import toolbox.UtilsArray;

public class Bloque_3_Ejer_1_ordenarBurbuja {

	public static void main(String[] args) {
		//Declarar array
		int array[]=UtilsArray.createRandomArray(10, 0, 9);
		int first, second;
		boolean hayCambios = false;
		UtilsArray.printArray(array);
		
		do {
			hayCambios = false;
			
			for (int i = 0; i < array.length-1; i++) {
				
				first = array[i];
				second = array[i + 1];
				if (second < first) {
					array[i] = second;
					array[i + 1] = first;
					hayCambios = true;
				
				}
			}
		}while(hayCambios);
		UtilsArray.printArray(array);
	}

}
