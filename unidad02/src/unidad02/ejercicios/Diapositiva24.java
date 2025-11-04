package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva24 {
	
	public static void main(String[] args) {
		
		/*
		 * Distinguimos entre una función y otra a la hora de llamarla, mediante
		 * los parámetros que le pasamos. 
		 */
		pedirNumero(10, 20);
		
	}
	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número:");
		int n1 = sc.nextInt();
		
		return n1;
	}
	
	public static int pedirNumero(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número mayor que " + n + ": ");
		int n1 = sc.nextInt();

		return n1;
	}
	
	public static int pedirNumero(int min, int max) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número mayor que " + min + " y menor que " + max + ":");
		int n1 = sc.nextInt();

		return n1;
	}

}
