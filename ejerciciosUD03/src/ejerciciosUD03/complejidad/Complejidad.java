package ejerciciosUD03.complejidad;

import java.util.Random;
import java.util.Scanner;

public class Complejidad {

	public static void main(String[] args) {

		Complejidad.adivinaNumero();

	}
	
	/*
	 * Este método genera un número aleatorio del 1 al 100. A continuación, va 
	 * pidiendo números y va mostrando por pantalla si el número a adivinar es 
	 * mayor o menor que el introducido, además de los intentos que te quedan 
	 * (tienes 10 intentos para acertarlo). El programa termina cuando se 
	 * acierta el número (además muestra por pantalla en cuantos intentos 
	 * lo has acertado), si se llega al limite de intentos te muestra el 
	 * número que había generado.
	 */
	public static void adivinaNumero() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int aleatorio = r.nextInt(1, 101);
		int intentos = 3;
		int numero;
		
		do {
			System.out.println("Dime un número: ");
			numero = sc.nextInt();
			
			intentos--;
			
			if(numero == aleatorio) {
				System.out.println("Has acertado.");
				System.out.println("Lo has acertado en " + (3-intentos) + " intentos.");
			}
			else if(aleatorio > numero && intentos > 0) {
				System.out.println("El número que tienes que adivinar es mayor. ");
				System.out.println("te quedan " + intentos + " intentos. ");
			}
			else if(aleatorio < numero && intentos > 0) {
				System.out.println("El número que tienes que adivinar es menor. ");
				System.out.println("te quedan " + intentos + " intentos. ");
			}
			else {
				System.out.println("Te has quedado sin intentos. El número era el " + aleatorio);
			}
			
		}
		while(intentos > 0 && numero != aleatorio);
		
	}

	public static void numerosAfortunados() {
		
	}

	public static void validaPassword() {
		
	}
}
