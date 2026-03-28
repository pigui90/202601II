package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JTextField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 151);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(0, 0, 205));
		lblUsuario.setBounds(32, 14, 76, 14);
		contentPane.add(lblUsuario);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(32, 44, 76, 14);
		contentPane.add(lblPassword);

		tfUsuario = new JTextField();
		tfUsuario.setBounds(123, 11, 86, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);

		tfPassword = new JTextField();
		tfPassword.setBounds(123, 41, 86, 20);
		contentPane.add(tfPassword);
		tfPassword.setColumns(10);

		JButton btnInicioSesion = new JButton("Inicio Sesion");
		btnInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String usuario = "admin";
					String pass = "12345";

					if (usuario.equals(tfUsuario.getText()) && pass.equals(tfPassword.getText())) {
						JOptionPane.showMessageDialog(btnInicioSesion, "Ingreso correcto");

						Bienvenida bienvenida = new Bienvenida();
						bienvenida.setVisible(true);
						setVisible(false);

					} else {
						JOptionPane.showMessageDialog(btnInicioSesion, "Datos no coinciden", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnInicioSesion, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnInicioSesion.setBounds(42, 78, 166, 23);
		contentPane.add(btnInicioSesion);

	}
}
