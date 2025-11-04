package unidad02.ejercicios;

public class Diapositiva21 {
	
	/*
	 * Crear una función que, devolviendo un booleano, indique si el carácter (en String) 
	 * que se pasa como parámetro de entrada corresponde con una vocal.
	 */
	
	public static void main(String[] args) {
		
	}
	
	public static boolean esVocal(String caracter) {
		return caracter.equalsIgnoreCase("A") || 
				caracter.equalsIgnoreCase("E") || 
				caracter.equalsIgnoreCase("I") || 
				caracter.equalsIgnoreCase("O") || 
				caracter.equalsIgnoreCase("U");
	}
	
//	// 1ª versión de la función
//	public static boolean esVocal(String caracter) {
//		// caracter == "A" || caracter == "E" || car....
//		//Con los tipo objeto, usamos equals en vez de ==
//		//Podemos usar el equalsIgnoreCase (para que distinga de mayús y minús)
//		boolean a = (caracter == "A") || (caracter == "a"); 
//		boolean e = (caracter == "E") || (caracter == "e");
//		boolean i = (caracter == "I") || (caracter == "i");
//		boolean o = (caracter == "O") || (caracter == "o");
//		boolean u = (caracter == "U") || (caracter == "u");
//		
//		boolean esVocal = (a || e || i || o || u	);
//		
//		return (a || e || i || o || u);
//	}
	
	
	
	
	
	
	

}
