package objetos.arbol;

public class Fruto extends ElementoArbol {
	private String nombre;
	
	
	public Fruto() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param nombre
	 */
	public Fruto(String nombre) {
		super();
		this.nombre = nombre;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Fruto [nombre=" + nombre + "]";
	}
	
	

}
