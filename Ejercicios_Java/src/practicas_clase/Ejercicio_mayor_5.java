package practicas_clase;

import javax.swing.JOptionPane;

public class Ejercicio_mayor_5 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca número 1");
		int num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca número 2");
		int num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca número 3");
		int num3 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca número 4");
		int num4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca número 5");
		int num5 = Integer.parseInt(str);
		
		int mayor;
			
		if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
			System.out.println("Los números son iguales");
		}
		else {
			
		
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				mayor = num1;
			}
			else{
				if (num2 > num3 && num2 > num4 && num2 > num5) {
					mayor = num2;
				}
				else{
					if (num3 > num4 && num3 > num5) {
					mayor = num3;
					}
					else {
						if (num4 > num5) {
							mayor = num4;
						}
						else {
							mayor = num5;
						}
					}
				}
			}
		}
	}
	//System.out.println("El mayor es el número + " + mayor);
}

