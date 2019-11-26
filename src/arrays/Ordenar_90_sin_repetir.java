package arrays;

import toolbox.Utils;

public class Ordenar_90_sin_repetir {

	public static void main(String[] args) {
		int array[] = new int[5];
		int aux = Utils.generateRandomNum(0, 5);
		
		for (int i = 0; i < array.length; i++) {
			
			while(estaEnArray(aux, array) == true) {	
				aux = Utils.generateRandomNum(0, 5);
				
			}
			
			array[i]=aux;
			
			System.out.print(array[i] + " ");
		}
	}
/**
 * 
 */
	public static boolean estaEnArray(int num, int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}
	
}
