package service;

import javax.swing.JOptionPane;

/**
 * Clase principal para la semana 02 de Programacion 2
 * 
 * @author Profe
 * @version 1.0
 */
public class Main {

	/**
	 * Constructor de la clase
	 */
	public Main() {

	}

	/**
	 * Metodo utilizado para poder ejecutar el proyecto
	 * 
	 * @param args Parametro por defecto de JAVA
	 */
	public static void main(String[] args) {
		int numero;
		try {

			// Se pide al usuario un numero y se convierte a int
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

			// Se muestra el numero indicado
			JOptionPane.showMessageDialog(null, numero);

		} catch (NumberFormatException nfe) {
			/*
			 * Se muestra mensaje de error si el valor ingresado es incorrecto
			 */
			JOptionPane.showMessageDialog(null, "Fallo al convertir a numero", "Error!!!", JOptionPane.ERROR_MESSAGE);
		}
		numero = 0;
		int opcion = 0;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		} while (opcion != 3);
	}

	/**
	 * Metodo para realizar divisiones de dos numeros enteros
	 * 
	 * @param numero1 Dividendo de la division
	 * @param numero2 Divisor de la division
	 * @deprecated Desde Programacion 2
	 */
	public static void metodoParaDividir(int numero1, int numero2) {
		int numero = 0;
	}

}
