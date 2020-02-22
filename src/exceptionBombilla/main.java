package exceptionBombilla;

import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args) {
		try {
			getFraseConBombilla();
		} catch (NoHayLuzException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PalabraBrotaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyBoxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LessThanThreeWordsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Error inesperado");
		}

	}

	public static void getFraseConBombilla() throws NoHayLuzException,
													PalabraBrotaException,
													EmptyBoxException,
													LessThanThreeWordsException{
		
		String frase = JOptionPane.showInputDialog("Introduzca frase con la palabra \"BOMBILLA\"");
		
		//Si la caja de texto está vacía
		if (frase.trim().equals("")) {
			throw new EmptyBoxException(" La caja de texto está vacía ");
		}
		
		//Si la cantidad de palabras es inferior a 3
		String palabras[] = frase.split("[ ]{1,}");
		if (palabras.length < 3) {
			throw new LessThanThreeWordsException(" Hay menos de tres palabras en la frase ");
		}
		
		//No aparece la palabra "bombilla"
		if (frase.toUpperCase().indexOf("BOMBILLA") == -1) {
			throw new NoHayLuzException(" No se ha introducido la palabra bombilla");
		}
		
		//El filtro bobba
		String[] bobba = new String[] {"tonto", "tonta", "imbecil"};
		for (String shit : bobba) {
			if (frase.toUpperCase().indexOf(shit) != -1) {
				throw new PalabraBrotaException("Palabra " + shit + " encontrada");
			}
		}
		
		//No ha habido errores
		System.out.println(frase);
	}
}
