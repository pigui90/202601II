package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * 
 */
public class EjercicioSemana4 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String menu = "*********************\n" + "Escoja una opcion\n" + "1- Ejercicio 1\n" + "2- Ejercicio 2\n"
				+ "3- Ejercicio 3\n" + "4- Salir\n" + "*********************\n" + "¿cual quiere?";
		int opcion;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:

				numerosAmigos();

				break;
			case 2:

				compararFechas();

				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Saliendo pa afuera", "JAJAJA", JOptionPane.WARNING_MESSAGE);

				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcion no existe", "OH-OH", JOptionPane.WARNING_MESSAGE);
				break;

			}

		} while (opcion != 4);
	}

	/**
	 * 
	 */
	public static void numerosAmigos() {
		try {
			int numero1;
			int numero2;
			int divisores1 = 0;
			int divisores2 = 0;

			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

			for (int i = 1; i < numero1; i++) {
				if (numero1 % i == 0) {
					divisores1 = divisores1 + i;
				}
			}

			for (int i = 1; i < numero2; i++) {
				if (numero2 % i == 0) {
					divisores2 = divisores2 + i;
				}
			}

			if (divisores2 == numero1 && divisores1 == numero2) {
				JOptionPane.showMessageDialog(null, "Son amigos");
			} else {
				JOptionPane.showMessageDialog(null, "No son amigos", "Ups", JOptionPane.WARNING_MESSAGE);

			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error en el numero", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void compararFechas() {
		try {
			int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
			int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
			int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
			int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el hora"));
			int minuto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el minuto"));
			int segundo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundos"));

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

			String fechaStr = dia + "/" + mes + "/" + year + " " + hora + ":" + minuto + ":" + segundo;
			
			Date fecha = sdf.parse(fechaStr);
			Date hoy = new Date();
			
			if(fecha.before(hoy)) {
				JOptionPane.showMessageDialog(null, "La fecha esta antes de hoy");
			}else {
				if(fecha.after(hoy)) {
					JOptionPane.showMessageDialog(null, "La fecha esta despues de hoy");
				}else {
					JOptionPane.showMessageDialog(null, "La fecha es igual a hoy");
				}
			}
		} catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Al convertir la fecha da error", "Error!!", JOptionPane.ERROR_MESSAGE );
		}catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "El dato no es un numero correcto", "Error!!", JOptionPane.ERROR_MESSAGE );
		}
	}
}
