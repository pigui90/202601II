package model;

public class Funcionario extends Persona{
	
	private String gradoAcademico;
	private int carnet;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nombre, int edad, String gradoAcademico, int carnet) {
		super(nombre, edad);
		this.carnet = carnet;
		this.gradoAcademico = gradoAcademico;
	}
	
	public String getGradoAcademico() {
		return this.gradoAcademico;
	}
	
	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}
	
	public int getCarnet() {
		return this.carnet;
	}
	
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}

	@Override
	public String muestraPersona() {
		return super.muestraPersona() + "\nGRado Academico: " + this.gradoAcademico + "\nCarnet: " + this.carnet;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Los datos de Funcionario son \nCarnet " + this.carnet + "\nGrado Academico " + this.gradoAcademico + "\nNombre " + this.getNombre() + "\nEdad "  + this.getEdad();
	}
	
	@Override
	public boolean equals(Object obj) {
		Funcionario fun3 = (Funcionario) obj;
		if(fun3.getCarnet() == this.getCarnet() && fun3.getNombre().equals(this.getNombre())) {
			return true;
		}else {
			return false;
		}
	}
}
