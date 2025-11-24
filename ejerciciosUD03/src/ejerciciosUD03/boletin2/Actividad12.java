package ejerciciosUD03.boletin2;

import java.util.concurrent.TimeUnit;

public class Actividad12 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Hacer un programa que muestre un cronometro, indicando las horas, minutos y
		 * segundos. NOTA: usar TimeUnit.SECONDS.sleep(1); para dormir un segundo el
		 * bucle. Entradas: Salidas: (String)
		 */

		int horas = 0; // Variable auxiliar para calcular el tiempo

		while (true) {
			for (int minuto = 0; minuto <= 59; minuto++) {
				for (int segundo = 0; segundo <= 59; segundo++) {
					System.out.printf("%02d:%02d:%02d\n", horas, minuto, segundo);
					TimeUnit.SECONDS.sleep(1);
				}
			}
			horas++;
		}

	}

}
