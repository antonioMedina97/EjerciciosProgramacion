package arrays;

import toolbox.UtilsArray;

public class Bloque_2_Ejer_2_DosArray {

	public static void main(String[] args) {
		//Create arrays
		int arrayImpar[]=UtilsArray.createRandomArray(6, 100, 0);
		int arrayPar[]=UtilsArray.createRandomArray(6, 100, 0);
		int arrayResult[] = new int[6];
		
		//Print arrays
		System.out.println("Array Impar");
		for (int i = 0; i < arrayPar.length; i++) {
			System.out.print(arrayImpar[i]+ " ");
			
		}
		System.out.println("\nArray Par");
		
		for (int i = 0; i < arrayPar.length; i++) {
			System.out.print(arrayPar[i]+ " ");
			
		}
		
		
		//Intentar resolver el ejercicio sin éxito
		
		//Asignar valores impares
		
		for (int i = 0; i < arrayResult.length; i += 2) {
			arrayResult[i] = arrayImpar[i];
			
		}
		
		//Asignar valores pares
		for (int i = 1; i < arrayResult.length; i += 2) {
			arrayResult[i] = arrayPar[i];
			
		}
		
		//Imprimir Resultado
		System.out.println("\nResultado");
		for (int i = 0; i < arrayResult.length; i++) {
			System.out.print(arrayResult[i] + " ");
			
		}
		
		
	}

}
