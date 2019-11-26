package objetos.rectangulo;

public class Rectangulo {
	private int altura;
	private int anchura;
	


	/**
	 * @param altura
	 * @param anchura
	 */
	public Rectangulo(int altura, int anchura) {
		super();
		this.altura = altura;
		this.anchura = anchura;
	}

	
	public void imprimirRectangulo() {
		for (int i = 0; i < this.altura; i++) {
			for (int j = 0; j < this.anchura; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}


	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}


	/**
	 * @return the anchura
	 */
	public int getAnchura() {
		return anchura;
	}


	/**
	 * @param anchura the anchura to set
	 */
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	
	
	
}
