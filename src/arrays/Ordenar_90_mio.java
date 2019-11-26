package arrays;

import toolbox.Utils;

public class Ordenar_90_mio {

	public static void main(String[] args) {
		int array[] = new int[5];
		boolean isOnArray = false;
		
		for (int i = 0; i < array.length; i++) {
			int aux;
		
			do {
				aux = Utils.generateRandomNum(0, 5);
				isOnArray = false;
				for (int j = 0 ; j < i; j++) {
					
					if (array[j] == aux) {
						isOnArray = true;
					}
					
				}
			} while (isOnArray);
			array[i] = aux;
			System.out.print(array[i] + " ");
			
		}
	}
	
}
