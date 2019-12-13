package objetos.quiz;

import javax.swing.JOptionPane;

public class CuestionVoF extends Cuestion {

	public CuestionVoF(String enunciado, int resCorrecta) {
		super(enunciado, resCorrecta);
	}

	@Override
	public int imprimir() {
		return Integer.parseInt(JOptionPane.showInputDialog(this.enunciado));
	}

}
