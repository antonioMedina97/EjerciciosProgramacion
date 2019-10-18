package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_Ejer_4_Menor_no_0 {

	public static void main(String[] args) {
		int acMayor = 0;
		for (;;) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número:"
					+ "0 para salir"));
			if (num == 0) {
				System.out.println("Detectado 0. Menor: " + acMayor);
				return;
			}
			else {
				if (num != 0) {
					acMayor = num;
				}
				
				if (num < acMayor) {
					acMayor = num;
				}
			}
			System.out.println("El menor es:" + acMayor);
			
		}
	}

}
