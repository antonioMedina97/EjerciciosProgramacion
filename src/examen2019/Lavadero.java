package examen2019;

public class Lavadero {

	public static int LONGITUD_ARRAY = 40;
	Vajilla vajillaALavar[] = new Vajilla[LONGITUD_ARRAY];
	Vajilla vajillaLavada[] = new Vajilla[LONGITUD_ARRAY];
	Vajilla vajillaRota[] = new Vajilla[LONGITUD_ARRAY];
	
	
	
	/**
	 * 
	 */
	public Lavadero() {
		super();
		int contadorId = 0;

		for (int j = 0; j < 10; j++) {
			vajillaALavar[contadorId] = new Plato(contadorId);
			contadorId++;
		}
		for (int j = 0; j < 10; j++) {
			vajillaALavar[contadorId] = new Vaso(contadorId);
			contadorId++;
		}
		for (int j = 0; j < 10; j++) {
			vajillaALavar[contadorId] = new Cubierto(contadorId);
			contadorId++;
		}
		for (int j = 0; j < 10; j++) {
			vajillaALavar[contadorId] = new Fuente(contadorId);
			contadorId++;
		}
	}
	
	public Vajilla getLimpioRapido(Vajilla array[]) {
		Vajilla vajillaAux = array[0];
		for (int i = 1; i < array.length; i++) {
			if (vajillaAux.getVecesLimpiado() > array[i].getVecesLimpiado()) {
				vajillaAux = array[i];
			}
		}
		return vajillaAux;
	}
	
	public Vajilla getLimpioLento(Vajilla array[]) {
		Vajilla vajillaAux = array[0];
		for (int i = 1; i < array.length; i++) {
			if (vajillaAux.getVecesLimpiado() < array[i].getVecesLimpiado()) {
				vajillaAux = array[i];
			}
		}
		return vajillaAux;
	}
	
	
	/**
	 * 
	 */
	public void mostrarEstado() {
		for (int i = 0; i < LONGITUD_ARRAY; i++) {
			System.out.println(vajillaALavar[i]);
		}
	}
	
	
	/**
	 * @return the lONGITUD_ARRAY
	 */
	public static int getLONGITUD_ARRAY() {
		return LONGITUD_ARRAY;
	}


	/**
	 * @param lONGITUD_ARRAY the lONGITUD_ARRAY to set
	 */
	public static void setLONGITUD_ARRAY(int lONGITUD_ARRAY) {
		LONGITUD_ARRAY = lONGITUD_ARRAY;
	}


	/**
	 * @return the vajillaALavar
	 */
	public Vajilla[] getVajillaALavar() {
		return vajillaALavar;
	}
	/**
	 * @param vajillaALavar the vajillaALavar to set
	 */
	public void setVajillaALavar(Vajilla[] vajillaALavar) {
		this.vajillaALavar = vajillaALavar;
	}
	/**
	 * @return the vajillaLavada
	 */
	public Vajilla[] getVajillaLavada() {
		return vajillaLavada;
	}
	/**
	 * @param vajillaLavada the vajillaLavada to set
	 */
	public void setVajillaLavada(Vajilla[] vajillaLavada) {
		this.vajillaLavada = vajillaLavada;
	}
	/**
	 * @return the vajillaRota
	 */
	public Vajilla[] getVajillaRota() {
		return vajillaRota;
	}
	/**
	 * @param vajillaRota the vajillaRota to set
	 */
	public void setVajillaRota(Vajilla[] vajillaRota) {
		this.vajillaRota = vajillaRota;
	}
	
	
}
