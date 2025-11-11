package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva42 {
	
	/*
	 * Realiza un validador de caracteres en Java que lea un String que debe ser una vocal.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String caracter;

	}
	
	public static void version1() {
		Scanner sc = new Scanner(System.in);

		String caracter;
		
		do {
			System.out.println("Dame una vocal: ");
			caracter = sc.next();
			
			if(!caracter.equalsIgnoreCase("A") &&
				!caracter.equalsIgnoreCase("E") && 
				!caracter.equalsIgnoreCase("I") && 
				!caracter.equalsIgnoreCase("O") && 
				!caracter.equalsIgnoreCase("U") ) {
				System.out.println("Debes introducir una vocal!!!");
			}
		}
		while(!caracter.equalsIgnoreCase("A") &&
				!caracter.equalsIgnoreCase("E") && 
				!caracter.equalsIgnoreCase("I") && 
				!caracter.equalsIgnoreCase("O") && 
				!caracter.equalsIgnoreCase("U") );
	}
	
	public static void version2() {
		Scanner sc = new Scanner(System.in);

		String caracter;
		
		do {
			System.out.println("Dame una vocal: ");
			caracter = sc.next().toUpperCase();
			
			if(!caracter.equals("A") &&	!caracter.equals("E") && !caracter.equals("I") && 
				!caracter.equals("O") && !caracter.equals("U") ) {
				
				System.out.println("Debes introducir una vocal!!!");
			}
		}
		while(!caracter.equals("A") &&	!caracter.equals("E") && !caracter.equals("I") && 
				!caracter.equals("O") && !caracter.equals("U") );
	}

}
