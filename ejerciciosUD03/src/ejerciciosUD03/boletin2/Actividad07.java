package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad07 {

	public static void main(String[] args) {
		/*
		 * Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
		 * números a introducir). El programa debe informar de cuantos números
		 * introducidos son mayores que 0, menores que 0 e iguales a 0. Entradas:
		 * cantidad, numero (int) Salidas: menores, iguales, mayores (int)
		 */

		Scanner scanner = new Scanner(System.in);

		int cantidad;
		int numero;
		int mayores = 0;
		int menores = 0;
		int iguales = 0;

		do {
			System.out.println("Cuantos numeros vamos a introducir ");
			cantidad = scanner.nextInt();
		} while (cantidad <= 0);

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Dime el nº" + i + ":");
			numero = scanner.nextInt();

			if (numero < 0) {
				menores++;
			} else if (numero > 0) {
				mayores++;
			} else {
				iguales++;
			}
		}
		System.out.printf("Mayores: %d Menores: %d Iguales: %d \n", mayores, menores, iguales);

		scanner.close();
	}

}
