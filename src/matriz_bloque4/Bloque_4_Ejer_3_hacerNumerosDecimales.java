package matriz_bloque4;

import toolbox.Utils;
import toolbox.UtilsArray;

public class Bloque_4_Ejer_3_hacerNumerosDecimales {
	
	

	public static void main(String[] args) {
		
		//Crear variables
		int arrayEntero[] = UtilsArray.createRandomArray(20, 0, 100);
		float arrayDecimal[] = createRandomArrayFloat(20, 0, 100);
		float arrayResultado[] = new float[20];
		int aux = 0, contador = 0;
		float auxFloat = 0;
		
		//Mostrar array entero
		System.out.println("Contenido Array Entero");
		for (int i = 0; i < arrayEntero.length; i++) {
			System.out.print(arrayEntero[i] + " ");
		}
		
		
		//Crear decimales
		for (int i = 0; i < arrayDecimal.length; i++) {
			arrayDecimal[i] /= 100;
		}
		
		//Imprimir array decimal
		System.out.println();
		System.out.println("Contenido Array Decimal");
		for (int i = 0; i < arrayDecimal.length; i++) {
			System.out.print(arrayDecimal[i] + " ");
		}
		//Unir los array
		for (int i = 0; i < arrayResultado.length; i++) {
			arrayResultado[i] = arrayEntero[i] + (arrayDecimal[i]);
			
		}
		
		//Imprimir resutado
		System.out.println();
		System.out.println("Contenido array resultado");
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.print(arrayResultado[i] + " ");
		}
		
		for (int i = 0; i < arrayResultado.length; i++) {
			aux = (int) arrayResultado[i]; //guardo la parte entera
			auxFloat = arrayResultado[i] - aux; //Resto la parte entera y guardo la decimal
			if (auxFloat < 0.5 ) { //Cuento los decimales
				contador++;
			}
			
		}
		System.out.println();
		System.out.println("La cantidad de decimales menores de 0.5 es " + contador);
	}
	
	
	/**
	 * 
	 */
	public static float[] createRandomArrayFloat(int length, int numMin, int numMax) {
		
		float array[] = new float[length];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=Utils.generateRandomNum(numMin, numMax);
			
			
		}
		return array;
	}
}
