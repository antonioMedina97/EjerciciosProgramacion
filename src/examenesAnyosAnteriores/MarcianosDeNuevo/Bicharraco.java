package examenesAnyosAnteriores.MarcianosDeNuevo;

public class Bicharraco {

	private String nombre;
	private int puntosVida;
	private boolean vivo;
	private int disparosRecibidos;
	/**
	 * @param nombre
	 * @param puntosVida
	 * @param vivo
	 * @param disparosRecibidos
	 */
	public Bicharraco(String nombre) {
		super();
		this.nombre = nombre;
		this.puntosVida = (int) Math.round(Math.random()*(100-50)+50);
		this.vivo = true;
		this.disparosRecibidos = 0;
	}
	
	public void recibirPium() {
		this.puntosVida -= (int) Math.round(Math.random()*(25-5)+5);
		disparosRecibidos++;
		if (puntosVida<=0) {
			vivo = false;
		}
	}
	
	@Override
	public String toString() {
		return "Bicharraco [nombre=" + nombre + ", puntosVida=" + puntosVida + ", vivo=" + vivo + ", disparosRecibidos="
				+ disparosRecibidos + "]";
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
	/**
	 * @return the disparosRecibidos
	 */
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}
	/**
	 * @param disparosRecibidos the disparosRecibidos to set
	 */
	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}
	
	
	
}
