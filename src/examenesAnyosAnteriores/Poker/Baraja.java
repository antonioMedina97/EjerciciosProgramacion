package examenesAnyosAnteriores.Poker;

import toolbox.Utils;

public class Baraja {
	
	Carta baraja[] = new Carta[52];
	
	
	
	/**
	 * 
	 */
	//Asignar valores a la baraja
	public Baraja() {
		int contadorID = 0;
		String contadorPalo = "";
		for (int i = 0; i < 4; i++) {
			//Cambiar el valor del palo cada 13 cartas creadas
			if (i == 0) {
				contadorPalo = "Picas";
			}
			if (i == 1) {
				contadorPalo = "Diamantes";
			}
			if (i == 2) {
				contadorPalo = "Tréboles";
			}
			if (i == 1) {
				contadorPalo = "Corazones";
			}
			
			//Asignar el valor del palo
			for (int j = 0; j < 13; j++) {
				baraja[contadorID] = new Carta(contadorID, j+1, contadorPalo);
				contadorID++;
			}
		}
	}
	
	//De i==0 a i==51
	public void moverDeAbajoAArriba() {
		//Save first number
		Carta buffer = baraja[0];
			
		//Operate
		for (int i = 0; i < baraja.length; i++) {
		
			if (i == baraja.length - 1) {
				baraja[i]=buffer;
			}
			else {
				baraja[i]=baraja[i+1];
			}
		}
			
	}
	
	//From i==51 to i==0
	public void moverDeArribaAABajo() {
		//Save first card
		Carta buffer = baraja[baraja.length - 1];
		//Operate
		for (int i = baraja.length - 1; i > 0; i--) {
			
			baraja[i] = baraja[i - 1]; 
		}
		baraja[0]= buffer;
	}
	
	public void desordenarBaraja() {
		int aux1, aux2;
		Carta auxiliar;
		for (int i = 0; i < baraja.length*2; i++) {
			aux1 = Utils.generateRandomNum(0, baraja.length - 1);
			aux2 = Utils.generateRandomNum(0, baraja.length - 1);
			
			auxiliar = baraja[aux1];
			baraja[aux1] = baraja[aux2];
			baraja[aux2] = auxiliar;
		}
	}
	
	public void ordenarBaraja() {
		int j;
		Carta auxiliar;
		for (int i = 0; i < baraja.length; i++) {
			
			//Guardar valor para compararlo
			auxiliar = baraja[i];
			
			//Recorrer array hacia atrás comparando
			for (j = i; j > 0 && baraja[j-1].getId() > auxiliar.getId(); j--) {
				baraja[j] = baraja[j - 1];
			}
			baraja[j] = auxiliar;
		}
	}
	
	public void repartirMano(Jugador jugador) {
		Carta nuevaMano[] = new Carta[5];
		for (int i = 0; i < nuevaMano.length; i++) {
			int random;
			do {
				random = Utils.generateRandomNum(0, baraja.length);
			} while (baraja[random] == null);
			nuevaMano[i] = baraja[random];
			baraja[random] = null;
		}
		jugador.setMano(nuevaMano);
	}


	public void imprimirBaraja() {
		System.out.println("Baraja:");
		for (int i = 0; i < baraja.length; i++) {
			System.out.println(baraja[i]);
		}
	}

	
	
	
	
}
