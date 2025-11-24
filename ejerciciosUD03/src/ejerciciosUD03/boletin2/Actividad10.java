package ejerciciosUD03.boletin2;

import java.util.Scanner;

public class Actividad10 {

    public static void main(String[] args) {
        /*
        Escribe un programa que dados dos números, uno real (base) y un 
        entero positivo (exponente), saque por pantalla el resultado de la 
        potencia. No se puede utilizar el operador de potencia.
        Entradas: base (double), exponente (int)
        Salidas: potencia (double)
        */
        
        Scanner sc = new Scanner(System.in);
        
        double base, potencia=1;
        int exponente;
        
        System.out.println("Introduce un numero real (base): ");
        base = sc.nextDouble();
            
        do{
            System.out.println("Introduce un entero positivo (exponente)");
            exponente = sc.nextInt();           
        }while (exponente<0);
        
        //calculos
        for (int i=0;i<exponente;i++){
            potencia *= base;            
        }
        
        System.out.println("El resultado de la potencia es: "+potencia);
    
        sc.close();
    }
    
}
