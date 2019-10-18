package arrays;

public class Bloque_1_Ejer_1_array150_masmenos500 {

	public static void main(String[] args) {
		//Declarar variables
		int numeros[] = new int[150];
		int suma = 0;
		int acMayor = 0;
		int acMenor = 0;
		for (int i = 0; i < numeros.length; i++) {
			//Asignar numeros al azar
			numeros[i] = (int) (Math.round(Math.random() * (1000)-500));
			System.out.println(numeros[i]);
			
			//sumar numeros
			suma += numeros[i];
			
			//Mayor
			acMayor = numeros[0];
			
			if (acMayor < numeros[i]) {
				acMayor = numeros[i];
			}
			//Menor
			acMenor = numeros[0];
			
			if (acMenor > numeros[i]) {
				acMenor = numeros[i];
			}
		}
		//Imprimir resultados
		System.out.println("la suma es " + suma);
		System.out.println("la media es " + ((float) suma / numeros.length));
		System.out.println("El mayor es " + acMayor);
		System.out.println("El menor es " + acMenor);
		
	}

}
