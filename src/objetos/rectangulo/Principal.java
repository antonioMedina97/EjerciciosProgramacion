package objetos.rectangulo;

import toolbox.Utils;

public class Principal {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(Utils.requestUserNumber("Introduzca altura:"), Utils.requestUserNumber("Introduzca anchura"));
		
		rectangulo.imprimirRectangulo();
	}

}
