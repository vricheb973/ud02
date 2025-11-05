package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número:");
		int n = sc.nextInt();
		
		String mensaje = "Es impar";
		
		if(n % 2 == 0) {
			mensaje = "Es par";
		}

		System.out.println(mensaje);
		
	}

}
