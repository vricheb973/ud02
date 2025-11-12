package unidad03.ejercicios;

public class Diapositiva51 {

	public static void main(String[] args) {
		version1();
		version2(7);
		version3();

	}
	
	public static void version1() {
		for(int i=0; i<100; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void version2(int n) {
		for(int i=0; i<100; i++) {
			if(i % n == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void version3() {
		for(int i=0; i<100; i+=7) {
			System.out.println(i);
		}
	}

}
