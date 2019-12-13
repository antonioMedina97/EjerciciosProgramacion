package objetos.quiz;

import javax.swing.JOptionPane;

public class CuestionOpciones extends Cuestion {
	
	String opciones[];
	
	/**
	 * 
	 */
	
	
	@Override
	public int imprimir() {
		String enunciadoAMostrar = this.enunciado;
		for (int i = 0; i < this.opciones.length; i++) {
			enunciadoAMostrar = enunciadoAMostrar + "\n" + (i+1) + ".-" + opciones[i];
		}
		return Integer.parseInt(JOptionPane.showInputDialog(enunciadoAMostrar));
	}

	/**
	 * @param enunciado
	 * @param resCorrecta
	 * @param opciones
	 */
	public CuestionOpciones(String enunciado, int resCorrecta, String[] opciones) {
		super(enunciado, resCorrecta);
		this.opciones = opciones;
	}

}
