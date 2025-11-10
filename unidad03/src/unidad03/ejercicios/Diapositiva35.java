package unidad03.ejercicios;

public class Diapositiva35 {

	public static void main(String[] args) {

//		version1();
		version2();
		
	}
	
	public static void version1() {
		int i=0; 

		while (i<=50){
			System.out.println(i); 
			i+=2;
		}
	}
	
	public static void version2() {
		int i=0; 

		while (i<=50){
			if(i%2 == 0) {
				System.out.println(i); 
//				i++;  La condición se debe modificar en cada iteración. 
//				      No solo cuando sea par.
			}
			i++;    //Esta es la correcta
		}
	}

}
