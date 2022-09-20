/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7extra;

import Servicios.ServicioAhorcado;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ej7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer=new Scanner(System.in);
        ServicioAhorcado s1=new ServicioAhorcado();
        s1.juego();
        
    }
    
}
