package ejerciciosUD03.boletin3;

import java.util.Scanner;

public class Actividad02 {

	public static void main(String[] args) {
		/*
		 * Programa que pinta la letra U por pantalla hecha con asteriscos. El programa
		 * pedirá la altura. El programa inserta un espacio y pinta dos asteriscos menos
		 * en la base para simular la curvatura de las esquinas inferiores. Entradas:
		 * altura (int) Salidas: (String)
		 */

		Scanner sc = new Scanner(System.in);

		int altura;

		System.out.println("El tamaño de la U sera de: ");
		altura = sc.nextInt();

		System.out.println("La U quedaria asi: ");

		for (int i = 0; i < altura - 1; i++) {
			System.out.print("*");

			for (int j = 0; j < altura - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print(" ");
		for (int i = 0; i < altura - 2; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}

}
