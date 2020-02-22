package exception;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		try {
			pedirNumeroPar();
		} catch (NumeroImparException e) {
			e.printStackTrace();
		}

	}

	public static void pedirNumeroPar() throws NumeroImparException {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número par"));
		if (num % 2 == 0) {
			System.out.println("El número es par, muy bien");
		} else {
			throw new NumeroImparException("El número no es par, GGGGGGGGGGGImbécil");
		}
	}

}
