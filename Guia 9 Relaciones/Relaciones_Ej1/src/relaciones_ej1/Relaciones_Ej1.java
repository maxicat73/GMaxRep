
//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.



package relaciones_ej1;


public class Relaciones_Ej1 {

    
    public static void main(String[] args) {
        
        Persona p1=new Persona("Pablo","gimenez",33,34290267);
        Persona p2=new Persona("Sebastian","girolmini",32,36584478);
     
        Perro pe1=new Perro("apache","BullTerrier",7,"mediano");
        Perro pe2=new Perro("Luca","boxer",4,"grande");
         
        p1.setPerro(pe1);
        p2.setPerro(pe2);
         
        System.out.println(p1.toString()); 
        System.out.println(p2.toString());
         
    }
    
}
