/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioAuto;

import Entidad.Auto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioAuto {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    Auto a1=new Auto();
    ArrayList<Auto> listaauto;
    
        public ServicioAuto(){
    this.listaauto=new ArrayList();

    }
    
    public Auto crearAuto(){
        System.out.println("ingrese los datos del vehiculo: ");
        System.out.println("ingrese la patente:");
        String patente=leer.next();
        System.out.println("ingrese la marca:");
        String marca=leer.next();
        System.out.println("ingrese la color:");
        String color=leer.next();
        System.out.println("ingrese el modelo:");
        int modelo=leer.nextInt();
        
        Auto a1=new Auto(patente, marca, color, modelo);
        
        return a1;
    }
     
    public void almacenarAuto(Auto a1){
        
        listaauto.add(a1);
  
    }
    
    
    public void mostrarAutos(){
        
        for (Auto aux : listaauto) {
            System.out.println(aux);
        }
        
    }
    
    public void eliminarAuto(int indice){
        
        System.out.println(" ");
      
        if(indice<=listaauto.size()){
        listaauto.remove(indice);
          System.out.println("se elimino el auto"+ indice);
    }else{
            System.out.println("el indice es incorrecto");
        }
    
    
    
}
    


}
