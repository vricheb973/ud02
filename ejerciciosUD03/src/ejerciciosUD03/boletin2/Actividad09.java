package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad09 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida el limite inferior y superior de un intervalo.
		 * Si el límite inferior es mayor que el superior lo tiene que volver a pedir. A
		 * continuación se van introduciendo números hasta que introduzcamos el 0.
		 * Cuando termine el programa dará las siguientes informaciones: La suma de los
		 * números que están dentro del intervalo (intervalo abierto). Cuantos números
		 * están fuera del intervalo. Se informa si hemos introducido algún número igual
		 * a los límites del intervalo. Entradas: limiteInferior, limiteSuperior, numero
		 * (int) Salidas: sumaIntervalo, cantidadFuera (in), limites (boolean)
		 */

		Scanner sc = new Scanner(System.in);

		int limiteInferior;
		int limiteSuperior;
		int numero;
		int sumaIntervalo = 0;
		int cantidadFuera = 0;
		boolean limites = false;

		do {
			System.out.println("Dime el límite Inferior: ");
			limiteInferior = sc.nextInt();
			System.out.println("Dime el límite Superior: ");
			limiteSuperior = sc.nextInt();

		} while (limiteInferior > limiteSuperior);

		do {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();

			if (numero != 0) {
				if (numero > limiteInferior && numero < limiteSuperior) {
					sumaIntervalo += numero;
				} else if (numero < limiteInferior || numero > limiteSuperior) {
					cantidadFuera++;
				} else {
					limites = true;
				}
			}
		} while (numero != 0);

		System.out.printf("La suma es: %d\n", sumaIntervalo);
		System.out.printf("Has introducido %d números fuera del intervalo\n", cantidadFuera);

		if (limites) {
			System.out.println("Has introducido algún nº igual a los límites");
		} else {
			System.out.println("No has introducido algún nº igual a los límites");
		}

		sc.close();
	}
}
