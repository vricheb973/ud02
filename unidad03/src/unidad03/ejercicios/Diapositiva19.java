package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva19 {

	/*
	 * Escribir una aplicación que indique cuántas cifras tiene un número entero
	 * introducido por teclado que estará comprendido entre 0 y 99999.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce el primer numero: ");
		int n1 = s.nextInt();
		
		if (n1<10 && n1>=0) {
			System.out.println("tiene 1 cifra");
		}
		else if (n1<100 && n1>=10) {
			System.out.println("tiene 2 cifra");
		}
		else if (n1<1000 && n1>=100) {
			System.out.println("tiene 3 cifra");
		}
		else if (n1<10000 && n1>=1000) {
			System.out.println("tiene 4 cifra");
		}
		else if (n1<100000 && n1>=10000) {
			System.out.println("tiene 5 cifra");
		}
		else {
			System.out.println("error");
		}

	}

}
