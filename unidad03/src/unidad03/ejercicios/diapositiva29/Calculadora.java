package unidad03.ejercicios.diapositiva29;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	private String operador;
	
	public Calculadora(double numero1, double numero2, String operador) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		setOperador(operador);
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		if(!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")) {
			throw new IllegalArgumentException("El operador introducido no es válido. ");
		}
		if(operador.equals("/") && this.numero2 == 0.0) {
			throw new IllegalArgumentException("No puedes dividir por cero. ");
		}
		this.operador = operador;
	}
	
	

}
