package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad03 {

	public static void main(String[] args) {
		/*
		 * Suponiendo que hemos introducido una cadena por teclado que representa una
		 * frase (palabras separadas por espacios), realiza un programa que cuente
		 * cuantas palabras tiene. Entradas: frase (String) Salidas: nPalabras (int)
		 */

		Scanner sc = new Scanner(System.in);

		String frase;
		int nPalabras = 1;

		do {
			System.out.print("Dime una frase: ");
			frase = sc.nextLine();
		} while (frase.length() == 0);

		for (int i = 0; i < frase.length(); i++) {
			if (frase.substring(i, i + 1).equalsIgnoreCase(" ")) {
				nPalabras++;
			}
		}

		System.out.printf("La frase tiene %d palabras \n", nPalabras);

		sc.close();
	}

}
