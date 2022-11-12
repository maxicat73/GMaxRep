/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_ej2;

import java.util.Scanner;


public class Excepciones_Ej2 {

    public static void main(String[] args) {
        
        ClaseVector a=new ClaseVector();
         
        try{
        
            System.out.println("ingrese un numero entero");
        a.array[3]=new Scanner(System.in).nextInt();
        
          a.array[2]=10;
    }
    catch(ArrayIndexOutOfBoundsException x){
        System.out.println("ingreso el numero " + x.getMessage()+ " el indice esta fuera de rango");
   
    }
        
     catch(RuntimeException t){
         System.out.println("Error en la ejecucion");
     }
        
}
}
