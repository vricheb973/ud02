package unidad03.ejercicios;

import java.util.Scanner;

public class Diapositiva57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suspensos = 0;
		
		for(int i=0; i<5; i++) {
			int nota;
			
			do {
				System.out.println("Dime la nota del alumno" + (i+1) + ": ");
				nota = sc.nextInt();
			}
			while(nota < 1 || nota > 10);
			
			if(nota < 5) {
				suspensos++;
			}
			
		}
		
		System.out.println("Hay " + suspensos + " suspensos. ");
		
		sc.close();
	}

}
