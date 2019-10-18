package bucles;

import java.util.Date;

import javax.swing.JOptionPane;

public class Bloque_3_for_factorial {

	public static void main(String[] args) {
		
		long tiempo = new Date().getTime();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número para calcular factorial:"));
		for (int i = num; i > 1; i--) {
			num = num * (i - 1);
			
		}
		System.out.println("factorial es igual a: " + num);
		System.out.println((new Date().getTime()) - tiempo);
	}
	

}
