package objetos.TiendaAntig;

public class Libro extends Articulo {
	private String autor;
	private String titulo;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(String anyo, String origen, int precioVenta, String autor, String titulo) {
		super(anyo, origen, precioVenta);
		this.autor = autor;
		this.titulo = titulo;
	}
	
	

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + "]";
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

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}
