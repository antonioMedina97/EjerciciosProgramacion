package examenesAnyosAnteriores.Poker;

public class Poker {

	Jugador jugadores[] = new Jugador[5];
	Baraja baraja;
	/**
	 * 
	 */
	public Poker() {
		jugadores[0] = new Jugador("Jose");
		jugadores[1] = new Jugador("Fran");
		jugadores[2] = new Jugador("Ana");
		jugadores[3] = new Jugador("Nuria");
		jugadores[4] = new Jugador("Arturo");
		
		for (int i = 0; i < jugadores.length; i++) {
			baraja.repartirMano(jugadores[i]);
		}
		
		for (int i = 0; i < jugadores.length; i++) {
			 jugadores[i].imprimirMano();
		}
	}
	
	
}
