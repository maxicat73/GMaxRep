/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer_5_paises;

import servicio.ServicioPaises;

/**
 *
 * @author Usuario
 */
public class Guia7_ejer_5_paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioPaises p = new ServicioPaises();
       p.cargarPaises();
       p.ordenar();
        System.out.println("_______________________");
       p.mostrarPaises();
        System.out.println("_______________________________");
        System.out.println(" mostar pais eliminado");
       p.buscarEliminar();
        System.out.println("_______________________________");
    }
    
}
