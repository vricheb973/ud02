package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {
		
		pedirNumeroMayor(10, 20);
		

	}
	
	public static void pedirNumeroMayor(int min, int max) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número mayor que " + min + " y menor que " + max + ":");
		int n1 = sc.nextInt();
		System.out.println("Has elegido el " + n1);
	}

}
