package examenA;

import toolbox.Utils;
import toolbox.UtilsArray;

public class Ejer_D {

	public static void main(String[] args) {
		int arrayOrigen[]=UtilsArray.createRandomArray(5, 0, 100);
		System.out.println("Array Origen:");
		UtilsArray.printArray(arrayOrigen);
		
		int arrayNumerosSinRepetir[] = new int[arrayOrigen.length];
		int aux = 0;
		boolean estaRepetido = false;
		//Recorro array de posiciones hacia delante para asignar valores
		for (int i = 0; i < arrayNumerosSinRepetir.length; i++) {
			//Sacar número aleatorio sin repetir
			do {
				estaRepetido = false;
				aux = Utils.generateRandomNum(0, 4);
				//Recorrer para ver si está
				for (int j = 0; j < i; j++) {
					if (arrayNumerosSinRepetir[j] == aux) {
						estaRepetido = true; //Bandera para salir del bucle do while
					}
					
				}
			} while (estaRepetido);
			//Asignar valor al array
			arrayNumerosSinRepetir[i] = aux;
		}
		//Imprimir array de posiciones
		System.out.println("\nContenido array posiciones");
		UtilsArray.printArray(arrayNumerosSinRepetir);
		int arrayResultado[] = new int[arrayOrigen.length];
		//Asignar al array resultado valores
		for (int i = 0; i < arrayResultado.length; i++) {
			//Asignar los valores del array origen con índice los números del arrayNumerosSinRepetir
			arrayResultado[i] = arrayOrigen[arrayNumerosSinRepetir[i]];
		}
		//Imprimir resultado
		System.out.println("\nArray desordenado:");
		UtilsArray.printArray(arrayResultado);
	}

}
