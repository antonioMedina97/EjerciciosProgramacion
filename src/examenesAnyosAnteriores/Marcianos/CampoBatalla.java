package examenesAnyosAnteriores.Marcianos;

import examenesAnyosAnteriores.Poker.Carta;
import toolbox.Utils;

public class CampoBatalla {
	
	private String nombre;

	Malvado enemigos[] = new Malvado[20];
	Humano aliados[] = new Humano[20];
	/**
	 * @param nombre
	 */
	public CampoBatalla(String nombre) {
		this.nombre = nombre;
		
		for (int i = 0; i < aliados.length; i++) {
			enemigos[i] = new Malvado("Malvado " + i);
			aliados[i] = new Humano("Humano " + i);
		}
		
		enemigos[enemigos.length-1].setPuntosVida(enemigos[enemigos.length-1].getPuntosVida() * 2); 
		
		aliados[aliados.length-1].setPuntosVida(aliados[aliados.length-1].getPuntosVida() * 2);
		
		
	}
	
	public void mezclar() {
		
		int aux1, aux2;
		Humano auxAliados;
		for (int i = 0; i < aliados.length*2; i++) {
			aux1 = (int) Math.round(Math.random()* (aliados.length-1));
			aux2 = (int) Math.round(Math.random()* (aliados.length-1));
			
			auxAliados = aliados[aux1];
			aliados[aux1] = aliados[aux2];
			aliados[aux2] = auxAliados;
		}
		
		Malvado auxEnemigos;
		for (int i = 0; i < enemigos.length*2; i++) {
			aux1 = (int) Math.round(Math.random()* (aliados.length-1));
			aux2 = (int) Math.round(Math.random()* (aliados.length-1));
			
			auxEnemigos = enemigos[aux1];
			enemigos[aux1] = enemigos[aux2];
			enemigos[aux2] = auxEnemigos;
		}
	}
	
	public void disparaAliado() {
		
	}
	
	public void disparar() {
		
		int primerAliadoVivo = 0;
		for (int i = 0; i < aliados.length; i++) {
			if (aliados[i].getPuntosVida() > 0) {
				primerAliadoVivo = i;
				break;
			}
		}
		
		int primerMalvadoVivo = 0;
		for (int i = 0; i < enemigos.length; i++) {
			if (enemigos[i].getPuntosVida() > 0) {
				primerMalvadoVivo = i;
				break;
			}
		}
		
		int disparo = (int) Math.round(Math.random()* (25-5))+5;
		enemigos[primerMalvadoVivo].setPuntosVida(enemigos[primerMalvadoVivo].getPuntosVida() - disparo);
	}
	
	public void mostrarEstado() {
		for (int i = 0; i < aliados.length; i++) {
			System.out.println(aliados[i]);
		}
		
		for (int i = 0; i < enemigos.length; i++) {
			System.out.println(enemigos[i]);
		}
	}
	
	
}
