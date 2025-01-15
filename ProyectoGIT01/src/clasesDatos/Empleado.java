package clasesDatos;

import java.util.Objects;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private String categoria;
	private boolean clubSocial;  //INDICA SI UN EMPLEADO ESTA EN EL CLUB SOCIAL DE LA EMPRESA
	private float sueldo;
	
	
	public Empleado(String dni, String nombre, String apellidos, String categoria, boolean clubSocial, float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.clubSocial = clubSocial;
		this.sueldo = sueldo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public boolean isClubSocial() {
		return clubSocial;
	}

	//Comentamos el método clubSocial
	public void setClubSocial(boolean clubSocial) {
		this.clubSocial = clubSocial;
	}
	public void setClubSocial() {
		this.clubSocial=true;
	}

	public float getSueldo() {
		return sueldo;
	}


	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
/**
 * Funcion ToString
 */
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", categoria=" + categoria
				+ ", clubSocial=" + clubSocial + ", sueldo=" + sueldo + "]";
	}


@Override
public int hashCode() {
	return Objects.hash(apellidos, categoria, clubSocial, dni, nombre, sueldo);
}

/**
 * Funciones equals y hashCode
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Empleado other = (Empleado) obj;
	return Objects.equals(apellidos, other.apellidos) && Objects.equals(categoria, other.categoria)
			&& clubSocial == other.clubSocial && Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
			&& Float.floatToIntBits(sueldo) == Float.floatToIntBits(other.sueldo);
}

}


