package clasesDatos;

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
	
}


