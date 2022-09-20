/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7poo;

import Entidad.Persona;
import Servicios.ServicioPersona;

/**
 *A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
 * @author Usuario
 */
public class Ejer7poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona ps = new ServicioPersona();
        Persona p1 = ps.crearPersona();
       // Persona p2 = ps.crearPersona();
       // Persona p3 = ps.crearPersona();
       // Persona p4 = ps.crearPersona();
        System.out.println(ps.calcularIMC(p1));
        System.out.println(ps.esMayorDeEdad(p1));
      /*  System.out.println("---------------");
        System.out.println(ps.calcularIMC(p2));
        System.out.println(ps.esMayorDeEdad(p2));
        System.out.println("---------------");
        System.out.println(ps.calcularIMC(p3));
        System.out.println(ps.esMayorDeEdad(p3));
        System.out.println("---------------");
        System.out.println(ps.calcularIMC(p4));
        System.out.println(ps.esMayorDeEdad(p4));
        System.out.println("---------------");*/
       
        System.out.println(p1.toString());
       /* System.out.println( p2.toString());
        System.out.println( p3.toString());
        System.out.println(p4.toString());*/
    }
    
}
