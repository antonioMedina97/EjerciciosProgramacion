package arrays;

import javax.swing.JOptionPane;

import toolbox.UtilsArray;

public class Bloque_2_Ejer_6_ElegirNumeroDireccion {

	public static void main(String[] args) {
		//Create array
		int array[] = UtilsArray.createNumberedArray(5);
		//Print array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//Demand option
		int key = Integer.parseInt(JOptionPane.showInputDialog("1 para Izquierda\n2 para la derecha:"));
		int num = 0;
		
		switch (key) {
		case 1: //A Izquierda
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de saltos"));
			
			
			
			//Calculate
			
			for (int j = 0; j < num; j++) {
			//Move once
				
				//Save first number
				int buffer = array[0];
					
				//Operate
				for (int i = 0; i < array.length; i++) {
				
					if (i == array.length - 1) {
						array[i]=buffer;
					}
					else {
						array[i]=array[i+1];
					}
				}
			}
			//Print result
			System.out.println("\nResultado:");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			break;
			
		case 2: //A Derecha
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de saltos"));
			
			
			
			//Calculate
			
			for (int j = 0; j < num; j++) {
			//Move once
				
				//Save first number
				int buffer = array[array.length - 1];
				//Operate
				for (int i = array.length - 1; i > 0; i--) {
					
					array[i] = array[i - 1]; 
				}
				array[0]= buffer;
			}	
				
	
			//Print result
			System.out.println("\nResultado:");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			break;

		default:
			break;
		}
	}

}
