package ejerciciosUD03.boletin3;

import java.util.Scanner;

public class Actividad03 {

	public static void main(String[] args) {
		/*
		 * Programa que sea capaz de insertar un dígito dentro de un número indicando la
		 * posición. El nuevo dígito se colocará en la posición indicada y el resto de
		 * dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
		 * izquierda a derecha empezando por el 1. 
		 * Ejemplo: 
		 * 
		 * Por favor, introduzca un número entero positivo: 406783 
		 * Introduzca la posición donde quiere insertar: 3 
		 * Introduzca el dígito que quiere insertar: 5 
		 * El número resultante es 4056783. 
		 * 
		 * Entradas: numero (long), posicion, digito (int) Salidas: numeroCambiado (long)
		 */
		
		versionUsandoModuloDivision();

	}

	public static void versionUsandoModuloDivision() {
		Scanner sc = new Scanner(System.in);

		long numero;
		long numeroCambiado;
		int posicion;
		int digito;
		long aux; // Variable auxiliar para contar el numero de cifras
		int cifras = 0; //

		do {
			System.out.print("Dime un entero positivo: ");
			numero = sc.nextLong();
		} while (numero <= 0);

		aux = numero;

		while (aux > 0) {
			aux = aux / 10;
			cifras++;
		}

		do {
			System.out.print("Dime la posicion donde quieres insertar: ");
			posicion = sc.nextInt();
		} while (posicion > cifras || posicion < 1);

		do {
			System.out.print("Dime el digito que quieres insertar: ");
			digito = sc.nextInt();
		} while (digito > 9 || digito < 0);

		int corte = (int) Math.pow(10, cifras - posicion + 1); // Aquí guardamos la cantidad por la que tenemos que
																// dividir o hacer el módulo
		long parteIzq = numero / corte; // Guardamos la parte a la izquierda de la posicion
		long parteDer = numero % corte; // Guardamos la parte a la derecha de la posicion
		parteIzq = (parteIzq * 10 + digito) * corte; // Desplazo 1 a la izquierda, sumo el digito y añado ceros para
														// poder sumar la parte derecha
		
		
		numeroCambiado = parteIzq + parteDer;

		System.out.printf("El número resultante es %d \n", numeroCambiado);

		sc.close();
	}

	public static void versionHaciendoTrampasJeje() {
		Scanner sc = new Scanner(System.in);

		int posicion;
		Integer numero;
		int digito;
		String resultado = "";

		do {
			System.out.print("Dime un entero positivo: ");
			numero = sc.nextInt();
			System.out.print("Dime la posicion donde quieres insertar: ");
			posicion = sc.nextInt();
			System.out.print("Dime el digito que quieres insertar: ");
			digito = sc.nextInt();
		} while (numero <= 0 || posicion <= 0);
		
		// Convertimos el número a String
		resultado = numero.toString().substring(0, posicion - 1) + digito
				+ numero.toString().substring(posicion - 1, numero.toString().length());

		// Mostramos el resultado
		System.out.println("El dígito nuevo es: " + resultado);

		sc.close();
	}

}
