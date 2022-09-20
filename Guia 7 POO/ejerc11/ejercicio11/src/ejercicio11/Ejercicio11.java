/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 *
 * @author Pc
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  int dia=0;
      //  int mes=0;
       // int anio=0;
        
          
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese el dia ");
    int dia = leer.nextInt();
    System.out.println("ingrese el mes");
    int mes = leer.nextInt();
    System.out.println("ingrese el año");
            
    int anio = leer.nextInt();
    
    Date fecha = new Date(anio-1900, mes, dia);
    Date fechaActual = new Date();
    System.out.println("la fecha actual es " + fechaActual );  
    
    System.out.println("la diferencia es de " + (fechaActual.getYear()- fecha.getYear()) + " años");
    
    
    
    
    }

    
    
}
