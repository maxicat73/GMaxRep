//
//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.

package relaciones_ej1extra;

import Servicios.Servicios;


public class Relaciones_Ej1Extra {

    
    public static void main(String[] args) {
        
       Servicios s1=new Servicios();
        
       s1.crearPersonas();
       s1.crearPerros();
       s1.mostrarPersonas();
       s1.mostrarPerros();
       s1.adoptarPerro();
         
    }
    
}
