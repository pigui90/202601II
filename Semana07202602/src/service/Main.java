package service;

import javax.swing.JOptionPane;

import model.Funcionario;

public class Main {

	public static void main(String[] args) {

		Funcionario fun = new Funcionario();
		
		fun.setCarnet(213123);
		fun.setEdad(40);
		fun.setGradoAcademico("Bachi");
		fun.setNombre("Pablo");
		
		Funcionario fun2 = new Funcionario("Pablo", 40, "Bachi", 858585);
		
		JOptionPane.showMessageDialog(null, fun.toString());
		JOptionPane.showMessageDialog(null, fun2.toString());

		
		if(fun.equals(fun2)) {
			JOptionPane.showMessageDialog(null, "SON IGUALES");
		}else {
			JOptionPane.showMessageDialog(null, "SON DIFERENTES");
		}
		
		
		
	}

}
