import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca número entero");
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca número entero");
		int var2 = Integer.parseInt(str);
		
		JOptionPane.showMessageDialog(null, "En la variable 1 está en número " + var1 + " y en la variable 2 está " + var2);
		JOptionPane.showMessageDialog(null, "¡¡¡CAMBIAR!!!");
		
		int apoyo = var1;
		var1 = var2; 
		var2 = apoyo;
		JOptionPane.showMessageDialog(null, "En la variable 1 está en número " + var1 + " y en la variable 2 está " + var2);
		
	
	}

}
