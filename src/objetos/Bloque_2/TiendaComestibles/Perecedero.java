package objetos.Bloque_2.TiendaComestibles;

public class Perecedero extends Articulo{
	private String fCaducidad;

	
	
	public Perecedero() {
		
	}
	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Perecedero(int codigo, String nombre, float precio, String fecha) {
		super(codigo, nombre, precio);
		this.fCaducidad = fecha;
	
	}
	

	@Override
	/*public String toString() {
		return "Perecedero [fCaducidad=" + fCaducidad + ", toString()=" + super.toString() + "]";
	}
*/
	/**
	 * @return the fCaducidad
	 */
	public String getfCaducidad() {
		return fCaducidad;
	}

	/**
	 * @param fCaducidad the fCaducidad to set
	 */
	public void setfCaducidad(String fCaducidad) {
		this.fCaducidad = fCaducidad;
	}

	
	
	
	
	
	
	
}
