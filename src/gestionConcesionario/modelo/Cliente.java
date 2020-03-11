package gestionConcesionario.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	int id;
	String nombre;
	String apellidos;
	String localidad;
	String dni;
	String fechaNac;
	Boolean activo;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public Cliente() {
		super();
	}


	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param localidad
	 * @param dni
	 * @param fechaNac
	 * @param activo
	 */
	public Cliente(int id, String nombre, String apellidos, String localidad, String dni, String fechaNac,
			Boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.activo = activo;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the fechaNac
	 */
	public String getFechaNac() {
		System.out.println("fecha");
		return fechaNac;
	}


	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(Date date) throws ParseException{
		if (date != null) {
			this.fechaNac = sdf.format(date);
		}
	}


	/**
	 * @return the activo
	 */
	public Boolean getActivo() {
		return activo;
	}


	/**
	 * @param activo the activo to set
	 */
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	






	@Override
	public String toString() {
		return "Cliente id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad
				+ ", dni=" + dni + ", fechaNac=" + fechaNac + ", activo=" + activo ;
	}
	
	
	
	
	

}
