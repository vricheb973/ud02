package ejerciciosUD03.boletin3;

import java.util.Random;
import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {
		/*
		 * Programa que pinta por pantalla una serpiente con un “serpenteo” aleatorio.
		 * La cabeza se representará con el carácter @ y se debe colocar exactamente en
		 * la posición 13 (con 12 espacios delante). A partir de ahí, el cuerpo irá
		 * serpenteando de la siguiente manera: Se generará de forma aleatoria un valor
		 * entre tres posibles que hará que el siguiente carácter se coloque una
		 * posición a la izquierda del anterior (-1), alineado con el anterior (0) o una
		 * posición a la derecha (1) del anterior. La longitud de la serpiente se pedirá
		 * por teclado. Entradas: longitud (int) Salidas: (String)
		 */

		Scanner sc = new Scanner(System.in);

		int longitud;

		do {
			System.out.print("Dime la longitud de la serpiente: ");
			longitud = sc.nextInt();
		} while (longitud < 3); // Forzamos longitud 3 para que haya "serpenteo"

		System.out.println("Comenzamos el serpenteo: ");

		// Dibujamos la cabeza
		System.out.println("            @");
		int espacios = 12; // Variable auxiliar para guardar los espacios
		for (int i = 0; i < longitud; i++) {
			Random r = new Random();
			int movimiento = r.nextInt(-1, 2); // Aleatorio entre -1 y 1
			espacios = espacios + movimiento;
			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		sc.close();
	}

}
