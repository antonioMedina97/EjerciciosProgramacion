package practicas_clase;

import javax.swing.JOptionPane;

public class Ejercicio1_For {

	public static void main(String[] args) {
		int i = 0;
		int suma = 0;
		for (i = 0; i < 4; i++) {
			String str = JOptionPane.showInputDialog("introduzca número " + (i + 1) +(":"));
			int num = Integer.parseInt(str);
			if (num > 10) {
				suma = suma + num;
			}
		}
		System.out.println("Los mayores de 10 suman: " + suma);
		
	}
	
}
	