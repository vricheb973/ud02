package unidad02.ejemplos.estaticas;

public class ClasePrueba {
	
	private int atributo1;
	private double atributo2;
	
	public ClasePrueba() {
		this.atributo1 = 0;
		this.atributo2 = 0.0;
	}
	
	public ClasePrueba(int atributo1, double atributo2) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}
	
	public void saludar() {
		System.out.println("Hola");
		saludo();
	}
	
	public static void saludo() {
		System.out.println("Holaaa");
	}

}
