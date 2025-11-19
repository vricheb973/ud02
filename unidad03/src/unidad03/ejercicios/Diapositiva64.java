package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int numero = sc.nextInt();

		for (int i = numero; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.close();

		version2();
	}

	public static void version1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int numero = sc.nextInt();

		for (int i = numero; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.close();
	}

	public static void version2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			for (int j = i; j <= numero; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.close();
	}

}
