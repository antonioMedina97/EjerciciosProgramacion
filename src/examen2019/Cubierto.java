package examen2019;

public class Cubierto extends Vajilla {

	public Cubierto(int id) {
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
		if (probRoto > 0.7) {
			return true;
		} 
		return false;
	}

	@Override
	public String toString() {
		return "Cubierto [toString()=" + super.toString() + "]";
	}

}
