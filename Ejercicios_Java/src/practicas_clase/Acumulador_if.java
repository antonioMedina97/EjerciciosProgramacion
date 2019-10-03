package practicas_clase;

import javax.swing.JOptionPane;

public class Acumulador_if {

	public static void main(String[] args) {
		
		int negativos = 0;
		int bajos = 0;
		int medios = 0;
		int grandes = 0;
		
		String str = JOptionPane.showInputDialog("Introduzca número 1");
		int num = Integer.parseInt(str);
		
		if (num < 0 ) {
			negativos = negativos + num;
		}
		else {
			if (num >= 0 && num < 25) {
				bajos = bajos + num;
			}
			else {
				if (num >= 25 && num < 250) {
					medios = medios + num;
				}
				else {
					grandes = grandes + num;
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduzca número 2");
		num = Integer.parseInt(str);
		
		if (num < 0 ) {
			negativos = negativos + num;
		}
		else {
			if (num >= 0 && num < 25) {
				bajos = bajos + num;
			}
			else {
				if (num >= 25 && num < 250) {
					medios = medios + num;
				}
				else {
					grandes = grandes + num;
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduzca número 3");
		num = Integer.parseInt(str);
		
		if (num < 0 ) {
			negativos = negativos + num;
		}
		else {
			if (num >= 0 && num < 25) {
				bajos = bajos + num;
			}
			else {
				if (num >= 25 && num < 250) {
					medios = medios + num;
				}
				else {
					grandes = grandes + num;
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduzca número 4");
		num = Integer.parseInt(str);
		
		if (num < 0 ) {
			negativos = negativos + num;
		}
		else {
			if (num >= 0 && num < 25) {
				bajos = bajos + num;
			}
			else {
				if (num >= 25 && num < 250) {
					medios = medios + num;
				}
				else {
					grandes = grandes + num;
				}
			}
		}
		
		str = JOptionPane.showInputDialog("Introduzca número 5");
		num = Integer.parseInt(str);
		
		if (num < 0 ) {
			negativos = negativos + num;
		}
		else {
			if (num >= 0 && num < 25) {
				bajos = bajos + num;
			}
			else {
				if (num >= 25 && num < 250) {
					medios = medios + num;
				}
				else {
					grandes = grandes + num;
				}
			}
		}
		
		System.out.println("valor negativos " + negativos);
		System.out.println("valor bajos " + bajos);
		System.out.println("valor medios " + medios);
		System.out.println("valor altos " + grandes);
		
	}

}