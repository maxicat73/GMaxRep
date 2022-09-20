/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);
    Ahorcado a1 = new Ahorcado();

    public void crearJuego() {

        System.out.println("Ingrese la palabra: ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas: ");
        a1.setCantJugadas(leer.nextInt());
        String[] v1 = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            v1[i] = palabra.substring(i, i + 1);

        }

        a1.setPalabra(v1);

        a1.setCantLetras(0);

    }
    
    public void longitud(){
        
        System.out.println("la longitud de la palabra a buscar es: "+a1.getPalabra().length);
        
    }
    // Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscar(String letra) {
        boolean coincide = false;
        for (int i = 0; i < a1.getPalabra().length; i++) {

            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {

                coincide = true;
            }

        }

        if (coincide) {
            System.out.println("la letra pertenece a la palabra ");

        } else {
            System.out.println("la letra No pertenece a la palabra ");

        }

    }
    
    
    public boolean encontradas(String letra){
        boolean encontrada=false;
        
        for (int i = 0; i < a1.getPalabra().length; i++) {
            
            if(letra.equalsIgnoreCase(a1.getPalabra()[i])){
                
                a1.setCantLetras(a1.getCantLetras()+1);
                
                encontrada=true;
            }
            
         
            
        }
        
        
        
        
          return encontrada;
    }
  
    public void intentos(){
        
        System.out.println("Al jugador le quedan: "+ a1.getCantJugadas());
        
    }

    public void juego() {

        crearJuego();
        String v2 = "";

        do {

            longitud();
            System.out.println("ingrese la letra a buscar: ");
            String letra2 = leer.next();
            String letraconcatenada = v2.concat(letra2);

            buscar(letra2);
            if (encontradas(letra2)) {
                System.out.println("(encontradas, faltantes): " + a1.getCantLetras() + "," + (a1.getPalabra().length - a1.getCantLetras()));
                intentos();
            } else {
                System.out.println("(encontradas, faltantes): " + a1.getCantLetras() + "," + (a1.getPalabra().length - a1.getCantLetras()));
                a1.setCantJugadas(a1.getCantJugadas() - 1);
                intentos();

            }

        } while (a1.getCantJugadas() != 0 && a1.getCantLetras() != a1.getPalabra().length);

        if (a1.getCantJugadas() == 0) {
            System.out.println("Lo sentimos, no hay más oportunidades");
        } else if (a1.getCantLetras() == a1.getPalabra().length) {
            System.out.println("Acertaste la palabra ");
        }

    }

}
