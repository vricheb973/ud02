package ejerciciosUD03.boletin2;

public class Actividad11 {

	public static void main(String[] args) {
		/*
		 * Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó
		 * 10 euros, el segundo 20 euros, el tercero 40 euros y así sucesivamente.
		 * Realizar un algoritmo para determinar cuánto debe pagar mensualmente y el
		 * total de lo que pagó después de los 20 meses. Entradas: Salidas: pagoMensual,
		 * pagoTotal (int)
		 */

		int pagoMensual = 10;
		int pagoTotal = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.printf("El mes número %d paga %d € \n", i, pagoMensual);
			pagoTotal += pagoMensual;

			pagoMensual *= 2;
		}

		System.out.printf("El cliente ha pagado en total %d € \n", pagoTotal);

	}

}
