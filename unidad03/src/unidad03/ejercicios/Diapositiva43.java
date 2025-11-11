package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva43 {
	
	/*
	 * Realiza un programa en Java que lea dos números pasados por teclado en 
	 * un proceso repetitivo. Este proceso terminará cuando los números leídos 
	 * sean iguales.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		
		do {
			System.out.println("Dime un número: ");
			numero1 = sc.nextInt();

			System.out.println("Dime otro número: ");
			numero2 = sc.nextInt();
		}
		while(numero1 != numero2);
		
	}

}
