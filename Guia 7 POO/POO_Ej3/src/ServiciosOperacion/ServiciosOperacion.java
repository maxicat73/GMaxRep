/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosOperacion;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServiciosOperacion {
    
    public Operacion crearOperacion(){
        Scanner leer=new Scanner(System.in);
        Operacion o1=new Operacion();
        System.out.println("Ingrese el primer numero");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        o1.setNumero2(leer.nextInt());
        
        return o1;
    }
    
    public int sumar(Operacion o1){
        
        int suma=o1.getNumero1()+o1.getNumero2();
     
        return suma;
        
    }
    
    public int restar(Operacion o1){
        int resta=o1.getNumero1()-o1.getNumero2();
        
        return resta;
    }
    
    public int multiplicar(Operacion o1){
        
        int multiplicacion=0;
        if(o1.getNumero1()!= 0 && o1.getNumero2()!=0){
            multiplicacion=o1.getNumero1()*o1.getNumero2();
            
        }
        else{
            System.out.println("Error/Ingrese un numero distinto de cero");
        }
        
        return multiplicacion;
    }
    
    public double division(Operacion o1){
        
        double division=0;
        if(o1.getNumero1()!= 0 && o1.getNumero2()!=0){
            division=o1.getNumero1()/o1.getNumero2();
        }
        else{
            System.out.println("Error/Ingrese un numero distinto de cero");
        }
        
        return division;
    }
    
    
}
