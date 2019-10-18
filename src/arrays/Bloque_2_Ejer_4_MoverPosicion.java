package arrays;

import toolbox.UtilsArray;

public class Bloque_2_Ejer_4_MoverPosicion {

	public static void main(String[] args) {
		//Create array
		int array[] = UtilsArray.createNumberedArray(5);
		
		//Print array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Save first number
		int buffer = array[0];
		
		//Calculate
		for (int i = 0; i < array.length; i++) {
		
			if (i == 4) {
				array[i]=buffer;
			}
			else {
				array[i]=array[i+1];
			}
		}
		
		//Print result
		System.out.println("\nResultado:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	

}
