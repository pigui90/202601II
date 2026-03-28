package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		try {
			File archivo = new File("userpass.txt");

			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			String menu = "1. Leer archivo con delimitador\n2. Leer archivo sencillo\n3. Escribir";
			int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opcion) {
			case 1:
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				
				String lineaArchivo = br.readLine();
				String cadena = "";
				int i;
				while (lineaArchivo != null) {
					i = 0;
					do {
						while (i < lineaArchivo.length() && lineaArchivo.charAt(i) != '|') {
							cadena = cadena + lineaArchivo.charAt(i);
							i++;
						}
						i++;
						JOptionPane.showMessageDialog(null, cadena);
						cadena = "";
					} while (i < lineaArchivo.length());
					
					lineaArchivo = br.readLine();
				}
				break;
			case 2:
				FileReader fr2 = new FileReader(archivo);
				BufferedReader br2 = new BufferedReader(fr2);
				
				String contenido = br2.readLine();
				while(contenido!=null) {
					JOptionPane.showMessageDialog(null, contenido);
					contenido = br2.readLine();
				}
				break;
			case 3:
				FileWriter fw = new FileWriter(archivo, true);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("Esto lo ingrese ahorita  a las " + new Date());
				bw.newLine();
				bw.close();
				break;

			default:
				break;
			}
			
			
			

		} catch (IOException ioE) {
			JOptionPane.showMessageDialog(null, ioE.getMessage());
		}
	}
}
