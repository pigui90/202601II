package model;

public class Persona {

	private String nombre;
	private int edad;
	private String direccion;
	private boolean activo;

	public Persona(String nombre, int edad, String direccion, boolean activo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.activo = activo;
	}

	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean getActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Direccion: " + getDireccion() + " Activo: " + getActivo();
	}

}
