package model;

public class Vehiculo {
	private String placa;
	private int anio;
	private String modelo;

	public Vehiculo() {
		super();
	}

	public Vehiculo(String placa, int anio, String modelo) {
		super();
		this.placa = placa;
		this.anio = anio;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Placa: " + getPlaca() + "\nAño: " + getAnio() + "\nModelo: " + getModelo();  
	}

}
