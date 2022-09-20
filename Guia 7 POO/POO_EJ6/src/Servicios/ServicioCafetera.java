/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioCafetera {
    Cafetera c1=new Cafetera();
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera llenarCafetera(){
        
        c1.setCapMax(1000);
        c1.setCapAct(c1.getCapMax());
        
        
        return c1;
    }
    
    public void ServirTaza(Cafetera c1){
        
        System.out.println("Ingrese el tamaño de la taza: ");
        int tamaño=leer.nextInt();
        
        if(tamaño>c1.getCapAct()){
            System.out.println("Su taza no se lleno"+ c1.getCapAct());
            
        }
        else {
            int aux=c1.getCapAct()-tamaño;
            c1.setCapAct(aux);
            
            System.out.println("Su taza se lleno");
            System.out.println("quedaron "+c1.getCapAct()+" ml de cafe");
        }
        
        
        
        
       
    }
    
    public void vaciarCafetera(Cafetera c1){
        
        c1.setCapAct(0);
        
        
    }
    
    public void agregarCafe(Cafetera c1){
        
        System.out.println("Ingrese la cantidad de cafe a agregar");
        int cantidad=leer.nextInt();
        int aux2=c1.getCapAct()+cantidad;
        c1.setCapAct(aux2);
        
       
        
    }
    
}
    
