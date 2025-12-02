package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {
		/*
		 * Pide una cadena y dos caracteres por teclado (valida que sea un carácter),
		 * sustituye la aparición del primer carácter en la cadena por el segundo
		 * carácter. Entradas: cadena, caracter1, caracter2 (String) Salidas:
		 * cadenaFinal (String)
		 */

		usandoVariable();
		
	}
	
	public static void usandoPrint() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena: ");
		String cadena = sc.next();
		
		String caracter1;
		
		do {
			System.out.println("Dime el caracter 1: ");
			caracter1 = sc.next();
		}
		while(caracter1.length() != 1);

		String caracter2;
		
		do {
			System.out.println("Dime el caracter 2: ");
			caracter2 = sc.next();
		}
		while(caracter2.length() != 1);
		
		for(int i=0; i<cadena.length(); i++) {
			String caracter = cadena.substring(i, i+1);
			
			if(caracter.equalsIgnoreCase(caracter1)) {
				System.out.print(caracter2);
			}
			else {
				System.out.print(caracter);
			}
		}
		
		sc.close();
	}
	
	public static void usandoVariable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena: ");
		String cadena = sc.next();
		
		String caracter1;
		
		do {
			System.out.println("Dime el caracter 1: ");
			caracter1 = sc.next();
		}
		while(caracter1.length() != 1);

		String caracter2;
		
		do {
			System.out.println("Dime el caracter 2: ");
			caracter2 = sc.next();
		}
		while(caracter2.length() != 1);
		
		String cadenaCambiada = "";
		
		for(int i=0; i<cadena.length(); i++) {
			String caracter = cadena.substring(i, i+1);
			
			if(caracter.equalsIgnoreCase(caracter1)) {
				cadenaCambiada = cadenaCambiada + caracter2;
			}
			else {
				cadenaCambiada = cadenaCambiada + caracter;
			}
		}
		
		System.out.println(cadenaCambiada);
		
		sc.close();
	}

	

}
