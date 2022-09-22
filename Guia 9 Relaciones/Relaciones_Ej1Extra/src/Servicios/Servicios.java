//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.

package Servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import relaciones_ej1extra.Perro;
import relaciones_ej1extra.Persona;


public class Servicios {
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    Persona aux=new Persona();
    Perro perroaux=new Perro();
    
    ArrayList<Persona> personas2=new ArrayList();
    HashMap<Integer, Perro> perros2=new HashMap();
    
    public void crearPersona(){
        
        Persona per1=new Persona("Sebastian","Girolmini",32,32569854);
        Persona per2=new Persona("Jose","Chatruc",51,6547852);
        Persona per3=new Persona("Juan","Leiva",33,18547854);
        Persona per4=new Persona("Pepe","Cantero",45,14632541);
        Persona per5=new Persona("Antonio","Lopez",56,1652114);
        
        personas2.add(per1);
        personas2.add(per2);
        personas2.add(per3);
        personas2.add(per4);
        personas2.add(per5);
        
        
        
    }
    
    public void crearPerro(){
        
         Perro p1=new Perro("toby","callejero",4,"mediano");
         Perro p2=new Perro("firulais","beagle",5,"chiquito");
         Perro p3=new Perro("filomena","pastor belga",6,"grande");
         Perro p4=new Perro("Azul","Rotweiller",3,"mediano");
         Perro p5=new Perro("Anita","Boxer",7,"mediano");
         
         perros2.put(1, p1);
         perros2.put(2, p2);
         perros2.put(3, p3);
         perros2.put(4, p4);
         perros2.put(5, p5);
         
       
         
    }
    
    
}
