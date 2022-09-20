/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import Entidad.Puntos;
import Servicios.ServicioPuntos;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     
      ServicioPuntos s1=new ServicioPuntos();
         Puntos p1=s1.crearPuntos();
         
         System.out.println("La distancia entre los puntos ingresados es: "+ s1.calcularDistancia(p1)); 
      
        
        
    }
    
}
