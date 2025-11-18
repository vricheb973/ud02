package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva58 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("1. Opcion 1");
			System.out.println("2. Opcion 2");
			System.out.println("3. Opcion 3");
			System.out.println("4. Opcion 4");
			System.out.println("5. Salir");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1 -> System.out.println("Ejecutando la opcion 1... ");
				case 2 -> System.out.println("Ejecutando la opcion 2... ");
				case 3 -> System.out.println("Ejecutando la opcion 3... ");
				case 4 -> System.out.println("Ejecutando la opcion 4... ");
				default -> System.out.println("Saliendo... ");
			}
		}
		while(opcion >= 1 && opcion <= 4);

	}

}
