/**
 * 
 */
package objetos.TiendaAntig;

/**
 * @author anton
 *
 */
public class Articulo {
	private String anyo;
	private String origen;
	private int precioVenta;
	
	
	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param anyo
	 * @param origen
	 * @param precioVenta
	 */
	public Articulo(String anyo, String origen, int precioVenta) {
		super();
		this.anyo = anyo;
		this.origen = origen;
		this.precioVenta = precioVenta;
	}
	
	

	@Override
	public String toString() {
		return "Articulo [anyo=" + anyo + ", origen=" + origen + ", precioVenta=" + precioVenta + "]";
	}

	/**
	 * @return the anyo
	 */
	public String getAnyo() {
		return anyo;
	}

	/**
	 * @param anyo the anyo to set
	 */
	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the precioVenta
	 */
	public int getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	

}
