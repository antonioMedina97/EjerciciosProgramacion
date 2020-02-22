package libreria_math;

public class Clase_Math {

	public static void main(String[] args) {
		//puntoDeCorte();
		//aproximarPI();
		//calcularHipotenusa();
		calcularMaximosLocales();

	}

	public static void puntoDeCorte() {
		
		boolean encontradoCorte = false;
		float x = 0;
		float y1, y2;
		
		do {
			x+= 0.001;
			 y1 = (float) Math.sqrt(x);
			 y2 = (float) -Math.log(x);
			
			
		} while (!(Math.abs(y1 - y2) < 0.001) );
		
		System.out.println("punto de corte: " + x);
	}
	
	public static void aproximarPI() {
		float divisor = 1;
		boolean suma = true;
		double aproximacion = 0;
		do {
			if (suma) {
				aproximacion += 4/divisor;
			}
			else {
				aproximacion-= 4/divisor;
			}
			
			divisor += 2;
			suma = !suma;
			
			
		} while (!(Math.abs(aproximacion - Math.PI ) < 0.0000001));
		
		System.out.println(aproximacion);
	}
	
	public static void calcularHipotenusa() {
		System.out.println("La hipotenusa vale: " + Math.hypot(4, 5));
	}
	
	/**
	 * 
	 */
	public static void calcularMaximosLocales() {
		float x = 0;
		
		float xAnterior = 0, xSiguiente = 0;
		
		int contadorMaximos = 0;
		do {	
			if (x * Math.sin(x)> xAnterior * Math.sin(xAnterior) && (x * Math.sin(x))>xSiguiente * Math.sin(xSiguiente)) {
				
				System.out.println(x + " es un máximo");
				contadorMaximos++;
			}
			x += 0.01f;
			xAnterior = x - 0.01f;
			xSiguiente = x + 0.01f;
		} while (!(contadorMaximos == 5));
	}
}
