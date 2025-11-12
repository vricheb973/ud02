package ejerciciosUD03.complejidad;

import java.util.Random;
import java.util.Scanner;

public class Complejidad {

	public static void main(String[] args) {

		Complejidad.validaPassword();

	}
	
	/*
	 * Este método genera un número aleatorio del 1 al 100. A continuación, va 
	 * pidiendo números y va mostrando por pantalla si el número a adivinar es 
	 * mayor o menor que el introducido, además de los intentos que te quedan 
	 * (tienes 10 intentos para acertarlo). El programa termina cuando se 
	 * acierta el número (además muestra por pantalla en cuantos intentos 
	 * lo has acertado), si se llega al limite de intentos te muestra el 
	 * número que había generado.
	 */
	public static void adivinaNumero() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int aleatorio = r.nextInt(1, 101);
		int intentos = 3;
		int numero;
		
		do {
			System.out.println("Dime un número: ");
			numero = sc.nextInt();
			
			intentos--;
			
			if(numero == aleatorio) {
				System.out.println("Has acertado.");
				System.out.println("Lo has acertado en " + (3-intentos) + " intentos.");
			}
			else if(aleatorio > numero && intentos > 0) {
				System.out.println("El número que tienes que adivinar es mayor. ");
				System.out.println("te quedan " + intentos + " intentos. ");
			}
			else if(aleatorio < numero && intentos > 0) {
				System.out.println("El número que tienes que adivinar es menor. ");
				System.out.println("te quedan " + intentos + " intentos. ");
			}
			else {
				System.out.println("Te has quedado sin intentos. El número era el " + aleatorio);
			}
			
		}
		while(intentos > 0 && numero != aleatorio);
		
		sc.close();
	}
	
	/*
	 * Según cierta cultura, los números de la suerte son el 3, el 7, el 8 y 
	 * el 9. Los números de la mala suerte son el resto: el 0, el 1, el 2, 
	 * el 4, el 5 y el 6. Un número es afortunado si contiene más números de 
	 * la suerte que de la mala suerte. Este método imprime por pantalla si 
	 * un número introducido por el usuario es afortunado o no.
	 */

	public static void numerosAfortunados() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		int buenaSuerte = 0;
		int malaSuerte = 0;
		int aux = numero;
		
		while(numero > 0) {
			int digito = numero % 10;
			
			if(digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				buenaSuerte++;
			}
			else {
				malaSuerte++;
			}
			
			numero = numero / 10;
		}
		
		if(buenaSuerte > malaSuerte) {
			System.out.println("El " + aux + " es afortunado. ");
		}
		else {
			System.out.println("El " + aux + " no es afortunado. ");
		}
		
		sc.close();
	}
	
	/*
	 * Nos han encargado realizar el validador de contraseña de una determinada web. 
	 * El usuario debe introducir una contraseña y si la contraseña es válida, el 
	 * sistema imprime por pantalla “CONTRASEÑA VÁLIDA”, en caso contrario, muestra 
	 * “VUELVE A INTENTARLO” y vuelve a pedirla. La contraseña debe tener un mínimo 
	 * de 10 caracteres. Cómo mínimo debe contener: dos letras mayúsculas, dos letras 
	 * minúsculas, dos números y dos caracteres especiales (@, #, *, %, &, /).
	 * 	NOTA: Te puedes ayudar de las siguientes funciones del tipo String:
	 * 		matches("[a-z]") - Devuelve true si contiene una letra minúscula.
	 * 		matches("[A-Z]") - Devuelve true si contiene una letra mayúscula.
	 * 		matches("[0-9]") - Devuelve true si contiene un número.
	 * 		matches("[@#*%&/]") - Devuelve true si contiene un carácter especial.
	 */

	public static void validaPassword() {
		
		Scanner sc = new Scanner(System.in);
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		int especiales = 0;
		String password;
		do {
			System.out.println("Ingrese una contraseña: ");
			password = sc.next();
			
			for(int i=0; i < password.length(); i++) {
				String caracter = password.substring(i, i+1); 
				
				if(caracter.matches("[a-z]")) {
					minus++;
				}
				else if(caracter.matches("[A-Z]")) {
					mayus++;				
				}
				else if(caracter.matches("[0-9]")) {
					numeros++;
				}
				else if(caracter.matches("[@#*%&/]")){
					especiales++;
				}
			}
			
			if(minus >= 2 && mayus >= 2 && numeros >= 2 && especiales >= 2 && password.length() >= 10) {
				System.out.println("CONTRASEÑA VÁLIDA");
			}
			else {
				System.out.println("VUELVE A INTENTARLO");
			}
		}while(minus < 2 || mayus < 2|| numeros < 2 || especiales < 2 || password.length() < 10);
		
		sc.close();
		
	}
}
