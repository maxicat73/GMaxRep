/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicioextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad=10;
        int cont=0;
        Scanner leer=new Scanner(System.in);
        
                
        for(int i=0;i<10;i++){
            
            System.out.println("ingresa la altura " + i);
        
            double altura=leer.nextDouble();
            cont++;
        
    }
    
}
}