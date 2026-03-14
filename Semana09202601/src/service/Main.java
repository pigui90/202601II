package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import model.Producto;
import model.Vehiculo;

public class Main {

	public static void main(String[] args) {

		Vehiculo usados[] = new Vehiculo[5];
		List<Producto> productos = new ArrayList<Producto>();

		String menu = "1 Agregar Vehiculos\n2 Mostrar Vehiculos\n3 Agregar Productos\n4 Mostrar Productos\n5 Eliminar Productos\n6 Modificar Productos\n7 Salir";
		int opcion = 0;
		int cantUsados = 0;

		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

				switch (opcion) {
				case 1:
					try {
						String placa = JOptionPane.showInputDialog("Ingrese una placa");
						
						int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año"));
						String modelo = JOptionPane.showInputDialog("Ingrese un modelo");
						usados[cantUsados] = new Vehiculo(placa, anio, modelo);
						cantUsados++;
					} catch (ArrayIndexOutOfBoundsException aiobe) {
						JOptionPane.showMessageDialog(null, "Excedio la cantidad de vehiculos por ingresar", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Error al digitar un valor", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					for (int i = 0; i < usados.length; i++) {
						if (usados[i] != null) {
							JOptionPane.showMessageDialog(null, usados[i].toString());
						}
					}
					break;
				case 3:
					try {
						Producto producto = new Producto();
						producto.setNombre(JOptionPane.showInputDialog("Ingrese el nombre el producto"));
						int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
						double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
						producto.setCantidad(cantidad);
						producto.setPrecio(precio);
						productos.add(producto);
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Error al digitar un valor", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 4:
					for (Producto prod : productos) {
						JOptionPane.showMessageDialog(null, prod.toString());
					}
					break;
				case 5:
					try {
						for (int i = 0; i < productos.size(); i++) {
							JOptionPane.showMessageDialog(null, "Posicion: " + i + "\n" + productos.get(i).toString());
						}
						int posicionEliminar = Integer
								.parseInt(JOptionPane.showInputDialog("Indique una posicion a eliminar"));
						productos.remove(posicionEliminar);
					} catch (ArrayIndexOutOfBoundsException aiobe) {
						JOptionPane.showMessageDialog(null, "La posicion a eliminar no existe", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}

					break;
				case 6:
					try {
						String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto a eliminar");
						for (Iterator<Producto> iteratorProd = productos.iterator(); iteratorProd.hasNext();) {
							Producto producto = iteratorProd.next();
							if (producto.getNombre().equals(nombre)) {
								JOptionPane.showMessageDialog(null, producto.toString());
								producto.setCantidad(
										Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad nueva")));
								double precioNuevo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un nuevo precio"));
								producto.setPrecio(precioNuevo);
								
							}

						}
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Error al digitar un valor", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 7:

					break;

				default:
					JOptionPane.showMessageDialog(null, "Opcion no valida");
					break;
				}

			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Error al digitar un valor", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (opcion != 7);
	}

}
