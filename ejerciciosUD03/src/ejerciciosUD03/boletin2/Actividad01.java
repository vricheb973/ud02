package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 'NO VOCAL'
		 * en caso contrario, el programa termina cuando se introduce un espacio.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		String caracter;

		do {
			System.out.print("Dime un caracter: ");
			caracter = sc.nextLine();

			if (caracter.equalsIgnoreCase("A") || caracter.equalsIgnoreCase("E") || caracter.equalsIgnoreCase("I")
					|| caracter.equalsIgnoreCase("O") || caracter.equalsIgnoreCase("U")) {
				System.out.println("ES VOCAL");
			} else {
				System.out.println("NO ES VOCAL");
			}
		} while (!caracter.equals("."));

		sc.close();

	}

}
