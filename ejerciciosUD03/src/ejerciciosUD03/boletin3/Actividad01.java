package ejerciciosUD03.boletin3;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		/*
		 * Realiza un conversor del sistema decimal al sistema de “palotes”. Ejemplo:
		 * Por favor, introduzca un número entero positivo: 47021 El 47021 en decimal es
		 * el |||| - ||||||| - - || - | en el sistema de palotes. Entradas: numero (int)
		 * Salidas: (String)
		 */

		versionConcatenandoPorLaIzquierda();
	}

	public static void versionConcatenandoPorLaIzquierda() {
		Scanner sc = new Scanner(System.in);

		int numero;
		int aux; // Variable auxiliar para guardar el numero
		String palotes = "";

		do {
			System.out.print("Dime un número: ");
			numero = sc.nextInt();
		} while (numero <= 0);

		aux = numero;

		while (aux > 0) {
			int digito = aux % 10;

			for (int i = 0; i < digito; i++) {
				palotes = "|" + palotes; // Concatenamos por la izquierda porque el número lo leemos de derecha a
											// izquierda
			}

			aux = aux / 10;
			if (aux > 0) { // La condición es para no dibujar el último guión
				palotes = " - " + palotes;
			}
		}

		System.out.printf("El número %d en el sistema de palotes es: %s \n", numero, palotes);

		sc.close();
	}

	public static void versionUsandoPrint() {
		Scanner sc = new Scanner(System.in);

		int numero;

		do {
			System.out.print("Dime un número: ");
			numero = sc.nextInt();
		} while (numero <= 0);

		//Le damos la vuelta al número
		int volteado = 0;

        while (numero > 0) {
        	volteado = (volteado * 10) + (numero % 10);
            numero = numero / 10;
        }

		System.out.printf("El número %d en el sistema de palotes es: ", numero);
		
		while (volteado > 0) {
			int digito = volteado % 10;

			for (int i = 0; i < digito; i++) {
				System.out.print("|"); //Podemos imprimir o concatenar por la derecha
			}

			volteado = volteado / 10;
			if (volteado > 0) { // La condición es para no dibujar el último guión
				System.out.print(" - ");
			}
		}
		
		System.out.println();

		sc.close();
	}

}
