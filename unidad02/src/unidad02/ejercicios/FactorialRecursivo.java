package unidad02.ejercicios;

import java.math.BigInteger;

public class FactorialRecursivo {

	public static void main(String[] args) {

		System.out.println(fibonacci(40));

	}
	
	public static int factorialIterativo(int n) {
		int factorial = 1; 
		
		for(int i=n; i>=2; i--) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	public static int fibonacci(int n) {
		if(n == 1) {
			return 1;
		}	
		if(n == 2) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static int division(int dividendo, int divisor) {
		if(dividendo < divisor) {
			return 1;
		}
		
		return 1 + division(dividendo-divisor, divisor);
	}
	
	
}
