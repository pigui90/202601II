package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Digite el primer numero");
		numero1 = scan.nextInt();
		System.out.println("Digite el segundo numero");
		numero2 = scan.nextInt();
		System.out.println("Digite el tercero numero");
		numero3 = scan.nextInt();
		
		ejercicio1(numero1, numero2, numero3);
		
		scan.close();

	}
	
	public static void ejercicio1(int num1, int num2, int num3) {
		if(num1 % 2 == 0) {
			System.out.println("La suma es " + (num1+num2+num3));
		}else {
			System.out.println("La multiplicacion es " + (num1*num2*num3));

		}
	}

}
