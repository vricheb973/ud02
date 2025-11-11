package unidad03.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Diapositiva49 {
	
	/*
	 * Implementa la aplicación Película, que pide al usuario un número y muestra en 
	 * pantalla la salida: 
	 * ¿Hoy vamos a ver una peli, Vladi?
	 * ¿Hoy vamos a ver una peli, Vladi?
	 * ¿Hoy vamos a ver una peli, Vladi?
	 * 
	 * Se muestra «¿Hoy vamos a ver una peli, Vladi?...» tantas veces como indique el 
	 * número introducido. La salida anterior sería para el número 3.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un número: ");
		numero = sc.nextInt();
		
		//for(ini ; condicion ; incremento)
		//contando hacia delante
		for(int i=0; i<numero; i++) {
			System.out.println("¿Hoy vamos a ver una peli, Vladi?");
		}
		
		//
		for(int i=numero; i > 0; i--) {
			System.out.println("¿Hoy vamos a ver una peli, Vladi?");
		}
		
	}

}
