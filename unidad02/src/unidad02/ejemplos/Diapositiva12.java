package unidad02.ejemplos;

import java.util.Scanner;

public class Diapositiva12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		funcionRara(sc);
		
	}
	
	public static void funcionRara(Scanner s) {
		s.close();
	}

	
	public static void sumaUno(int a) {
		a = a + 1;
		System.out.println(a);
	}
	
	public static void suma(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println(resultado);
	}

}
