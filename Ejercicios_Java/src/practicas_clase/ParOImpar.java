package practicas_clase;

import javax.swing.JOptionPane;

public class ParOImpar {

	public static void main(String[] args) {
		//Pedir número por pantalla
		String str = JOptionPane.showInputDialog("Introduzca un número");
		int num =Integer.parseInt(str);
		if ((num & 1)== 0) {
			System.out.println("El número " + num + " es par.");
		}
		else {
			System.out.println("El número " + num + " es impar.");
		}
	}

}
