package arrays;

import toolbox.UtilsArray;

public class Bloque_2_Ejer1_cambiarSigno {

	public static void main(String[] args) {
		int array[]=UtilsArray.createRandomArray(150, 100, -100);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {
			array[i] *= -1;
			
			System.out.print(array[i] + " ");
		}
	}
	/**
	 *
	 * @return
	 */
	public static int numAleatorio() {
		return (int) Math.round(Math.random()*(100 +(-100)))-100;
	}

}
