package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad06 {

	public static void main(String[] args) {

		/*
		 * Introducir una cadena de caracteres e indicar si es un palíndromo. Una
		 * palabra palíndroma es aquella que se lee igual adelante que atrás. Entradas:
		 * cadena (String) Salidas: (boolean)
		 */

		Scanner sc = new Scanner(System.in);

		String cadena;
		String cadenaInvertida = "";

		do {
			System.out.print("Dime una cadena: ");
			cadena = sc.nextLine();
		} while (cadena.length() == 0);

		// Recorremos la cadena al revés, también podemos recorrerla al derecho y concatenar por la izquierda.
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cadena.substring(i, i + 1);
		}

		// Lo paso todo a mayusculas
		cadena = cadena.toUpperCase();
		cadenaInvertida = cadenaInvertida.toUpperCase();

		// PALINDROMOS (ACURRUCA, SALAS, RECONOCER, WOW, SOMETEMOS
		if (cadena.equalsIgnoreCase(cadenaInvertida)) {
			System.out.printf("%s - ES UN PALINDROMO  (%s == %s) \n", cadena, cadena, cadenaInvertida);
		} else {
			System.out.printf("%s - NO ES UN PALINDROMO  (%s != %s) \n", cadena, cadena, cadenaInvertida);
		}

		sc.close();

	}

}
