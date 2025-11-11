package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva37 {
	
	/*
	 * Diseñar un programa que muestre, para cada número introducido por teclado, 
	 * si es par. El proceso se repetirá hasta que el número introducido sea 0.
	 */

	public static void main(String[] args) {
//		version1();
		version2();
	}
	
	public static void version1() {
		Scanner sc = new Scanner(System.in);
		int numero = -1;
		
		while(numero != 0) {
			System.out.println("Dime un número: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0 && numero != 0) {
				System.out.println("El " + numero + " es par.");
			}
			
		}
		
		sc.close();
	}
	
	public static void version2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				System.out.println("El " + numero + " es par.");
			}

			System.out.println("Dime un número: ");
			numero = sc.nextInt();
		}
		
		sc.close();
	}

}
