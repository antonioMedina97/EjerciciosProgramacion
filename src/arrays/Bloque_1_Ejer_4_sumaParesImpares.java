package arrays;

public class Bloque_1_Ejer_4_sumaParesImpares {

	public static void main(String[] args) {
		int acPares = 0, acImpares = 0;
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			//Asignar valores
			array[i] = (int) (Math.round(Math.random() * (100)));
			
			
			//Diferenciar par o impar
			if ((array[i] & 1) == 0 ) { //par
				acPares += array[i];
			}
			else { //impar
				acImpares += array[i];
			}
		}
		//Impresora
		System.out.println("Suma de pares: " + acPares);
		System.out.println("Suma de impares: " + acImpares);
	}

}
