package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva44 {

	/*
	 * Programa que lea 10 números desde teclado en un proceso repetitivo y 
	 * muestre la suma y promedio. Realizar el programa con <<do-while>>
	 */
	
	public static void main(String[] args) {
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
