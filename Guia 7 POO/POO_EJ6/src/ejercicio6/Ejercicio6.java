/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidad.Cafetera;
import Servicios.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ServicioCafetera s1=new ServicioCafetera();
        Cafetera c1=s1.llenarCafetera();
        s1.ServirTaza(c1);
        s1.ServirTaza(c1);
        
        s1.vaciarCafetera(c1);
        
        System.out.println("la cafetera quedo vacia "+c1.getCapAct());
        
        s1.agregarCafe(c1);
        
         System.out.println("en la cafetera quedaron "+c1.getCapAct());
    }
    
}
