package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva20 {

	/*
	 * Pedir tres números y mostrarlos ordenados de mayor a menor
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(numeroMayor(a, b, c));

	}
	
	public static String numeroMayor(int a, int b, int c) {
		String mensaje = "";

		// a > b > c
		if(a > b && b > c) {
			mensaje = String.format("%d > %d > %d", a, b, c);
		}
		// a > c > b
		else if(a > c && c > b) {
			mensaje = String.format("%d > %d > %d", a, c, b);
		}
		// b > a > c
		else if(b > a && a > c) {
			mensaje = String.format("%d > %d > %d", b, a, c);
		}
		// b > c > a
		else if(b > c && c > a) {
			mensaje = String.format("%d > %d > %d", b, c, a);
		}
		// c > a > b
		else if(c > a && a > b) {
			mensaje = String.format("%d > %d > %d", c, a, b);
		}
		// c > b > a
		else if(c > b && b > a) {
			mensaje = String.format("%d > %d > %d", c, b, a);
		}
		else {
			mensaje = "Dos o más números son iguales";
		}
		
		return mensaje;
	}

}
