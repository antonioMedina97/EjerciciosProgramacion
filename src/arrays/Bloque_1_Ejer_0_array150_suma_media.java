package arrays;

public class Bloque_1_Ejer_0_array150_suma_media {

	public static void main(String[] args) {
		//Declarar variables
		int numeros[] = new int[150];
		int suma = 0;
		int acMayor = 0;
		int acMenor = 0;
		for (int i = 0; i < numeros.length; i++) {
			//Asignar numeros al azar
			numeros[i] = (int) (Math.round(Math.random() * 100));
			System.out.println(numeros[i]);
			
			//sumar numeros
			suma += numeros[i];
			
			//Mayor
			if (acMayor == 0) {
				acMayor = numeros[i];
			}
			if (acMayor < numeros[i]) {
				acMayor = numeros[i];
			}
			//Menor
			if (acMenor == 0) {
				acMenor = numeros[i];
			}
			if (acMenor > numeros[i]) {
				acMenor = numeros[i];
			}
		}
		//Imprimir resultados
		System.out.println("la suma es " + suma);
		System.out.println("la media es " + ((float) suma / 150));
		System.out.println("El mayor es " + acMayor);
		System.out.println("El menor es " + acMenor);
		
	}

}
