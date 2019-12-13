package objetos.arbol;

public class Main {


	public static void main(String[] args) {
		Fruto pera = new Fruto("Pera");
		Hoja alamo = new Hoja("Alamo");
		Fruto prueba = new Fruto("Albaricoque");
		
		Rama hola = new Rama(pera, alamo, prueba);
		Hoja pino = new Hoja("Aguja de pino");
		Fruto melon = new Fruto("Melon piel de sapo");
		
		Rama principal = new Rama(hola, pino, melon);
		
		
		
		System.out.println(principal.toString());

	}

}
