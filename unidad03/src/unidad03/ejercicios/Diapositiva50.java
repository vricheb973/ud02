package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva50 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		//for(inicializacion; condicion; incremento)
		for(int i=1; i<=numero; i++) {
			System.out.println(i);
		}

	}

}
