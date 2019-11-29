package objetos.arbol;

public class Hoja extends ElementoArbol{
	private String color; 
	
	public Hoja() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param color
	 */
	public Hoja(String color) {
		super();
		this.color = color;
	}


	@Override
	public String toString() {
		return "Hoja [color=" + color + "]";
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
