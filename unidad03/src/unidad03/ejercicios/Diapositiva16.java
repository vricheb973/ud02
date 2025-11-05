package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva16 {

	/*
	 * Solicitar dos números enteros y mostrar cuál es el mayor.
	 */
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in); 
		
		System.out.print("Introduce el primer numero: ");
		int n1 = s.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int n2 = s.nextInt();

		if (n1>n2) {
			System.out.println(n1 + "(primer numero introducido) es mayor que " + n2);		
		} 
			else if (n2>n1) {
				System.out.println(n2 + "(segundo numero introducido) es mayor que " + n1);		
			} 
				else {
					System.out.println("Ambos numeros son iguales");
				}

	}

}
