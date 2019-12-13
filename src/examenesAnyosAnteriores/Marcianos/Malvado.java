package examenesAnyosAnteriores.Marcianos;

public class Malvado extends Ser{
	
	private int puntosVida = (int) Math.round(Math.random()*(100 - 50)) + 50;;
	private String nombre;
	private boolean vivo;
	
	public boolean estaVivo(boolean vivo) {
		if (puntosVida == 0) {
			return false;
		}
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Malvado [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + estaVivo(vivo) + "]\n";
	}
	/**
	 * @param nombre
	 */
	public Malvado(String nombre) {
		super();
		this.nombre = nombre;
	}
	/**
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}
	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
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
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}
	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
	

}
