package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_Ejer_2_sumaYmedia {

	public static void main(String[] args) {
		int suma = 0;
		for (;;) {
			
			int sumando = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sumandos: "));
			if (sumando == 0) {
				System.out.println("Insumable. Resultado: " + suma);
				return;
			}
			else {
				suma += sumando;
				System.out.println("Resultado actual: " + suma);
			}
		}
	}
}
