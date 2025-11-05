package unidad03.ejemplos;

import java.util.Scanner;

public class SwitchClasico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seleccione una opción:");
		System.out.println("1. Opción 1");
		System.out.println("2. Opción 2");
		System.out.println("3. Opción 3");
		System.out.println("4. Opción 4");
		System.out.println("5. Opción 5");

		int opcion = sc.nextInt();
		switch (opcion){
			case 1:
				System.out.println("Has seleccionado la opción 1. ");
				break;
			case 2:
				System.out.println("Has seleccionado la opción 2. ");
				break;
			case 3:
				System.out.println("Has seleccionado la opción 3. ");
				break;
			case 4:
				System.out.println("Has seleccionado la opción 4. ");
				break;
			case 5:
				System.out.println("Has seleccionado la opción 5. ");
				break;
			default:
				System.out.println("Saliendo del programa...");
		}


	}

}
