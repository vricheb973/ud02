package unidad02.ejemplos;

import java.util.Scanner;

public class Diapositiva17 {

	public static void main(String[] args) {

		int a = pedirNumero() * 2;
		

	}
	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número:");
		int n1 = sc.nextInt();
		
		return n1;
	}

}
