package listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejer_1_Listener {

	private static List<TresDigitosEncontradosListener> tresDigitosEncontradosListeners = new ArrayList<TresDigitosEncontradosListener>();
			
	public static void main(String[] args) {

		while (true) {
			String str =JOptionPane.showInputDialog("Sam va lentin");
			char array[] = str.toCharArray();
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				if (Character.isDigit(array[i])) {
					counter++;
				}
				if (counter == 3) {
					
				}
			}
		}
	}
	
	public static void addTresDigitosEncontradosListener(TresDigitosEncontradosListener listener) {
		tresDigitosEncontradosListeners.add(listener);
	}
	
	public static void removeTresDigitosEncontradosListener(TresDigitosEncontradosListener listener) {
		tresDigitosEncontradosListeners.remove(listener);
	}
	
	public static void fireTresDigitosEncontradosListener(NumerosIntoducidosEvent event) {
		for (TresDigitosEncontradosListener listener : tresDigitosEncontradosListeners) {
		}
	}

}
