package unidad03.ejercicios;

public class Diapositiva66 {

	public static void main(String[] args) {
		version2();
	}
	
	public static void version1() {
		for(char i = 'Z'; i >= 'A'; i--) {
			for(char j = i; j >= 'A'; j--) {
				System.out.print(j + "");
			}
			System.out.println();
		}
				
	}
	
	public static void version2() {
		String abecedario = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

		for(int i=0; i<abecedario.length(); i++) {
			for(int j=i; j<abecedario.length(); j++) {
				 System.out.print(abecedario.substring(j, j+1));
			}
			System.out.println();
		}	
		
		version2();
	}
	
	public static void version3() {
		String abecedario = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

		for(int i=0; i<abecedario.length(); i++) {
			System.out.println(abecedario.substring(i, abecedario.length()));
		}	
	}

}
