package listener;

public class NumerosIntoducidosEvent {

	private int[] numeros;

	/**
	 * @param numeros
	 */
	public NumerosIntoducidosEvent(int[] numeros) {
		this.numeros = numeros;
	}

	/**
	 * @return the numeros
	 */
	public int[] getNumeros() {
		return numeros;
	}
	
	
}
