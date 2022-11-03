
package com.mycompany.ejercicio_2;

import java.util.Scanner;
public class Ejercicio_2 {

    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Ingrese el monto que desea extraer(debe ser multiplo de 100)");
        int Numero = lee.nextInt();
      
        while( Numero % 100 != 0){
            System.out.println("El numero igresado no es multiplo de 100.");
            System.out.println("Ingrese nuevamnete el monto que desea extraer(debe ser multiplo de 100)");
            Numero = lee.nextInt();
        }
              
        int Mil = Numero / 1000;
        int Quinientos = (Numero % 1000) / 500;
        int Docientos = ( Numero % 1000 % 500) / 200;
        int Cien = ( Numero % 1000 % 500 % 200) / 100;
        if( Mil > 0){
        System.out.println("Se le entregaran: " + Mil +" billete/s de $1000");
        }
        if( Quinientos > 0){
        System.out.println("Se le entregaran: " + Quinientos +" billete/s de $500");
        }
        if( Docientos > 0){
        System.out.println("Se le entregaran: " + Docientos +" billete/s de $200");
        }
        if( Cien > 0){
        System.out.println("Se le entregaran: " + Cien +" billete/s de $100");
        } 
    }     
}
