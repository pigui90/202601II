package service;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Bienvenidos a Progra 2");

		String nombre = JOptionPane.showInputDialog("Indique su nombre por favor");

		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

		int opcion = 0;
		String op = JOptionPane.showInputDialog("Digite el numero de ejercicio a probar");
		opcion = Integer.parseInt(op);
		switch (opcion) {
		case 1:
			double numero = 0;

			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));

			while (numero != 0) {

				if (numero > 0) {
					String resultados = "";
					for (int i = 1; i <= numero; i++) {
						resultados = resultados + "\n" + i + " / " + numero + " = " + i / numero;

					}

					JOptionPane.showMessageDialog(null, resultados);

				}

				numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));

			}
			break;
		case 2:

			String palabra = "";

			palabra = JOptionPane.showInputDialog("Ingrese una palabra");

			while (!palabra.equals("fin")) {
				String deletreado = "";
				for (int i = 0; i < palabra.length(); i++) {
					deletreado = deletreado + " " + palabra.charAt(i);
				}

				JOptionPane.showMessageDialog(null, deletreado);

				palabra = JOptionPane.showInputDialog("Ingrese una palabra");

			}

			break;
		case 3:
			String concatenar = "";
			double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero"));
			double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero"));

			double resultadoTotal = 0;
			resultadoTotal = resultadoTotal + (num1 + num2);
			concatenar = concatenar + " " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n";
			resultadoTotal = resultadoTotal + (num1 - num2);
			concatenar = concatenar + " " + num1 + " - " + num2 + " = " + (num1 - num2) + "\n";
			resultadoTotal = resultadoTotal + (num1 / num2);
			concatenar = concatenar + " " + num1 + " / " + num2 + " = " + (num1 / num2) + "\n";
			resultadoTotal += (num1 * num2);
			concatenar = concatenar + " " + num1 + " * " + num2 + " = " + (num1 * num2) + "\n";
			concatenar += "La suma de los resultados es: " + resultadoTotal;

			JOptionPane.showMessageDialog(null, concatenar);
			break;
		case 4:

			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor no programado");
			break;
		}

	}

}
