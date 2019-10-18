package bucles;

public class Bloque_4_sumaMediaMayorMeno {

	public static void main(String[] args) {
		int num = 0;
		int suma = 0;
		int acMayor = -100, acMenor = 100000;
		for (int i = 0; i < 1000; i++) {
			num = Utils.obtenerNumeroAzar(0, 1000);
			suma += num;
			
			//sacar mayor
			if (num == 0) {
				acMayor = num;
			}
			
			if (num > acMayor) {
				acMayor = num;
			}
			//sacar menor
			if (num == 0) {
				acMenor = num;
			}
			
			if (num < acMenor) {
				acMenor = num;
			}
		}
		System.out.println("La suma es igual a: " + suma);
		System.out.println("La media es igua a: " + (suma / 1000));
		System.out.println("El mayor es: " + acMayor);
		System.out.println("El menor es: " + acMenor);
	}
	

}
