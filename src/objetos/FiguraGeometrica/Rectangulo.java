package objetos.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica{

	
	public void imprimirRectangulo() {
		for (int i = 0; i < this.getAltura(); i++) {
			for (int j = 0; j < this.getBase(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	
}
