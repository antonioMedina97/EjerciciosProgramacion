package practicas_clase;

import javax.swing.JOptionPane;

public class ParOImparDivision {

	public static void main(String[] args) {
		//Pedir número por pantalla
				String str = JOptionPane.showInputDialog("Introduzca un número");
				int num =Integer.parseInt(str);
				int resto = num % 2;
				if (resto == 0) {
					System.out.println("El número " + num + " es par.");
				}
				else {
					System.out.println("El número " + num + " es impar.");
				}
	}

}
