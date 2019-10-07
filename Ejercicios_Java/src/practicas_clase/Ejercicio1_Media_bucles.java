package practicas_clase;

import javax.swing.JOptionPane;

public class Ejercicio1_Media_bucles {

	public static void main(String[] args) {
		//Pedir cantidad de números
		String str =  JOptionPane.showInputDialog("Introduzca cantidad de números: ");
		int cantidad = Integer.parseInt(str);
		
		//Pedir números y calcular
		float suma = 0;
		for (int i = 0; i < cantidad; i++) {
			//Pedir números
			str =  JOptionPane.showInputDialog("Introduzca números para calcular media: ");
			int num = Integer.parseInt(str);
			
			//Sumar media
			suma += num;
			
		}
		System.out.println("La media es: " + (float) (suma / cantidad));
	}

}
