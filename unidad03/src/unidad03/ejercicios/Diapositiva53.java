package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un número entre 1 y 10: ");
			numero = sc.nextInt();
		}
		while(numero < 1 || numero > 10);
		
		for(int i=1; i<11; i++) {
			System.out.printf("%d x %d = %d \n", numero, i, numero*i);
//			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
		
		sc.close();
	}

}
