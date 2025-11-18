package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			//5 
			System.out.println("Dime un número positivo: ");
			numero = sc.nextInt();
		}
		while(numero < 1);
		
		int factorial = 1;
		
		// 5! = 5x4x3x2x1 = 120
		
		System.out.print(numero + "! = ");
		
		for(int i=numero; i >= 1; i--) {
			factorial = factorial * i;
			
			System.out.print(i);
			if(i > 1) {
				System.out.print("x");
			}
		}		
		
		System.out.println(" = " + factorial);
		
		sc.close();

	}

}
