package examenesAnyosAnteriores.MarcianosDeNuevo;

public class CampoBatalla {

	public static int LONGITUD_ARRAY = 20;
	Humano troopers[] = new Humano[LONGITUD_ARRAY];
	Malvado battleDroid[] = new Malvado[LONGITUD_ARRAY];
	private String nombre;
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public Bicharraco getMasDisparosRecibidos(Bicharraco array[]) {
		Bicharraco disparosMayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (disparosMayor.getDisparosRecibidos()< array[i].getDisparosRecibidos()) {
				disparosMayor = array[i];
			}
		}
		return disparosMayor;
	}
	
	public Bicharraco getMenosDisparosRecibidos(Bicharraco array[]) {
		Bicharraco disparosMenor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (disparosMenor.getDisparosRecibidos()> array[i].getDisparosRecibidos()) {
				disparosMenor = array[i];
			}
		}
		return disparosMenor;
	}

	/**
	 * @param nombre
	 */
	public CampoBatalla(String nombre) {
		super();
		this.nombre = nombre;

		for (int i = 0; i < LONGITUD_ARRAY; i++) {
			troopers[i] = new Humano("Hum " + i);
			battleDroid[i] = new Malvado("Mal " + i);
		}

		duplicarVida(troopers);
		duplicarVida(battleDroid);
		mezclarArray(troopers);
		mezclarArray(battleDroid);
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public Bicharraco getPrimerBichoVivoEnArray(Bicharraco array[]) {
		for(Bicharraco p : array) {
			if (p.isVivo()) {
				return p;
			}
		}
		return null;
	}
	
	public boolean quedanHumanosVivos() {
		if (getPrimerBichoVivoEnArray(troopers) != null) {
			return true;
		}
		return false;
	}
	
	public boolean quedanMonstuosVivos() {
		if (getPrimerBichoVivoEnArray(battleDroid) != null) {
			return true;
		}
		return false;
	}
	
	
	public boolean esFinDeJuego() {
		if (!quedanHumanosVivos() || !quedanMonstuosVivos()) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param array
	 */

	public void mezclarArray(Bicharraco array[]) {
		Bicharraco aux;
		int aux1, aux2;
		for (int i = 0; i < array.length * 2; i++) {
			aux1 = (int) Math.round(Math.random() * (array.length - 1));
			aux2 = (int) Math.round(Math.random() * (array.length - 1));

			aux = array[aux1];
			array[aux1] = array[aux2];
			array[aux2] = aux;
		}
	}

	/**
	 * 
	 */
	public void mostrarEstadoBatalla(Bicharraco array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].isVivo()) {
				System.out.println(array[i]);
			}
			else {
				System.out.println("X\t");
			}
		}
	}
	
	public void mostrarBatallaConjunto() {
		mostrarEstadoBatalla(troopers);
		
		System.out.println();
		
		mostrarEstadoBatalla(battleDroid);
	}

	/**
	 * 
	 * @param array
	 */
	public void duplicarVida(Bicharraco[] array) {
		array[array.length - 1].setPuntosVida(array[array.length - 1].getPuntosVida() * 2);
	}

	/**
	 * @return the troopers
	 */
	public Humano[] getTroopers() {
		return troopers;
	}

	/**
	 * @param troopers the troopers to set
	 */
	public void setTroopers(Humano[] troopers) {
		this.troopers = troopers;
	}

	/**
	 * @return the battleDroid
	 */
	public Malvado[] getBattleDroid() {
		return battleDroid;
	}

	/**
	 * @param battleDroid the battleDroid to set
	 */
	public void setBattleDroid(Malvado[] battleDroid) {
		this.battleDroid = battleDroid;
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

}
