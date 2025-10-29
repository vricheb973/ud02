package unidad02.ejemplos;

import java.util.Scanner;

public class Diapositiva10 {

	public static void main(String[] args) {

		//Llamamos a la función con un literal (números, palabras, letras, true, false)
		pedirNumeroMayor(9);
		
		//Llamamos a la función con una variable
		int n = 9;
		pedirNumeroMayor(n);
		
		//Llamamos a la función
		pedirNumeroMayor(6*2);
		
		

	}
	
	public static void pedirNumeroMayor(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número mayor que " + n + ": ");
		int n1 = sc.nextInt();
		System.out.println("Has elegido el " + n1);
	}

}
