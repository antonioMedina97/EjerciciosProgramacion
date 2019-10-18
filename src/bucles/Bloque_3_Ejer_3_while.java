package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_Ejer_3_while {

	public static void main() {
		int acMayor = 0;
		while (true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número:"
					+ "0 para salir"));
			if (num == 0) {
				System.out.println("Detectado 0. Mayor: " + acMayor);
				return;
			}
			else {
				if (num == 0) {
					acMayor = num;
				}
				
				if (num > acMayor) {
					acMayor = num;
				}
			}
			System.out.println("El mayor es:" + acMayor);
			
		}
	}

}
