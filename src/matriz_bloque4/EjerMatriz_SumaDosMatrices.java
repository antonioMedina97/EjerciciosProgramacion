package matriz_bloque4;

import toolbox.Utils;

public class EjerMatriz_SumaDosMatrices {

	public static void main(String[] args) {
		//Declarar matrices
		int longitud = Utils.requestUserNumber("Introduzca longitud de las matrices");
		int matriz1[][] = new int[longitud][longitud];
		int matriz2[][] = new int[longitud][longitud];
		int matrizResultado[][] = new int[longitud][longitud];
		
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				matriz1[i][j] = Utils.generateRandomNum(0, 100);
				matriz2[i][j] = Utils.generateRandomNum(0, 100);
			}

		}
		Bloque_4_Ejer_4_matriz.printMatrix(matriz1);
		Bloque_4_Ejer_4_matriz.printMatrix(matriz2);
		
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		Bloque_4_Ejer_4_matriz.printMatrix(matrizResultado);
	}

}
