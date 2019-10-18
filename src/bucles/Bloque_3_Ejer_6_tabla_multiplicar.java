package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_Ejer_6_tabla_multiplicar {

	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número: "));
		
		for (i = -1; i == 0;) {
			for (int j = 0; j < 10; j++) {
				System.out.println("1 x " + (i + 1) + "= " + (i * (j + 1)));
			}
		}
	}

}
