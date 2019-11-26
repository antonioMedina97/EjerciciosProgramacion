package arrays;

import toolbox.Utils;
import toolbox.UtilsArray;

public class Desordenar_Aleatorio {

	public static void main(String[] args) {
		int array[] = new int[5], arrayOrdered[] = UtilsArray.createRandomArray(5, 1, 10), arrayResult[] = new int[5];
		int num = Utils.generateRandomNum(1, 5);
		//Generate random array
		System.out.println("Numeros aleatorios");
		for (int i = 0; i < array.length; i++) {
			
		
			while(isOnArray(num, array)) {
				num = Utils.generateRandomNum(1, 5);
				
			}
			array[i] = num;
			System.out.print((array[i] - 1) + " ");
		}
		
		//Print ordered array
		System.out.println();
		System.out.println("Array ordenado");
		for (int i = 0; i < arrayOrdered.length; i++) {
			System.out.print(arrayOrdered[i] + " ");
		}
		
		//Scramble array
		System.out.println();
		System.out.println("Array desordenado");
		for (int i = 0; i < arrayResult.length; i++) {
			arrayResult[i] = arrayOrdered[array[i]-1];
			System.out.print(arrayResult[i] + " ");
			
		}
	}

	
	
	public static boolean isOnArray(int num, int array[]) {
		for (int i = 0; i < array.length; i++) {
				
			if (num == array[i]) {
				return true;
			}
		}
		return false;
		
	}
}
