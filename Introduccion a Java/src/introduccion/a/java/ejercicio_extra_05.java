/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class ejercicio_extra_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*
         Una obra social tiene tres clases de socios: 
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
        todos los tipos de tratamientos. 
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
        los mismos tratamientos que los socios del tipo A. 
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
        tratamientos. 
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
        real que represente el costo del tratamiento (previo al descuento) y determine el 
        importe en efectivo a pagar por dicho socio.
        
        */
        
        System.out.println("Obra Social Galeno");
        System.out.println("Tenemos Tres Clases de Socios\n"
                + "A)_Socio A\n"
                + "B)_Socio B\n"
                + "C)_Socio C\n"
                + "D)_Salir\n");  
        String letra;  
        double costo;
        do{
        System.out.println("");
        System.out.println("ingrese su categoria");
        System.out.println("");
            letra = leer.next();
            letra = letra.toLowerCase();
           if(letra.equalsIgnoreCase("d")){
               System.out.println("hasta luego");                    
                 break;
            }else{
               System.out.println("ingrese el valor de su tratamiento");
               System.out.println("");
                costo= leer.nextDouble();
           }
           switch (letra){
               case "a":
                   System.out.println("tiene un 50% de descuento en \n" +
"todos los tipos de tratamientos-> "+(costo/2));
                   break;
               case "b":
                   System.out.println("tiene un 35% de descuento para \n" +
"los mismos tratamientos-> "+(costo*0.65));                   
                    break;
                case "c":
                    System.out.println("no reciben descuentos sobre dichos \n"
                            + "tratamientos-> " + (costo));
                    break;               
            }

        } while (letra != "d");

    }

}