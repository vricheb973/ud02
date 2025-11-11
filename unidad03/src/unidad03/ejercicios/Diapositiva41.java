package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva41 {
	
	/*
	 * Realiza un validador de enteros en Java que lea un número entero cuyo 
	 * rango debe ser entre 1 y 10.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		
		do {
			System.out.println("Dime un número: ");
			numero = sc.nextInt();
			
			if(numero < 1 || numero > 10) {
				System.out.println("El número debe estar entre 1 y 10.");
			}
		}
		while(numero < 1 || numero > 10);
		
		

	}

}
