/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Servicios.ServicioPersona;
import entidad.Persona;

/**
 *
 * @author Maxi
 */
public class POOej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServicioPersona n1=new ServicioPersona();
        
        Persona Maxi=n1.CrearPersona();
        
      
        System.out.println("Persona 1 "+ Maxi.toString());
    }
    
   public static void MostraPersona(Persona m){
       String n=m.getNombre();
       int e=m.getEdad();
       int D=m.getDni();
       
       System.out.println("El nombre es: "+ n +" ,su edad es: "+e+" su numero de documento es: "+ D );
       
   }
  
}
