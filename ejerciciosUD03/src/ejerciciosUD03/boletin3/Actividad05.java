package ejerciciosUD03.boletin3;

import java.util.Random;

public class Actividad05 {

	public static void main(String[] args) {
		/*
		 * Programa que muestre tres apuestas de la quiniela en tres columnas para los
		 * 14 partidos y el pleno al quince (15 filas) de forma que: La probabilidad de
		 * que salga un 1 sea de 1/2. La probabilidad de que salga X sea de 1/3. La
		 * probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
		 * Entradas: Salidas: (String)
		 */

		System.out.println("Part.\tAP1\tAP2\tAP3");
		for (int i = 1; i <= 15; i++) {
			System.out.printf("P%d\t", i);
			for (int j = 0; j < 3; j++) {
				Random r = new Random();
				int aleatorio = r.nextInt(1, 6+1);
				switch (aleatorio) {
				case 1:
				case 2:
				case 3:
					System.out.print("1  \t"); //El \t es una tabulación
					break;
				case 4:
				case 5:
					System.out.print(" X \t");
					break;
				case 6:
					System.out.print("  2\t");
					break;
				default:
					System.err.println("Esto no puede pasar en la vida");
				}
			}
			System.out.println();

		}
	}

}
