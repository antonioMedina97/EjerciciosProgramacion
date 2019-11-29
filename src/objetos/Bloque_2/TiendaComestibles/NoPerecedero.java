package objetos.Bloque_2.TiendaComestibles;

public class NoPerecedero extends Articulo{

	
	public NoPerecedero() {
		
	}
	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public NoPerecedero(int codigo, String nombre, float precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NoPerecedero [toString()=" + super.toString() + "]";
	}

	
	
	
}
