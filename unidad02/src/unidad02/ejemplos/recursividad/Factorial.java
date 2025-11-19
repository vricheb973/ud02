package unidad02.ejemplos.recursividad;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));

	}
	
	public static int factorial(int n) {
		if(n == 2) {
			return 2;
		}
		if(n == 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

}
