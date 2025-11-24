package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad02 {

	public static void main(String[] args) {
		/*
		 * Pide una cadena y un carácter por teclado (valida que sea un carácter) y
		 * muestra cuantas veces aparece el carácter en la cadena. Entradas: cadena,
		 * caracter (String) Salidas: veces (int)
		 */

		Scanner sc = new Scanner(System.in);

		String cadena;
		String caracter;
		int veces = 0;

		System.out.print("Dime una cadena: ");
		cadena = sc.next(); 

		do {
			System.out.print("Dime un caracter: ");
			caracter = sc.next();
		} while (caracter.length() != 1);

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.substring(i, i + 1).equalsIgnoreCase(caracter)) {
				veces++;
			}
		}

		System.out.printf("El caracter %s aparece %d veces en la cadena %s \n", caracter, veces, cadena);

		sc.close();
	}

}
