package unidad02.ejemplos;

public class SobrecargaConstructor {
	
	private int atributo1;
	private double atributo2;
	
	/*
	 * También podemos sobrecargar los constructores (con las mismas reglas que las funciones).
	 * 	- Lo más normal será que tengamos un constructor que reciba todos los atributos.
	 * 	- Opcionalmente, podremos tener un constructor por defecto (que no recibe nada). Esto se indicará en el enunciado.
	 */
	
	public SobrecargaConstructor() {
		this.atributo1 = 0;
		this.atributo2 = 0.0;
	}
	
	public SobrecargaConstructor(int atributo1, double atributo2) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	public int getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	public double getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(double atributo2) {
		this.atributo2 = atributo2;
	}	

}
