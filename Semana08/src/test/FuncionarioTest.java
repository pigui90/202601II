package test;

import static org.junit.Assert.assertTrue;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Funcionario;

class FuncionarioTest {

	static Funcionario funcionario;
	int a;
	int b;
	
	@BeforeAll
	static void inicializacion() throws Exception{
		funcionario = new Funcionario();
		JOptionPane.showMessageDialog(null, "INICIALIZANDO TODO");
	}
	
	@BeforeEach
	void inicializarTest() throws Exception{
		a = 0;
		b = 0;
	}

	@AfterEach
	void finalizacionTest() throws Exception{
		JOptionPane.showMessageDialog(null, "Valores ingresados:\nValor a: " + a + "\nValor b: " + b );
	}
	
	@AfterAll
	static void finalizarTodo() throws Exception{
		JOptionPane.showMessageDialog(null, "TEST FINALIZADO");
	}
	
	@Test
	void testMayor() {
		JOptionPane.showMessageDialog(null, "Test de Mayor");
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para B"));
		
		assertTrue("A no es mayor que B", funcionario.esMayor(a, b));
	}
	
	@Test
	void testMenor() {
		JOptionPane.showMessageDialog(null, "Test de Menor");
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para B"));
		
		assertTrue("A no es menor que B", funcionario.esMenor(a, b));
	}
	
	@Test
	void testIgual() {
		JOptionPane.showMessageDialog(null, "Test de Igual");
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para B"));
		
		assertTrue("A no es igual que B", funcionario.esIgual(a, b));
	}
	
}
