package bucles;

import javax.swing.JOptionPane;

public class Ejercicio_2_mayor_for {

	public static void main(String[] args) {
		//Pedir cantidad de operadores
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad de números: "));
		
		//bucle for
		
		int comparadorMayor = 0, comparadorMenor = 0;
		for (int i = 0; i < cantidad; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca números: "));
			if (i == 0) {
				comparadorMayor = num;
				comparadorMenor = num;
			}
			
			if (num > comparadorMayor) {
				comparadorMayor = num;
			}
			
			if (num < comparadorMenor) {
				comparadorMenor = num;
			}
		}
		System.out.println("El mayor es: " + comparadorMayor + " y el menor: " + comparadorMenor);
	}

}
