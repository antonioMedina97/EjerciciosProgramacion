package examen2019;

public abstract class Vajilla {

	protected int id;
	protected int suciedad;
	protected int durezaSuciedad;
	protected int suciedadTotal;
	protected boolean limpio;
	protected int vecesLimpiado;
	
	
	/**
	 * @param id
	 * @param suciedad
	 * @param durezaSuciedad
	 * @param suciedadTotal
	 */
	public Vajilla(int id) {
		super();
		this.id = id;
		this.suciedad = (int) Math.round(Math.random() * (100 - 10)+10);
		this.durezaSuciedad =  (int) Math.round(Math.random() * (3 - 1)+1);
		this.suciedadTotal = suciedad * durezaSuciedad;
		this.limpio = false;
		this.vecesLimpiado = 0;
	}
	/**
	 * 
	 */
	public abstract void limpiar();
	/**
	 * 
	 * @return
	 */
	public abstract boolean getPosibilidadRomper();
	
	

	@Override
	public String toString() {
		return "Vajilla [id=" + id + ", suciedad=" + suciedad + ", durezaSuciedad=" + durezaSuciedad
				+ ", suciedadTotal=" + suciedadTotal + ", limpio=" + limpio + ", vecesLimpiado=" + vecesLimpiado + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the suciedad
	 */
	public int getSuciedad() {
		return suciedad;
	}
	/**
	 * @param suciedad the suciedad to set
	 */
	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}
	/**
	 * @return the durezaSuciedad
	 */
	public int getDurezaSuciedad() {
		return durezaSuciedad;
	}
	/**
	 * @param durezaSuciedad the durezaSuciedad to set
	 */
	public void setDurezaSuciedad(int durezaSuciedad) {
		this.durezaSuciedad = durezaSuciedad;
	}
	/**
	 * @return the suciedadTotal
	 */
	public int getSuciedadTotal() {
		return suciedadTotal;
	}
	/**
	 * @param suciedadTotal the suciedadTotal to set
	 */
	public void setSuciedadTotal(int suciedadTotal) {
		this.suciedadTotal = suciedadTotal;
	}
	/**
	 * @return the limpio
	 */
	public boolean isLimpio() {
		return limpio;
	}
	/**
	 * @param limpio the limpio to set
	 */
	public void setLimpio(boolean limpio) {
		this.limpio = limpio;
	}
	/**
	 * @return the vecesLimpiado
	 */
	public int getVecesLimpiado() {
		return vecesLimpiado;
	}
	/**
	 * @param vecesLimpiado the vecesLimpiado to set
	 */
	public void setVecesLimpiado(int vecesLimpiado) {
		this.vecesLimpiado = vecesLimpiado;
	}

	
}
