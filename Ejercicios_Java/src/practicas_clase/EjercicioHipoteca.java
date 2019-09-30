package practicas_clase;
public class EjercicioHipoteca {

	public static void main(String[] args) {
		
		float euribor , diferencial;
		euribor = -0.3f;
		diferencial = 1.1f;
		
		float IA = euribor + diferencial;
		float capital = 150000f;
		int N = 120;
		
		float im = (IA / 12) / N;
		float potencia = (float) Math.pow(1 + im, N);
		
		float cm = im * potencia / (potencia - 1);
		
		System.out.println("la cuota mensual es de " + cm);    

	}

}
