/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class ServicioPaises {
    Scanner leer = new Scanner(System.in);
    HashSet < String> paises = new HashSet();
    TreeSet< String> paises2 = new TreeSet();
    public void cargarPaises(){
        String resp="";
        do {   
            System.out.println(" ingrese el pais ");
             paises.add(leer.next());
              System.out.println("desea ingresar otro pais  (S/N)");
              resp= leer.next();
              
            
        } while (resp.equalsIgnoreCase("s"));
    }
    
    public void ordenar(){
         for (String aux : paises) {
            paises2.add(aux);
        }
    }
    
    public void mostrarPaises(){
         for (String var : paises2) {
             System.out.println(var);
        }
            
        }
    }

