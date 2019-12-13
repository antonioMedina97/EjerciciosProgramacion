package objetos.quiz;

public abstract class Cuestion {
	
	protected String enunciado;
	protected int resCorrecta;
	/**
	 * @param enunciado
	 * @param resCorrecta
	 */
	public Cuestion(String enunciado, int resCorrecta) {
		super();
		this.enunciado = enunciado;
		this.resCorrecta = resCorrecta;
	}
	
	//Comprobar si la repuesta del usuario es igual que la correcta y devolver true o false
	public boolean esRespuestaCorrecta(int resUsuario) {
		return (this.resCorrecta == resUsuario);
	}
	
	public abstract int imprimir();
}
