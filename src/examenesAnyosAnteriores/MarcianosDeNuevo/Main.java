package examenesAnyosAnteriores.MarcianosDeNuevo;

public class Main {

	public static void main(String[] args) {

		CampoBatalla batalla = new CampoBatalla("revolucion francesa pero la de star wars que saldrá en alguna secuela");
		
		do {
		

			batalla.getPrimerBichoVivoEnArray(batalla.getBattleDroid()).recibirPium();
			batalla.getPrimerBichoVivoEnArray(batalla.getTroopers()).recibirPium();
			
			System.out.println("\nResumen de la batalla");
			batalla.mostrarBatallaConjunto();
			
		} while (!batalla.esFinDeJuego());
		
		if (batalla.getPrimerBichoVivoEnArray(batalla.getTroopers()) != null) {
			System.out.println("Han ganado los Troopers (humanos)");
		}
		else {
			System.out.println("Ganaron los B1 Battle Robots");
		}
		System.out.println();
		System.out.println("Trooper más difícil de matar:\n" + batalla.getMasDisparosRecibidos(batalla.getTroopers()));
		System.out.println();
		System.out.println("B1 battle droid más difícil de matar:\n" + batalla.getMasDisparosRecibidos(batalla.getBattleDroid()));
	
		System.out.println();
		System.out.println("Trooper que antes cayó:\n" + batalla.getMenosDisparosRecibidos(batalla.getTroopers()));
		System.out.println();
		System.out.println("B1 battle droid más fácil de romper:\n" + batalla.getMenosDisparosRecibidos(batalla.getBattleDroid()));
	
	}

}
