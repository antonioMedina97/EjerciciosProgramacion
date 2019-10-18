package arrays;

import javax.swing.JOptionPane;

public class Bloque_1_Ejer_3_buscar_num_array {

	public static void main(String[] args) {
int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			//Asignar valores
			array[i] = (int) (Math.round(Math.random() * 100));
			
		}
			//Mostrar array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		//Pedir número al usuario
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número: "));
		
		//Buscar número
		boolean isNumberOnArray = false;
		for (int i = 0; i < array.length && !isNumberOnArray; i++) {
			if (num == array[i]) {
				System.out.println("\nEl número " + num + " se encuentra en la posicion de array " + i);
				isNumberOnArray = true;
			}
			
		}
		
		//Si no está
		if (!isNumberOnArray) {
			System.out.println("El número " + num + " no se encuentra");
		}
	}
}