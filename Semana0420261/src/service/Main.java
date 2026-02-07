package service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

			String fechaStr = formateador.format(new Date());
			// Muestro la fecha en String
			JOptionPane.showMessageDialog(null, fechaStr);

			Date fecha = formateador.parse("07/02/2026 08:32:50");
			// Muestro el Date
			JOptionPane.showMessageDialog(null, fecha);
			
			LocalDate fechaLD = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			// Muestro el LocalDate
			fechaLD = fechaLD.plusDays(7);
			JOptionPane.showMessageDialog(null, fechaLD);
			
			
			BigDecimal salario = new BigDecimal("1000000");
			BigDecimal anualidad = new BigDecimal(50000);
			BigDecimal renta = new BigDecimal(0.10);
			BigDecimal salarioNeto = BigDecimal.ZERO;
			BigDecimal salarioTotal = new BigDecimal(0);

			salarioNeto = salarioNeto.add(salario).add(anualidad);
			salarioNeto = salarioNeto.subtract(salarioNeto.multiply(renta, MathContext.DECIMAL32));
			
			JOptionPane.showMessageDialog(null, salarioNeto);
			
			
			String menu = "*********************\n"
					+ "Escoja una opcion\n"
					+ "1- Ejercicio 1\n"
					+ "2- Ejercicio 2\n"
					+ "3- Ejercicio 3\n"
					+ "4- Salir\n"
					+ "*********************\n"
					+ "¿cual quiere?";
			
			int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Error al convertir a Date", "Error de parseo",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
