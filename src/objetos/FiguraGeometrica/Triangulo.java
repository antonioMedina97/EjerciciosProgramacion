package objetos.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica{

	
	public void imprimirTriangulo() {
		
		int auxiliar = 1;
		do {
			
			for (int i = 1; i < getAltura(); i++) {
				for (int j = 0; j < auxiliar; j++) {
					System.out.print("*");
				}
				auxiliar++;
				System.out.println();
			}

		} while (auxiliar <= getBase());
	
	}
	
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	

	
	
}
