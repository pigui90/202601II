package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Bienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextArea taDireccion;
	private JSpinner spEdad;
	private JCheckBox chbActivo;
	private JLabel lblRegistros;
	private JButton btnCargaRegistro;
	private JTextArea taCargaArchivo;

	/**
	 * Create the frame.
	 */
	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 11, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(20, 47, 46, 14);
		contentPane.add(lblEdad);

		JLabel ldlDireccion = new JLabel("Direccion");
		ldlDireccion.setBounds(10, 93, 56, 14);
		contentPane.add(ldlDireccion);

		tfNombre = new JTextField();
		tfNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '*') {
					e.consume();
				}
			}
		});
		tfNombre.setBounds(89, 8, 217, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);

		chbActivo = new JCheckBox("Activo");
		chbActivo.setBounds(20, 151, 97, 23);
		contentPane.add(chbActivo);

		spEdad = new JSpinner();
		spEdad.setBounds(89, 44, 52, 20);
		contentPane.add(spEdad);

		taDireccion = new JTextArea();
		taDireccion.setBounds(89, 88, 282, 56);
		contentPane.add(taDireccion);

		JButton btnAgregarPersona = new JButton("Agregar Persona");
		btnAgregarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombre = tfNombre.getText();
					int edad = (Integer) spEdad.getValue();
					String direccion = taDireccion.getText();
					boolean activo = chbActivo.isSelected();
					Persona persona = new Persona();

					persona.setNombre(nombre);
					persona.setEdad(edad);
					persona.setDireccion(direccion);
					persona.setActivo(activo);

					File regPersona = new File("registroPersonas.txt");

					FileWriter fw = new FileWriter(regPersona, true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(persona.toString());
					bw.newLine();
					bw.close();
					JOptionPane.showMessageDialog(btnAgregarPersona, "Guardado con exito");
				} catch (IOException ioE) {
					JOptionPane.showMessageDialog(btnAgregarPersona, ioE.getMessage());
				}
			}
		});
		btnAgregarPersona.setBounds(34, 193, 133, 23);
		contentPane.add(btnAgregarPersona);

		lblRegistros = new JLabel("Registros");
		lblRegistros.setBounds(44, 227, 46, 14);
		contentPane.add(lblRegistros);

		btnCargaRegistro = new JButton("Cargar Registros");
		btnCargaRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser chooser = new JFileChooser();
					chooser.showOpenDialog(btnCargaRegistro);
					File archivo = chooser.getSelectedFile();

					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);

					String contenido = br.readLine();
					String informacion = "";
					while (contenido != null) {
						informacion = informacion + contenido + "\n";
						contenido = br.readLine();
					}
					br.close();
					taCargaArchivo.setText(informacion);
				} catch (IOException ioE) {
					JOptionPane.showMessageDialog(btnCargaRegistro, ioE.getMessage());
				}
			}
		});
		btnCargaRegistro.setBounds(100, 227, 133, 23);
		contentPane.add(btnCargaRegistro);

		taCargaArchivo = new JTextArea();
		taCargaArchivo.setBounds(34, 257, 510, 190);
		contentPane.add(taCargaArchivo);

	}
}
