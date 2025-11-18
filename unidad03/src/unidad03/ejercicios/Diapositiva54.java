package unidad03.ejercicios;

public class Diapositiva54 {

	public static void main(String[] args) {
		version3();

	}
	
	public static void version1() {
		int acumulador = 0;
		
		for(int i=1; i < 20; i+=2) {
			acumulador += i;
		}
		
		System.out.println("La suma es: " + acumulador);
	}
	
	public static void version2() {
		int acumulador = 0;
		
		for(int i=0; i <= 20; i++) {
			if(i%2==1) {
				acumulador += i;
			}
		}
		
		System.out.println("La suma es: " + acumulador);
	}
	
	//ESTA ES HORRIBLE - no usar
	public static void version3() {
		int acumulador = 0;
		int contadorImpares = 0;
		
		for(int i=0; contadorImpares < 10; i++) {
			if(i%2==1) {
				acumulador += i;
				contadorImpares++;
			}
		}
		
		System.out.println("La suma es: " + acumulador);
	}

}
