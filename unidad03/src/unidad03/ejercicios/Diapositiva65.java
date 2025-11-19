package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva65 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double cantidad;
		double total = 0.0;
		
		do {
			System.out.println("Introduzca una cantidad de dinero (para terminar introduzca un 0): ");
			cantidad = sc.nextDouble();
			
			total += cantidad;
		}
		while(cantidad != 0);
		
		System.out.printf("En total tienes %.2f € \n", total);

		sc.close();
	}

}
