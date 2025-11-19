package unidad03.ejercicios;

public class Diapositiva61 {

	/*
	 * Diseñar una programa que muestre las tablas de multiplicar del 1 al 10.
	 */
	
	public static void main(String[] args) {
		
		for(int i=1; i < 11; i++) {
			System.out.println("LA TABLA DEL " + i);
			for(int j=1; j < 11; j++) {
				System.out.printf("%d x %d = %d \n", i, j, i*j);
			}
			System.out.println("--------------------");
		}	
	}

}
