package unidad02.ejemplos;

import java.util.Scanner;

public class SobrecargaSuma {

	public static void main(String[] args) {

		// El constructor de Scanner está sobrecargado
		Scanner sc = new Scanner(System.in);
		
		// println() está sobrecargada (recibe muchos tipos de datos).
		System.out.println("Tu nota final es " + 10);

	}
	
	public static int suma(int a, int b){
		int suma;
		suma= a+b;
		return(suma);
	}
	
	/*
	 * El nombre de los parámetros no importa, Java solo se fija en los tipos (int, int)
	 */
	public static double suma(int a2, int b2){
		int suma;
		suma= a+b+c;
		return(suma);
	}

	//función sobrecargada
	public static double suma(int a, double pesoA, int b, double pesoB){
		double suma;
		suma=a*pesoA + b*pesoB;
		return suma;
	}


}
