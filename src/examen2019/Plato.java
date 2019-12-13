package examen2019;

public class Plato extends Vajilla {

	public Plato(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void limpiar() {
		suciedadTotal -= (int) Math.round(Math.random() * (40 - 20)+20);
		vecesLimpiado++;
		if (suciedadTotal <= 0) {
			limpio=true;
		}

	}

	@Override
	public boolean getPosibilidadRomper() {
		float probRoto = Math.round(Math.random());
		if (probRoto > 0.3) {
			return true;
		} 
		return false;
	}

	@Override
	public String toString() {
		return "Plato [toString()=" + super.toString() + "]";
	}

	
}
