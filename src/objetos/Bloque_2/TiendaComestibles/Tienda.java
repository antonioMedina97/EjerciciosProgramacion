package objetos.Bloque_2.TiendaComestibles;

import javax.swing.JOptionPane;

import toolbox.Utils;

public class Tienda {

	public static void main(String[] args) {
		
		Perecedero leche = new Perecedero(Utils.requestUserNumber("Código de artículo"), JOptionPane.showInputDialog("Nombre de artículo"), (float) Utils.requestUserNumber("Precio"), JOptionPane.showInputDialog("Fecha de caducidad"));
		NoPerecedero lataDeAtun = new NoPerecedero(Utils.requestUserNumber("Código de artículo"), JOptionPane.showInputDialog("Nombre de artículo"), (float) Utils.requestUserNumber("Precio"));
		
		System.out.println(leche.toString());
		System.out.println(lataDeAtun.toString());
		
	}

}
