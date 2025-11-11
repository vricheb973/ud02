package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva36 {
	
	/*
	 * Desarrollar un programa que permita la carga de 10 enteros por teclado 
	 * y nos muestre posteriormente la suma de los valores ingresados y su 
	 * promedio.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int cont = 0;
		
		while(cont < 3) {
			System.out.println("Dime número"+ (cont+1) + ": ");
			int numero = sc.nextInt();
			
			suma = suma + numero;
			cont++;
		}
		
		double promedio = suma*1.0/cont;
		
		System.out.println("La suma es: " + suma);
		System.out.printf("El promedio es: %.2f \n", promedio);

		sc.close();
	}

}
