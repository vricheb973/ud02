package unidad03.ejercicios.diapositiva28;

public class Calificacion {
	
	private int nota;
	
	public Calificacion() {
		this.nota = 0;
	}
	
	public Calificacion(int nota) {
		setNota(nota);
	}
	
	public int getNota() {
		return this.nota;
	}
	
	public void setNota(int nota) {
		//nota >= 0 && nota <= 10 (esto es lo que queremos)
		// Lanzamos la excepción con lo contrario
		if(nota < 0 || nota > 10) {
			throw new IllegalArgumentException("Introduzca una nota entre 0 y 10. ");
		}
		this.nota = nota;		
	}
	
	public void mostrarResultadoIfElse() {
		if(this.nota >= 0 && this.nota <= 4) {
			System.out.println("Insuficiente. ");
		}
		else if(this.nota == 5) {
			System.out.println("Suficiente. ");
		}
		else if(this.nota == 6) {
			System.out.println("Bien. ");
		}
		else if(this.nota == 7 || this.nota == 8) {
			System.out.println("Notable. ");
		}
		else if(this.nota == 9 || this.nota == 10) {
			System.out.println("Sobresaliente. ");
		}
	}

	public void mostrarResultadoSwitch() {
		//Switch nuevo
		switch(this.nota) {
			case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente. ");
			case 5 -> System.out.println("Suficiente. ");
			case 6 -> System.out.println("Bien. ");
			case 7,8 -> System.out.println("Notable. ");
			case 9,10 -> System.out.println("Sobresaliente. ");
 		}
		
//		//Switch clásico
//		switch(this.nota) {
//			case 0:
//			case 1: 
//			case 2: 
//			case 3: 
//			case 4: 
//				System.out.println("Insuficiente. ");
//				break;
//			case 5:
//				System.out.println("Suficiente. ");
//				break;
//			case 6:
//				System.out.println("Bien. ");
//				break;
//			case 7,8:
//				System.out.println("Notable. ");
//				break;
//			case 9,10:
//				System.out.println("Sobresaliente. ");
//				break;
// 		}
	}
		
}
