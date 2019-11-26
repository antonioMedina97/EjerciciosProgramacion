package objetos;

public class Persona {
	String Nombre = "";
	String Apellidos = "";
	String DNI = "";
	String Direccion = "";
	int telefono = 0;
	
	/**
	 * 
	 */
	public Persona () {
		
	}
	
	public Persona(String nombre, String apellidos, String dni, String direccion, int tfn) {
		Nombre = nombre;
		Apellidos = apellidos;
		DNI = dni;
		Direccion = direccion;
		telefono = tfn;
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + Nombre + "\nApellidos: " + Apellidos + "\nDNI: " + DNI + "\nDireccion: " 
						+ Direccion + "\nTelefono: " + telefono );
	}
	
	
}


