package arrays;

import toolbox.UtilsArray;

public class Ordenar_Array_primeroImpares_segundoPares {

	public static void main(String[] args) {
		
		//Declaración de variables y asignación de números al array
		int array[]=UtilsArray.createRandomArray(10, 0, 50);
		int auxArray[] = new int[10];
		int aux = 0;
		
		//Imprimir el array principal
		UtilsArray.printArray(array);
		int contador = 0;
		
		//Guardar impares en array auxiliar
		for (int i = 0; i < array.length; i++) {
			
			if ((array[i] % 2) != 0) {
				aux = array[i];
				auxArray[contador] = aux;
				contador++;
			}
		}
		
		//Imprimir número de impares
		System.out.print("\n\nNúmero de impares");
		System.out.println("\n" + contador);			
		
		//Guardar pares en auxiliar
		for (int i = 0; i < auxArray.length; i++) {
			if ((array[i] % 2) == 0) {
				aux = array[i];
				auxArray[contador] = aux;
				contador++;
			}
		}
		//Asignar valores al array requerido
		for (int i = 0; i < auxArray.length; i++) {
			array[i]=auxArray[i];
		}
		
		//Imprimir array
		UtilsArray.printArray(array);
	}
}
