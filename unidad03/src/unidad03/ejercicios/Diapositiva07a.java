package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva07a {
	
	/*
	 * Escribe una aplicación que pida al usuario dos números enteros y 
	 * muestre true si ambos números son distintos entre sí o alguno de 
	 * ellos es cero; y false en caso contrario.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer número:");
		int num1 = sc.nextInt();
		
		System.out.println("Dime el segundo número:");
		int num2 = sc.nextInt();
		
		boolean condicion = (num1 != num2) || (num1 == 0 || num2 == 0);
		System.out.println(condicion);

	}

}
