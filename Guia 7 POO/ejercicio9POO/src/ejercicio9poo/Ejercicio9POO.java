/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

import entidad.Matematica;

/**
 *
 * @author Maxi
 */
public class Ejercicio9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica m1=new Matematica();
        m1.setN1(Math.random()*100);
        System.out.println(m1.getN1());
        m1.setN2(Math.random()*100);
        System.out.println(m1.getN2());
        System.out.println(m1.devolverMayor(m1));  
        
    }
    
}
