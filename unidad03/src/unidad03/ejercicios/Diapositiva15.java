package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva15 {
	
	/*
	 * Pedir dos números enteros y decir si son iguales o no.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		int n1 = sc.nextInt();
		
		System.out.println("Dime el segundo numero");
		int n2 = sc.nextInt();
		
		if(n1 == n2) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		
	}

}
