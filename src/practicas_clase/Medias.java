import javax.swing.JOptionPane;

public class Medias {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca número entero") ;
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca segundo número entero") ;
		int var2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca tercer número entero") ;
		int var3 = Integer.parseInt(str);
				
		int media = (var1 + var2 + var3) / 3;
		System.out.println("La media es " + media);

	}

}
