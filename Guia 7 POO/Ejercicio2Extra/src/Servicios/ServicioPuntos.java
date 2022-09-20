/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioPuntos {
    Scanner leer=new Scanner(System.in);
    public Puntos crearPuntos(){
        
        Puntos p1=new Puntos();
        System.out.println("Ingrese los numeros del primer punto: ");
        p1.setX1(leer.nextDouble());
        p1.setY1(leer.nextDouble());
        System.out.println("Ingrese los numeros del segundo punto: ");
        p1.setX2(leer.nextDouble());
        p1.setY2(leer.nextDouble());
        
        return p1;
        
    }
    
    public double calcularDistancia(Puntos p1){
       
        double distancia=Math.sqrt(Math.pow((p1.getX2()-p1.getX1()), 2)+ Math.pow(p1.getY2()-p1.getY1(),2));
        
        return distancia;
    }
    
    
}
