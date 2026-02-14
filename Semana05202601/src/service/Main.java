package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String menu = "Menu practica\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Ejercicio 5\n12. Salir";
		int opcion = 0;
		int numero1;
		int numero2;
		double num1;
		double num2;
		do {
			try {

				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

				switch (opcion) {
				case 1:
					numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
					numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro valor"));

					encontrarNumerosImpares(numero1, numero2);
					break;

				case 2:
					String nombreCompleto = JOptionPane.showInputDialog("Ingrese su nombre");

					String nombreInverso = "";

					for (int i = nombreCompleto.length() - 1; i >= 0; i--) {
						if (nombreCompleto.charAt(i) == ' ') {
							nombreInverso = nombreInverso + "\n";
						} else {
							nombreInverso = nombreInverso + nombreCompleto.charAt(i) + " ";
						}
					}

					JOptionPane.showMessageDialog(null, nombreInverso);

					break;

				case 3:
					num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor"));
					num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor"));
					sumarHastaIguales(num1, num2);
					break;
				case 4:
					LocalDate hoy = LocalDate.now();
					for (int i = 1; i <= 7; i++) {
						JOptionPane.showMessageDialog(null, hoy.plusDays(i));
					}
					break;
				case 5:
					try {
						int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
						String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
						String fechaNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento");
						SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
						Date fechaNac = formateador.parse(fechaNacimiento);

						JOptionPane.showMessageDialog(null, "Sus datos son: \nEdad: " + edad + "\nNombre: " + nombre
								+ "\nFecha Nacimiento: " + formateador.format(fechaNac));
					} catch (ParseException e) {
						JOptionPane.showMessageDialog(null, "Error al digitar la fecha", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 12:
					JOptionPane.showMessageDialog(null, "Saliendo", "Adiosin", JOptionPane.WARNING_MESSAGE);

					break;
				default:
					JOptionPane.showMessageDialog(null, "Valor no encontrado", "Error", JOptionPane.WARNING_MESSAGE);

					break;
				}

			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Error al digitar un valor", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (opcion != 12);
	}

	public static void encontrarNumerosImpares(int num1, int num2) {
		String numImpares = "";
		if (num1 < num2) {

			for (int i = num1 + 1; i < num2; i++) {
				if (i % 2 != 0) {
					numImpares = numImpares + i + " ";
				}
			}

		} else {
			for (int i = num2 + 1; i < num1; i++) {
				if (i % 2 != 0) {
					numImpares = numImpares + i + " ";
				}
			}
		}

		JOptionPane.showMessageDialog(null, numImpares);

	}

	public static void sumarHastaIguales(double num1, double num2) {

		if (num1 < num2) {
			while (num1 != num2) {
				num1 = num1 + 0.25;
				num2 = num2 - 0.25;
				JOptionPane.showMessageDialog(null, "num1 " + num1 + " num2 " + num2);
			}
		} else {
			while (num1 != num2) {
				num2 += 0.25;
				num1 -= 0.25;
				JOptionPane.showMessageDialog(null, "num1 " + num1 + " num2 " + num2);
			}
		}

	}

}
