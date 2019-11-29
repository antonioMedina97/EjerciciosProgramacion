package objetos.TiendaAntig;

public class Joya extends Articulo {
	private String material;
	
	public Joya() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param anyo
	 * @param origen
	 * @param precioVenta
	 */
	public Joya(String anyo, String origen, int precioVenta, String material) {
		super(anyo, origen, precioVenta);
		this.material = material;
	}

	

	@Override
	public String toString() {
		return "Joya [material=" + material + ", toString()=" + super.toString() + "]";
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	

}
