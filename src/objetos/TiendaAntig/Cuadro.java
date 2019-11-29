package objetos.TiendaAntig;

public class Cuadro extends Articulo {
	
	public String autor;

	public Cuadro() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param anyo
	 * @param origen
	 * @param precioVenta
	 */
	public Cuadro(String anyo, String origen, int precioVenta, String autor) {
		super(anyo, origen, precioVenta);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Cuadro [autor=" + autor + ", toString()=" + super.toString() + "]";
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
		
	
	

	

}
