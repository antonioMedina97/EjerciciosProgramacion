package practicas_clase;

import javax.swing.JOptionPane;

public class Ejercicio_show_el_mayor {

	public static void main(String[] args) {

	String str = JOptionPane.showInputDialog("Introduzca un número");
	int num1 = Integer.parseInt(str);
	str = JOptionPane.showInputDialog("Introduzca otro número");
	int num2 = Integer.parseInt(str);
	
	if (num1 > num2) {
		System.out.println("El mayor es " + num1);
	}else {
		System.out.println("El mayor es " + num2);
	}
	
	}

}
