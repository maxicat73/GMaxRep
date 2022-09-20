/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author Maxi
 */
public class ServicioPersona {
    
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public Persona CrearPersona()
    {
        System.out.println("ingrese un nombre");
        String nombre=leer.next();
        System.out.println("ingrese la edad");
        int edad=leer.nextInt();
        System.out.println("ingrese el");
        int dni=leer.nextInt();
        
         return new Persona(nombre, edad, dni);
        
   
    }
    
}
