package objetos.Bloque_3;

public class Plato {
	private String nombre;
	private float precio;
	
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Plato() {
		
	}
	public Plato(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
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
	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return  nombre + ", " + precio;
	}
	
	
	
	
	
}
