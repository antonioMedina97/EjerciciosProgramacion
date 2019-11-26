package matriz_bloque4;

import toolbox.UtilsArray;

public class Bloque_4_Ejer_2_porcentajeAprobados {

	public static void main(String[] args) {
		//Crear array y variables
		int array[] = UtilsArray.createRandomArray(20, 0, 10);
		int contador = 0;
		UtilsArray.printArray(array);
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 5) {
				contador++;
			}
		}
		System.out.println(contador);
		//calcular porcentajes
		float porcentajeAprobados = (((float) contador / array.length) * 100);
		//calcular positivos
		System.out.println("El porcentaje de aprobados es: " + porcentajeAprobados + "%");
		
		
		//calcular negativos
		System.out.println("El porcentaje de suspensos es: " + (100 - porcentajeAprobados) + "%");
	}

}
