package practicas_clase;

import javax.swing.JOptionPane;

public class Ejercicio_3_for_PositivoNegativo {

	public static void main(String[] args) {
		//Pedir cantidad de números
		String str =  JOptionPane.showInputDialog("Introduzca cantidad de números: ");
		int cantidad = Integer.parseInt(str);
		
		//Pedir números y calcular
		int positivos = 0;
		int negativos = 0;
		for (int i = 0; i < cantidad; i++) {
			str =  JOptionPane.showInputDialog("Introduzca números positivos o negativos: ");
			int num = Integer.parseInt(str);
			
			if (num >= 0) {
				positivos++;
			}else {
				negativos++;
			}
			
		}
		System.out.println("La cantidad de positivos es: " + positivos);
		System.out.println("La cantidad de negativos es: " + negativos);
	}

}
