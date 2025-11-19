package unidad02.ejercicios;

public class Diapositiva39 {

	public static void main(String[] args) {

		System.out.println(potenciaR(2,4));

	}
	
	public static double potenciaR(double base, int exp) {
		if(exp == 0) {
			return 1;
		}
		if(exp == 1) {
			return base;
		}
		
		return base * potenciaR(base, exp-1);
	}

}
