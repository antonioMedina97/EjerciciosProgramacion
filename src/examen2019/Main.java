package examen2019;

public class Main {

	public static void main(String[] args) {
		Lavadero lavadero = new Lavadero();
		Vajilla vajillaLimpia[] = new Vajilla[40];
		int contadorVajillaLimpia = 0;
		
		Vajilla vajillaRota[] = new Vajilla[40];
		int contadorVajillaRota = 0;
		lavadero.mostrarEstado();
		
		for (int i = lavadero.getVajillaALavar().length-1; i > 0; i--) {
			do {
				lavadero.getVajillaALavar()[i].limpiar();
			} while (!lavadero.getVajillaALavar()[i].isLimpio());
			//Mostrar estado
			System.out.println();
			System.out.println(lavadero.getVajillaALavar()[i]);
			if (lavadero.getVajillaALavar()[i].getPosibilidadRomper()) {
				//Si la vajilla se rompe
				System.out.println("Se ha roto");
				vajillaRota[contadorVajillaRota] = lavadero.getVajillaALavar()[i];
				contadorVajillaRota++;
				lavadero.getVajillaALavar()[i] = null;
			}
			else {
				//Si la vajilla sobrevive
				System.out.println("Limpiado sin romperlo");
				vajillaLimpia[contadorVajillaLimpia] = lavadero.getVajillaALavar()[i];
				contadorVajillaLimpia++;
				lavadero.getVajillaALavar()[i] = null;
			
			}
		}
		
		//Estas dos instrucciones de abajo no funcionan ya que en mi array "vajillaLimpia" no están todos los elementos inicializados.
		
		
		//System.out.println("Pieza que ha necesitado más pasadas: \n" + lavadero.getLimpioLento(vajillaLimpia));
		
		//System.out.println("Pieza que ha necesitado menos pasadas: \n" + lavadero.getLimpioRapido(vajillaLimpia));
		
		System.out.println("Piezas que se han roto:\n");
		
		for (int i = 0; i < vajillaRota.length; i++) {
			System.out.println(vajillaRota[i]);
		}
	}

}
