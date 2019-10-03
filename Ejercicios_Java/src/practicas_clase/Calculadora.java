package practicas_clase;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduza:\n1 para raíz\n2 para potencia\n3 para módulo");
		int operation = Integer.parseInt(str);
		int num1 = 0;
		int num2 = 0;
		double resultado = 0;
		
		switch (operation) {
		//Raíz de un número
		case 1:
			str = JOptionPane.showInputDialog("Introduzca número");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca base");
			num2 = Integer.parseInt(str);
			resultado =  Math.pow(num1, (1/(float) num2));
			System.out.println("El resultado es " + resultado);
			break;
			
		//Potencia de un número	
		case 2:
			str = JOptionPane.showInputDialog("Introduzca base");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca exponente");
			num2 = Integer.parseInt(str);
			resultado = (int) Math.pow(num1, num2);
			System.out.println("El resultado es " + resultado);
			break;
			
		//Modulo de la division
		case 3:
			str = JOptionPane.showInputDialog("Introduzca dividendo");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca divisor");
			num2 = Integer.parseInt(str);
			resultado = num1 % num2;
			System.out.println("El módulo es " + resultado);
			break;

		default:
			break;
		}
		
	}

}
