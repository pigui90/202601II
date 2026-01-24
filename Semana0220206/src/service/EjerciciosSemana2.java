package service;

import javax.swing.JOptionPane;

/**
 * Ejercicios de la semana 2 para hacer en clases
 */
public class EjerciciosSemana2 {

	/**
	 * Constructor de la clase
	 */
	public EjerciciosSemana2() {

	}

	/**
	 * Metodo utilizado para poder ejecutar el proyecto
	 * 
	 * @param args Parametro por defecto de JAVA
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;

		do {

			try {
				opcion = Integer.parseInt(JOptionPane
						.showInputDialog("1- Ejercicio 1\n2- Ejercicio 2\n3- Ejercicio 3\n4- Ejercicio 4\n5- Salir"));
				switch (opcion) {
				case 1:
					// se invoca el metodo determinarParOImpar
					determinarParOImpar();
					break;
				case 2:
					// se obtiene un numero aleatorio con la clase Math
					double numRandom = (Math.random() * 10) + 1;
					// se invoca el metodo adivinarNumeroAleatorio
					adivinarNumeroAleatorio(numRandom);
					break;
				case 3:

					boolean divisionCorrecta = false;
					double numero1;
					double numero2;

					do {
						try {
							// se piden 2 numeros decimales al usuario
							numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
							numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
							// numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer
							// valor"));
							// numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer
							// valor"));

							// se valida que el divisor sea diferente a 0
							if (numero2 == 0) {
								JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Problemas!!!!!",
										JOptionPane.ERROR_MESSAGE);
								divisionCorrecta = false;
							} else {
								JOptionPane.showMessageDialog(null,
										"El resultado de la division es " + (numero1 / numero2));
								divisionCorrecta = true;
							}

						} catch (NumberFormatException nfe) {
							// se captura la excepcion si se digita un valor no numerico
							JOptionPane.showMessageDialog(null, "No digito un valor numerico", "Error Fatal!!!!!",
									JOptionPane.ERROR_MESSAGE);
							divisionCorrecta = false;
						} catch (ArithmeticException ae) {
							// se captura la excepcion si se digita un 0 en el divisor
							JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Error Fatal!!!!!",
									JOptionPane.ERROR_MESSAGE);
							divisionCorrecta = false;
						}

					} while (!divisionCorrecta);

					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Saliendo del sistema", "Bye Bye", JOptionPane.WARNING_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no valida", "Revise por favor",
							JOptionPane.WARNING_MESSAGE);
					break;
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "No digito un valor numerico", "Error Fatal!!!!!",
						JOptionPane.ERROR_MESSAGE);
				opcion = 0;

			}
		} while (opcion != 5);
	}

	/**
	 * Metodo para determinar si un numero es par o impar, el numero se solicita
	 * dentro del metodo
	 */
	public static void determinarParOImpar() {
		int numero;
		try {
			do {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

				if (numero <= 0) {
					JOptionPane.showMessageDialog(null, "El numero debe ser mayor a 0 (Positivo)", "Error Fatal!!!!!",
							JOptionPane.ERROR_MESSAGE);
				}
			} while (numero <= 0);

			if (numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "El numero es par");
			} else {
				JOptionPane.showMessageDialog(null, "El numero es impar", "IMPAAAR", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "No digito un valor numerico", "Error Fatal!!!!!",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Metodo de juego para adivinar un aleatorio, el numero decimal se le quitan
	 * los decimales para que sea mas facil adivinarlo
	 * 
	 * @param numeroAleatorio Numero con decimales que debe adivinar el usuario
	 */
	public static void adivinarNumeroAleatorio(double numeroAleatorio) {
		int numeroAdivinar = (int) numeroAleatorio;

		int numeroUsuario = 0;

		do {
			try {

				numeroUsuario = Integer
						.parseInt(JOptionPane.showInputDialog("Digite un numero a adivinar entre 1 y 10"));

				if (numeroUsuario == numeroAdivinar) {
					JOptionPane.showMessageDialog(null, "Numero adivinado");
				} else {
					JOptionPane.showMessageDialog(null, "Intente de nuevo");
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "No digito un valor numerico", "Error Fatal!!!!!",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (numeroAdivinar != numeroUsuario);
	}

}
