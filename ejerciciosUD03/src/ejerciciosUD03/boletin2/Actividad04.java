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

		usandoPrint();
		
	}

	public static void usandoVariable() {
		Scanner sc = new Scanner(System.in);

		String cadena;
		String caracter1;
		String caracter2;
		String cadenaFinal = "";

		do {
			System.out.print("Dime el primer caracter: ");
			caracter1 = sc.next();
		} while (caracter1.length() != 1);

		do {
			System.out.print("Dime el segundo caracter: ");
			caracter2 = sc.next();
		} while (caracter2.length() != 1);

		do {
			System.out.print("Dime una cadena: ");
			cadena = sc.next();
		} while (cadena.length() == 0);

		for (int i = 0; i < cadena.length(); i++) {
			// Variable auxiliar donde guardamos el caracter actual de la cadena original
			String aux = cadena.substring(i, i + 1);

			if (aux.equalsIgnoreCase(caracter1)) { // Si encontramos el caracter1 lo sustituimos por caracter2
				cadenaFinal = cadenaFinal + caracter2;
			} else {
				cadenaFinal = cadenaFinal + aux; // Si no, ponemos lo que había
			}
		}

		System.out.printf("La cadena resultante es %s \n", cadenaFinal);

		sc.close();
	}

	public static void usandoPrint() {

		Scanner sc = new Scanner(System.in);

		String cadena;
		String caracter1;
		String caracter2;

		do {
			System.out.print("Dime el primer caracter: ");
			caracter1 = sc.next();
		} while (caracter1.length() != 1);

		do {
			System.out.print("Dime el segundo caracter: ");
			caracter2 = sc.next();
		} while (caracter2.length() != 1);

		do {
			System.out.print("Dime una cadena: ");
			cadena = sc.next();
		} while (cadena.length() == 0);
		
		System.out.printf("La cadena resultante es: ");

		for (int i = 0; i < cadena.length(); i++) {
			// Variable auxiliar donde guardamos el caracter actual de la cadena original
			String aux = cadena.substring(i, i + 1);

			if (aux.equalsIgnoreCase(caracter1)) { // Si encontramos el caracter1 lo sustituimos por caracter2
				System.out.print(caracter2);
			} else {
				System.out.print(aux); // Si no, ponemos lo que había
			}
		}

		System.out.println(); //Salto de línea final

		sc.close();
	}

}
