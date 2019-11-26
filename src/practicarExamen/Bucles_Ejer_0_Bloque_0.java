package practicarExamen;

import toolbox.Utils;
import toolbox.UtilsArray;

public class Bucles_Ejer_0_Bloque_0 {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		//Crear array
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.generateRandomNum(0, 100);
		}
		
		UtilsArray.printArray(array);
		
		//Suma
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		System.out.println("La suma es igual a: " + suma);
		
		//Media
		System.out.println("La media es igual a:" + (suma/array.length));
		
		//Menor
		int menor = 0, mayor = 0;
		for (int i = 0; i < array.length; i++) {
			//Asignar primer valor del array a la variable
			if (i == 0) {
				menor = array[i];
				mayor = array[i];
			}
			//Comparar array con variable
			if (menor > array[i]) {
				menor = array[i];
			}
			if (mayor < array[i]) {
				mayor = array[i];
			}
			
			
		}
		
		System.out.println("El menor es " + menor + " y el mayor es " + mayor);
	}

}
