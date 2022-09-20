/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
 * @author Usuario
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    public Persona crearPersona(){
        System.out.println(" ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println(" ingrese su edad");
        p1.setEdad(leer.nextInt());
        System.out.println(" ingrese su sexo H = hombre/ M= mujer /  O = otro ");
        p1.setSexo(leer.next());
        System.out.println(" ingrese su dni ");
        p1.setDni(leer.nextInt());
        System.out.println(" ingrese su peso ");
        p1.setPeso(leer.nextDouble());
        System.out.println(" ingrese su altura ");
        p1.setAltura(leer.nextDouble());
        return p1;
        
        
    }
    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1. */
public double calcularIMC(Persona p1){
    
 double imc =   p1.getPeso()/(p1.getAltura()* p1.getAltura());
 if ( imc < 20){
     imc= -1;
 } else if (imc >= 20 && imc <= 25){
     imc = 0;
 } else{
      imc=1;
 }
 return imc;
    
}

public boolean esMayorDeEdad(Persona p1){
      
    boolean mayor = p1.getEdad()>= 18;
   // if(p1.getEdad()>= 18){
   //     mayor=true;
  //  }
    return mayor;
}

    
}
