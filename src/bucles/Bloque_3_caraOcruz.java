package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_caraOcruz {

	public static void main(String[] args) {
		System.out.println("prueba");
		int aciJugador = 0, aciMaquina = 0, turno = 0;
		
		for (;aciJugador != 2 && aciMaquina != 2;) {
		
			int moneda = Utils.obtenerNumeroAzar(1, 2);
			int elegido = Integer.parseInt(JOptionPane.showInputDialog("1 para cara, 2 para cruz"));
			if (moneda == elegido) {
				System.out.println("Has acertado");
				aciMaquina++;
			}
			else {
				System.out.println("Has fallado");
				aciJugador++;
			}
			turno++;
			System.out.println("Turno número " + turno);
		}
	}

}
