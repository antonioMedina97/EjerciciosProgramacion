package bucles;

import javax.swing.JOptionPane;


public class Ejercicio_3_for_PositivoNegativo {

	public static void main(String[] args) {
		//Pedir cantidad de números
		int cantidad =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad de números:" ));
		//String str =  JOptionPane.showInputDialog("Introduzca cantidad de números: ");
		//int cantidad = Integer.parseInt(str);
		
		//Pedir números y calcular
		int positivos = 0;
		int negativos = 0;
		for (int i = 0; i < cantidad; i++) {
			//Introducir números a calcular
			//str =  JOptionPane.showInputDialog("Introduzca números positivos o negativos: ");
			//int num = Integer.parseInt(str);
			int num =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca número positivos o negativos:" ));
			
			//Bucle para calcular
			if (num >= 0) {
				positivos++;
			}else {
				negativos++;
			}
			
		}
		//Imprimir por pantalla los resultados
		System.out.println("La cantidad de positivos es: " + positivos);
		System.out.println("La cantidad de negativos es: " + negativos);
	}

}
