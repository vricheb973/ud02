package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva55 {

	public static void main(String[] args) {
		
		

	}
	
	public static void versionWhile() {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un número positivo: ");
			numero = sc.nextInt();
		}
		while(numero < 1);
		
		while(numero > 0) {
			int digito = numero % 10;
			
			System.out.println(digito);
			
			numero = numero / 10;
		}
		
		sc.close();
	}

	
	public static void versionFor() {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un número positivo: ");
			numero = sc.nextInt();
		}
		while(numero < 1);
		
		for(int i=numero; i>0; i=i/10) {
			int digito = i % 10;
			System.out.println(digito);
		}
		
		sc.close();
	}
	
	public static void versionDoWhile() {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un número positivo: ");
			numero = sc.nextInt();
		}
		while(numero < 1);
		
		do {
			int digito = numero % 10;
			
			System.out.println(digito);
			
			numero = numero / 10;
		}
		while(numero > 0);
		
		sc.close();
	}
}
