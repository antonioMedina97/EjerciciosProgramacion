package practicas_clase;

import javax.swing.JOptionPane;

public class SumaGrupos {

	public static void main(String[] args) {
		
		int negativos, bajos, medios, grandes;
		
		//Pedir números
		String str = JOptionPane.showInputDialog("Introduzca número 1");
		int num1 = Integer.parseInt(str);
		
		if (num1 < 0) {
			negativos = num1;
		}
		else {
			if (num1 >= 0 && num1 < 25) {
				bajos = num1;
			}
			else {
				if (num1 >= 25 && num1 < 250) {
					medios = num1;
				}
				else {
					grandes = num1;
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduzca número 2");
		num1 = Integer.parseInt(str);

		if (num1 < 0) {
			negativos + num1;
		}
		else {
			if (num1 >= 0 && num1 < 25) {
				bajos + num1;
			}
			else {
				if (num1 >= 25 && num1 < 250) {
					medios + num1;
				}
				else {
					grandes + num1;
				}
			}
		}
bARRA DE SEPARACION		
		if (num1 < 0) {
			negativos = num1;
		}
		else {
			if (0 <= num1 < 25) {
				bajos = num1;
			}
			else {
				if (25 <= num1 < 250) {
					medios = num1;
				}
				else {
					grandes = num1;
				}
			}
		}
	}

}
