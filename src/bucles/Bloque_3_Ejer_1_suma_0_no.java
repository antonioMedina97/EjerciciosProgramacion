package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_Ejer_1_suma_0_no {

	public static void main(String[] args) {
		int suma = 0; //Result
		int contMedia = 0;
		
		// infinite loop
		for (;;) {
			//request number
			int sumando = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sumandos: "));
			//screen
			if (sumando == 0) {
				System.out.println("Insumable. Media: " + ((float) suma / contMedia));
				return;
			}
			else {
				contMedia++; 
				suma += sumando;
				System.out.println("Media actual: " + ((float) suma / contMedia));
			}
		}
	}
}
