package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad05 {

    public static void main(String[] args) {
        /*
        Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a 
        minúsculas y viceversa.
        Entradas: cadena (String)
        Salidas: cadenaFinal (String)
         */

        Scanner sc = new Scanner(System.in);

        String cadena;
        String cadenaFinal = "";

        do {
            System.out.print("Dime una cadena: ");
            cadena = sc.nextLine();
        } while (cadena.length() == 0);
        
        for(int i=0; i<cadena.length(); i++){
            //Variable auxiliar donde guardamos el caracter actual de la cadena original
            String aux = cadena.substring(i, i+1);
            
            if(aux.equals(aux.toUpperCase())){
                //Si entramos aquí significa que está en mayúsculas
                cadenaFinal = cadenaFinal + aux.toLowerCase();
            }
            else{
                //Si entramos aquí significa que estaba en minúsculas
                cadenaFinal = cadenaFinal + aux.toUpperCase();
            }
        }
        
        System.out.printf("La cadena resultante es %s \n", cadenaFinal);
        
        sc.close();
    }

}
