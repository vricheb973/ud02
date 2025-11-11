package unidad03.ejemplos;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {
//		conWhile();
		conDoWhile();
	}
	
	//Hecho con un while
	public static void conWhile() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int numero = sc.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("El " + numero + " es par.");
			}

			System.out.println("Dime un número: ");
			numero = sc.nextInt();
		}

		sc.close();
	}

	//Mismo ejercicio hecho con do-while
	public static void conDoWhile() {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un número: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0 && numero != 0) {
				System.out.println("El " + numero + " es par.");
			}
		}
		while(numero != 0);
		
		sc.close();
	}
}
