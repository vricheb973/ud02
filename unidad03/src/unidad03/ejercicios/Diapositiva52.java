package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva52 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int suma=0;
		int cont=0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Dime el número " + (i+1) + ": ");
			int numero = sc.nextInt();
			
			suma += numero;
			cont++;
		}
		
		double media = suma*1.0 / cont;
		System.out.printf("La media es %.2f \n", media);

		sc.close();
	}

}
