package ejerciciosUD03.boletin2;

import java.util.Random;

public class Actividad13 {

	public static void main(String[] args) {

		/*
		 * Ya están aquí la segunda ronda de la Copa del Rey y en el Torrent - Real
		 * Betis se esperan bastantes goles, además de la ansiada vuelta de Isco Alarcón
		 * a los terrenos de juego. Un equipo de matemáticos de la Universidad de
		 * Massachusetts ha elaborado un algoritmo para adivinar el resultado y necesita
		 * la colaboración del alumnado del IES Los Alcores para desarrollarlo. El
		 * algoritmo es el siguiente: Se debe generar un número de 9 cifras de manera
		 * aleatoria. El algoritmo debe recorrer este número dígito a dígito. Cuando nos
		 * encontremos un dígito impar anotaremos un gol al Torrent y cuando el dígito
		 * sea par el gol lo anotará el Real Betis Balompié. Además, si el gol del Betis
		 * es múltiplo de 4 es gol de Isco. Finalmente el algoritmo mostrará el número
		 * generado y el resultado del partido. Ejemplos: Número generado: 689379040
		 * TORRENT 4 - 5 BETIS Goles de Isco: 4
		 * 
		 * Número generado: 639988656 TORRENT 5 - 4 BETIS Goles de Isco: 2
		 */

	}

	public static void recorriendoNumero() {
		// Generar aleatorio
		Random r = new Random();
		int aleatorio = r.nextInt(100000000, 1000000000);

		int aux = aleatorio;
		int golesTorrent = 0;
		int golesBetis = 0;
		int golesIsco = 0;

		// Recorrer aleatorio
		while (aux > 0) {
			int digito = aux % 10;

			// Contar los goles
			if (digito % 2 == 0) {
				if (digito % 4 == 0) {
					golesIsco++;
				}
				golesBetis++;
			} else if (digito % 2 == 1) {
				golesTorrent++;
			}

			aux = aux / 10;
		}

		System.out.println("Número generado: " + aleatorio);
		System.out.printf("TORRENT %d - %d BETIS \n", golesTorrent, golesBetis);
		System.out.println("Goles de Isco: " + golesIsco);
	}

	public static void generandoDigitosAletorios() {
		String aleatorio = "";
		int golesTorrent = 0;
		int golesBetis = 0;
		int golesIsco = 0;

		for (int i = 0; i < 9; i++) {
			// Vamos generando digitos aleatorios y añadiendolos al String
			Random r = new Random();
			int digito = r.nextInt(10);
			aleatorio = aleatorio + digito;

			// Contar los goles
			if (digito % 2 == 0) {
				if (digito % 4 == 0) {
					golesIsco++;
				}
				golesBetis++;
			} else if (digito % 2 == 1) {
				golesTorrent++;
			}
		}

		System.out.println("Número generado: " + aleatorio);
		System.out.printf("TORRENT %d - %d BETIS \n", golesTorrent, golesBetis);
		System.out.println("Goles de Isco: " + golesIsco);
	}

}
