package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long numero;
		int pares = 0;
		int sumaPares = 0;
		
		do {
			System.out.println("Dime un entero positivo: ");
			numero = sc.nextLong();
		}while(numero <= 0);
		
		long aux = numero;
		
		while(aux > 0) {
			int digito = (int) aux%10;

			if(digito%2 == 0) {
				pares++;
				sumaPares += digito;
			}
			
			aux /= 10;
		}
		
		System.out.printf("El número %d tiene %d dígitos pares y suman %d \n", numero, pares, sumaPares);
		
		sc.close();
	}

}
