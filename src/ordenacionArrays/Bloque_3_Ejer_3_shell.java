package ordenacionArrays;

import toolbox.UtilsArray;

public class Bloque_3_Ejer_3_shell {

	public static void main(String[] args) {
		int array[]= UtilsArray.createRandomArray(10, 0, 20);
		UtilsArray.printArray(array);
		int aux;
		boolean hayCambio = true;
		for (int salto = array.length / 2; salto != 0; salto /=2) {
			hayCambio=true;
			while(hayCambio) {
				hayCambio=false;
				for (int i = salto; i < array.length; i++) {
					if (array[i-salto]>array[i]) {
						aux = array[i-salto];
						array[i-salto] = array[i];
						array[i] = aux;
						hayCambio=true;
					}
				}
			}		
		}

		UtilsArray.printArray(array);
		
	}

}