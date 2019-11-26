package matriz_bloque4;

public class Ejer_Nacho_10x10_Sumar_Media {

	public static void main(String[] args) {
		
		int matriz[][] = new int[10][10];
		int matriz3x3[][] = new int[3][3];
		
		crearMatrizNumerada(matriz);
		Bloque_4_Ejer_4_matriz.printMatrix(matriz);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//necesito igualar la i-1 y j-1 a la posición 0,0 de matriz3x3
				rellenarMatriz3x3(matriz3x3, i, j);
			}
		}
		
		
		
	}

	public static int[][] crearMatrizNumerada(int matriz[][]){
		int contador = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = contador;
				contador++;
			}
		}
		return matriz;
	}
	
	public static void rellenarMatriz3x3(int matriz[][], int i, int j) {
		int matriz3x3[][] = new int[3][3];
	
		
		
	}
}

