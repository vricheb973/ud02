package ejerciciosUD03.boletinRepaso;

public class Repaso {

	public static void main(String[] args) {
		
		System.out.println(siguientePrimo(30000));


	}
	
	public static int digitos(int numero) {		
		int contador = 0;
		
		if(numero == 0) {
			contador = 1;
		}
		
		while(numero != 0) {
			contador++;
			
			numero = numero / 10;
		}
		
		return contador;
	}
	
	public static int voltea(int numero) {
		int volteado = 0;
		
		while(numero > 0) {
			int digito = numero % 10;
			
			volteado = volteado * 10 + digito;
			
			numero = numero / 10;
		}
		
		return volteado;
	}
	
	public static int volteaString(int numero) {
		String volteado = "";
		String numeroStr = String.valueOf(numero);
		
		for(int i=numeroStr.length()-1; i>=0; i--) {
			String caracter = numeroStr.substring(i, i+1);
			
			volteado = volteado + caracter;
		}
		
		return Integer.valueOf(volteado);
	}
	
	public static boolean esPrimo(int numero) {
		boolean result = true;
		
		for(int i=2; i<numero && result; i++) {
			if(numero%i == 0) {
				result = false;
			}
		}
		
		return result;
	}
	
	public static int siguientePrimo(int n) {
		boolean noEncontrado = true;
		
		while(noEncontrado) {
			n++;			
			if(esPrimo(n)) {
				noEncontrado = false;
			}
		}
		
		return n;
	}
	
	

}
