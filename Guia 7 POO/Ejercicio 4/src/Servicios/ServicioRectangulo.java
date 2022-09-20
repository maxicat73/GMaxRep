/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Maxi
 */
public class ServicioRectangulo {
    
    public Rectangulo crearRectangulo(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los datos para crear el Rectangulo");
         System.out.println(" ");
        Rectangulo r1=new Rectangulo();
        System.out.println("ingrese la base ");
       r1.setBase(leer.nextInt());
       System.out.println("ingrese la Altura ");
       r1.setAltura(leer.nextInt());
       
       return r1;
     
    }
    
    public int calcularSuperficie(Rectangulo r1){
        int superficie;
        superficie=r1.getAltura()*r1.getBase();
        
        return superficie;   
    }
    
    public int calcularPerimetro(Rectangulo r1){
        int perimetro;
        perimetro=(r1.getAltura()+r1.getBase())*2;
        
        return perimetro;
    }
    
    public void dibujarRectangulo(Rectangulo r1){
        
        int altura=r1.getBase();
        int base=r1.getAltura();
       
        
        for (int i = 1; i <= base ; i++) {
            
            for (int j = 1; j <= altura; j++) {
                if (i==1 || i==base || j==1 || j==altura) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
         
 
        
        
    }
    
            
    
    
}
