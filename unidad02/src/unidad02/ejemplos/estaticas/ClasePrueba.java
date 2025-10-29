package unidad02.ejemplos.estaticas;

public class ClasePrueba {
	
	public ClasePrueba() {
		
	}
	
	public void saludar() {
		System.out.println("Hola");
		saludo();
	}
	
	public static void saludo() {
		System.out.println("Holaaa");
	}

}
