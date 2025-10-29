package unidad02.ejemplos.estaticas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		Math.sqrt(4);

		ClasePrueba c = new ClasePrueba();
		c.saludar();

		ClasePrueba.saludo();
		
	}

}
