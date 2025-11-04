package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva20 {
	
	/*
	 * Diseñar la función pedirNumeroMayor( ) a la que se le pasen 
	 * el máximo y el mínimo y pida un número comprendido entre 
	 * ambos. La función devolverá el número introducido 
	 * por el usuario.
	 */

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		int minimo = 10;
		int maximo = 20;
		
		int numero = pedirNumeroMayor(minimo, maximo);
		funcionTonta(scanner1);

	}
	
	//Cuando tenemos variables de tipo objeto, el paso de parámetros se hace por copia
	// pero se copia la referencia en memoria del objeto
	//Si hago modificaciones del parámetro, SI afecta al objeto del método main
	public static void funcionTonta(Scanner scanner2) {
		scanner2.close();
	}
	
	//Cuando tenemos variables de tipo primitivo, el paso de parámetros se hace por copia
	// pero se copia el valor de esa variable
	//Si hago modificaciones del parámetro, no afecta a las variables del método main
	public static int pedirNumeroMayor(int min, int max) {
		min++;
		max--;

		return min;
	}	
	
	
	
	
	
	
	

}
