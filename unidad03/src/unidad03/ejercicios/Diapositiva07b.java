package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva07b {
	
	/*
	 * Realiza un programa que informe al usuario (mostrando true) si un número 
	 * entero es múltiplo de otro número entero. Ambos números enteros se 
	 * piden por teclado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer número (el múltiplo):");
		int num1 = sc.nextInt();
		
		System.out.println("Dime el segundo número:");
		int num2 = sc.nextInt();
		
		boolean esMultiplo = (num2!=0) && (num1%num2 == 0);
		System.out.println(esMultiplo);

	}

}
