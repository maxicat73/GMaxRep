/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioPersona {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
   
    
    public Persona crearPersona() throws InputMismatchException{
        
        Persona p1=new Persona();
        System.out.print("Ingrese los datos de la persona:");
        System.out.print("Ingrese el nombre:");
        p1.setNombre(leer.next());
        int edad;
        
             System.out.print("Ingrese edad:");
             edad=leer.nextInt();
        p1.setEdad(edad);
        
        
        
       
        System.out.println("Ingrese Sexo:");
        p1.setSexo(leer.next());
        System.out.println("Ingrese Altura:");
        p1.setAltura(leer.nextDouble());
         System.out.println("Ingrese Peso:");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese DNI:");
        p1.setDni(leer.nextInt());
        
        return p1;
        
    }
    
    public double IMC(Persona p1){
        
        double peso=p1.getPeso();
        double altura=p1.getAltura();
          double IMC=peso/(altura*altura); 
        
       if(IMC>25){
        IMC=1;
           System.out.println("La persona"+p1.getNombre()+" esta por encima de su peso ideal");                           
       }
       
       else if(IMC>=20 && IMC<=25){
           IMC=0;
           System.out.println("La persona"+p1.getNombre()+" esta en su peso ideal");  
       }
       
       else {
           IMC=-1;
             System.out.println("La persona"+p1.getNombre()+" esta debajo su peso ideal");  
       }
        return IMC;
      
    }
    
    public boolean esMayorDeEdad(Persona p1){
       
       
       boolean esmayor=false;
       
        if(p1.getEdad()>18){
            esmayor=true;
             System.out.println("la persona" + p1.getNombre() + "es mayor de edad");
        }
        else {
            System.out.println("la persona" + p1.getNombre() + "es menor de edad");
        }
        
        return esmayor;
    }
    
    
    public void esMayorDeEdad2(){
        try{
            crearPersona();
        }catch(InputMismatchException i){ 
            System.out.print("No se ingresaron los datos correctos, ingrese nuevamente los datos");
        }finally{
            System.out.println("*------------------***");
           
        }
    }
    
    
    
}
