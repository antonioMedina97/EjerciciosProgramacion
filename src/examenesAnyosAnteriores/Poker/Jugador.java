package examenesAnyosAnteriores.Poker;

public class Jugador {
	
	private String nombre;
	Carta mano[] = new Carta[5];
	
	/**
	 * 
	 */
	public void imprimirMano() {
		System.out.println("Mano:");
		for (int i = 0; i < mano.length; i++) {
			System.out.println(mano[i]);
		}
	}
	
	public void comprobarMano() {
		int valor = mano[0].getValor();
		int contadorIguales = 0;
		for (int i = 1; i < mano.length; i++) {
			if (valor== mano[i].getValor()) {
				contadorIguales++;
			}
		}
		if (contadorIguales == 0) {
			System.out.println("Retírate");
		}
		if (contadorIguales == 1) {
			System.out.println("Tengo una pareja");
		}
		if (contadorIguales == 2) {
			System.out.println("Tengo un trío");
		}
		if (contadorIguales == 3) {
			System.out.println("Tengo un póker");
		}
		
		
	}
	/**
	 * @param nombre
	 * @param mano
	 */
	public Jugador(String nombre) {
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
	/**
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}
	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	
	
	
}
