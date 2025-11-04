package unidad02.ejemplos;

public class Sobrecarga {
	public static void main(String[] args) {
		
		funcion(0.0, 0);
		funcion(0, 0.0);
		
	}
	
	/*
	 * En Java, podemos sobrecargar funciones variando:
	 * 	- El tipo de los parámetros que recibe.
	 * 	- El número de parámetros que recibe.
	 * 	- El orden en que recibe los parámetros.
	 */
	
	public static void funcion(int n, double a) {
		//no hace nada
	}
	
	public static void funcion(double a, int n) {
		//no hace nada
	}

}
