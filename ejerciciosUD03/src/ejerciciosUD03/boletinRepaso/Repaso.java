package ejerciciosUD03.boletinRepaso;

public class Repaso {

	public static void main(String[] args) {

		System.out.println(pegaPorDetras(1568, 2));

	}
	
	public static int digitos(int numero) {
		//Tenemos que contar los digitos
		int contador = 0;
		
		//En el caso de introducir un cero devolvemos una cifra
		if(numero == 0) {
			contador = 1;
		}
		
		//Usamos esta condición para incluir números negativos
		while(numero != 0) {
			contador++;
			
			numero = numero / 10;
		}
		
		return contador;
	}
	
	public static int voltea(int numero) {
		int volteado = 0;
		
		//Usamos el bucle para recorrer números
		while(numero > 0) {
			int digito = numero % 10;
			
			//Multiplicamos por 10 para dejar hueco al nuevo dígito
			volteado = volteado * 10 + digito;
			
			numero = numero / 10;
		}
		
		return volteado;
	}
	
	//Un número es primo si únicamente es divisible por él mismo y 1
	public static boolean esPrimo(int numero) {
		boolean result = true;
		
		//Empezamos a dividir en 2 y llegamos hasta 1 antes del número
		//Incluimos result en la condición para evitar el break
		for(int i=2; i<numero && result; i++) {
			if(numero%i == 0) {
				//Cuando encontramos un divisor, ya sabemos que no es primo y paramos
				result = false;
			}
		}
		
		return result;
	}
	
	public static int siguientePrimo(int n) {
		boolean noEncontrado = true;
		
		//Mientras no encontremos el siguiente primo, seguimos buscando
		while(noEncontrado) {
			n++;			
			if(esPrimo(n)) {
				//Si es primo, cambiamos la variable y acaba el bucle
				noEncontrado = false;
			}
		}
		
		return n;
	}
	
    public static int digitoN(int numero, int posicion) {
    	//Como el módulo extrae los dígitos por la derecha, volteamos el número
        numero = voltea(numero);
        
        //Vamos eliminando dígitos por la derecha hasta llegar a la posición
        while (posicion > 1) {
            numero /= 10;
            posicion--;
        }
        
        //Devuelvo el dígito de la derecha
        return numero % 10;
    }
    
    //Fácil usando voltea
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }

    //Para eliminar dígitos de un número dividimos entre 10 las veces que marque la variable digitos
    public static int quitaPorDetras(int numero, int digitos) {
    	for(int i=0; i<digitos; i++) {
    		numero /= 10;
    	}
    	
        return numero;
    }
    
    //Quitar por delante es complicado
    //Si volteamos dos veces el número es más sencillo
    public static int quitaPorDelante(int numero, int digitos) {
    	//Volteamos el número
    	numero = voltea(numero);

    	//Quitamos por detrás
    	numero = quitaPorDetras(numero, digitos);
    	
    	//Volvemos a voltear para devolverlo correctamente
    	return voltea(numero);
    }
    
    //Misma mecánica que cuando volteamos
    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }
    
    //Hacemos igual que en quitaPorDelante
    public static int pegaPorDelante(int numero, int digito) {
    	numero = voltea(numero);
    	
    	numero = pegaPorDetras(numero, digito);
    	
        return voltea(numero);
    }
    
    

}
