package arrays;

public class Bloque_1_Ejer_2_orden_inverso {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = (array.length - 1); i > -1; i--) {
			array[i] = numeroAleatorio();
			
			System.out.println(array[i]);
		}
		
		
	}
	/**
	 * 
	 * @return
	 */
	public static int numeroAleatorio () {
		return (int) Math.round(Math.random() * 100);
	}

}
