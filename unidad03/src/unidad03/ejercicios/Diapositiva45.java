package unidad03.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Diapositiva45 {
	
	/*
	 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El 
	 * jugador tendrá que introducir la solución de la suma de dos números 
	 * aleatorios comprendidos entre 1 y 100. Mientras la solución introducida 
	 * sea correcta, el juego continuará. En caso contrario, el programa 
	 * terminará y mostrará el número de operaciones realizadas correctamente.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		int suma;
		int aciertos = 0;
		int intentos = 0;
		
		do {
			Random r = new Random();
			
			// [origin, bound)
			numero1 = r.nextInt(1, 101);
			numero2 = r.nextInt(1, 101);
			
			
			System.out.printf(" ¿%d + %d? \n", numero1, numero2);
			suma = sc.nextInt();
			
			if(numero1+numero2 == suma) {
				aciertos++;
			}
			
			intentos++;
		}
		while(numero1+numero2 == suma);
		
		System.out.println("Has acertado " + aciertos + " de " + intentos + " intentos. ");
	}

}
