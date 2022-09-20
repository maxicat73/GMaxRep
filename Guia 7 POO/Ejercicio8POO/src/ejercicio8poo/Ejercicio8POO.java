/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio8POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in).useDelimiter("\n");
       
       Cadena c1=new Cadena();
        System.out.println("ingrese la frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        
        System.out.println(c1.getLongitud());
        
           System.out.println(c1.mostrarVocales(c1));         
        
           System.out.println(c1.invertirFrase(c1));
          // System.out.println(c1.invertirfrase2(c1));
           
           System.out.println("ingrese la letra a buscar");
           System.out.println("El caracter ingresado se repite"+ c1.vecesRepetido(leer.next()) + " veces");
           System.out.println("ingrese la frase a comparar");
            c1.compararLongitud(leer.next());
            System.out.println("Ingrese la frase a concatenar");
            c1.unirFrases(leer.next());
            System.out.println("ingrese el caracter a reemplazar por la letra a :");
            c1.reemplazar(leer.next());
            System.out.println("ingrese la letra a buscar");
           System.out.println("la letrada ingresada esta en la frase??"+c1.contiene(leer.next())); 
    }
    
}
