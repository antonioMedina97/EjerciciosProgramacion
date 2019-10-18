package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_Ejer_2_while {

	public static void main(String[] args) {
		int suma = 0; //Result
		//int contMedia = 0;
		
		// infinite loop
		while(true) {
			//request number
			int sumando = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sumandos: "));
			//screen
			if (sumando == 0) {
				System.out.println("Insumable. Suma: " + ((float) suma));
				return;
			}
			else {
				//contMedia++; 
				suma += sumando;
				System.out.println("Suma actual: " + ( suma));
			}
		}
	}

}
