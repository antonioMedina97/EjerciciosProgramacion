package matriz_bloque4;

import javax.swing.JOptionPane;

import toolbox.Utils;

public class Bloque_4_Ejer_4_matriz {

	public static void main(String[] args) {
		/* int matrix[][] = new int[][]{{1,	32,	5,	8,	97},
									{0,		4,	7,	14,	62},
									{0,		0,	8,	3,	18},
									{0,		0,	0,	9,	92},
									{0,		0,	0,	0,	45}};
									
		*/
		int matrix[][] = new int[5][5];
		
		crearMatrizAleatoria(matrix, 0, 50);
		
		printMatrix(matrix);
		
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de fila a eliminar:"));
		
		System.out.println("Fila a borrar: " + fila);
		
		eliminarFilaDeMatrizUsuario(matrix, fila);
		
		printMatrix(matrix);
		
		
		
	}
/**
 * 
 * @param matrix
 * @param min
 * @param max
 * @return
 */
	public static int[][] crearMatrizAleatoria(int matrix[][], int min,int max) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Utils.generateRandomNum(min, max);
			}
		}
		return matrix;
	}
	
/**
 * 
 * @param matrix
 */
	public static void printMatrix(int matrix[][]){
		System.out.println("Contenido de la matriz");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
/**
 * 
 * @param matrix
 */
	public static boolean esMatrizPositiva(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
		
	}
/**
 * 
 * @param matrix
 * @param min
 * @param max
 */
	public static void crearMatrizDiagonal(int matrix[][], int min, int max){
		
		//Recorrer matriz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//Rellenar diagonal de 0,0 a 4,4
				if (j == i) {
					matrix[i][j] = Utils.generateRandomNum(min, max);
				}
				else {
					matrix[i][j] = 0;
				}
				//Rellenar diagonal de 0,4 a 4,0
			/*	if ((i+j)== (matrix.length - 1)) {
					matrix[i][j] = Utils.generateRandomNum(min, max);
				}
			*/
			}
		}
	}
/**
 * 
 * @param matrix
 */
	public static boolean comprobarMatrizDiagonal(int matrix[][]) {
		boolean esDiagonal = true;
		//Iterar sobre  matriz completa
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//Comprobar si diagonal desde 0,0 hata 4,4
				if (i != j ) {
					if (matrix[i][j] != 0) {
						esDiagonal = false;
					}
					else {
						esDiagonal = true;
					}
				}
				
				//Comprobar si diagonal de 0,4 a 4,0
			/*	if ((i+j) != (matrix.length-1)) {
					if (matrix[i][j] != 0) {
						esDiagonal = false;
					}
					else {
						esDiagonal = true;
					}
				}
				*/
			}
		}
		return esDiagonal;
	}
	
	public static boolean esTriangularSuperior(int matrix[][]) {
		for (int i = 0; i < matrix[i].length; i++) {
			for (int j = 0; j < i; j++) {
				if (matrix[i][j] > 0) {
					return false;
				}
				
			}
		}
		return true;
	}
	
/**
 * 
 * @param matrix
 * @return
 */
	public static int[] crearArrayConMatriz(int matrix[][]) {
		int cantidadPosiciones = 0;
		//Contar la cantidad de elementos en la matriz
		for (int i = 0; i < matrix.length; i++) {
			cantidadPosiciones += matrix[i].length;
		}
		
		int array[] = new int[cantidadPosiciones];
		int contador = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					array[contador] = matrix[i][j];
					contador++;
					
				}
			}
		return array;
	}
	
	public static boolean esMatrizSimetrica(int matrix[][]) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void crearMatrizTraspuesta(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {//Recorro la j a partir de la i, solo el triángulo superior
				//Cambio de posición
				int aux = 0;	
				aux = matrix[i][j];
				matrix[i][j] = matrix[j][i]; 
				matrix[j][i] = aux;		
			}
		}
	}
	
	public static void crearMatrizOpuesta(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] *= -1;
			}
		}
	}
	
	public static void eliminarFilaDeMatrizUsuario(int matrix[][], int fila) {
		fila -= 1;
		for (int i = matrix.length; i > fila; i--) { //Comenzar a recorrer la matriz una fila despues de la especificada
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = matrix[i-1][j];
			}
		}
	}
}
