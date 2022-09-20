/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int N = 4;
       int cont1=0;
       double sumaG = 0; 
       double sumaA=0;
         for (int i = 0; i < 4; i++) {
             System.out.println(" ingrese la altura " + i);
            
             double altura = leer.nextDouble();
            sumaG = sumaG + altura;
             if ( altura < 1.60 ){
                 cont1++;
                 sumaA= sumaA + altura;
                 
             }
            
        }
        System.out.println(" el premedio genreal es " + sumaG/N);
        System.out.println(" el promedio  menor " + cont1 + " a 1.60 es " + sumaA/cont1 );
    }
    
}
