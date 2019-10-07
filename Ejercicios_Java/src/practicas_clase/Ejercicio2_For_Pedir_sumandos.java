package practicas_clase;

import javax.swing.JOptionPane;

public class Ejercicio2_For_Pedir_sumandos {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca cantidad de sumandos: ");
		int cantidad = Integer.parseInt(str);
		int i = 0;
		int suma = 0;
		
		//bucle que suma
		for (i = 0; i < cantidad; i++) {
			str = JOptionPane.showInputDialog("introduzca número " + (i + 1) +(":"));
			int num = Integer.parseInt(str);
			if (num > 10) {
				suma = suma + num;
			}
		}
		System.out.println("Los mayores de 10 suman: " + suma);
		
	}
	
}
	