package arrays;


import toolbox.Utils;
import toolbox.UtilsArray;

public class Bloque_2_Ejer_3_MultiplicarPorNum {

	public static void main(String[] args) {
		//Create array
		int array[] = UtilsArray.createRandomArray(6, 100, 0);
		
		//Print array
		System.out.println("Array inicial:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		//Request number
		int num = Utils.requestUserNumber("Introduzca número:");
		//Calculate
		System.out.println("Resultado:");
		for (int i = 0; i < array.length; i++) {
			array[i] *= num;
			System.out.print(array[i] + " ");
		}
	}

}
