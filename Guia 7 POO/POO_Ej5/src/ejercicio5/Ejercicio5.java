/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Entidad.Cuenta;
import Servicios.Servicios;

/**
 *
 * @author Maxi
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicios s1=new Servicios();
        Cuenta c1=s1.crearCuenta();
        
        System.out.println("el saldo de la cuenta"+ c1.getNumeroDeCuenta()+ " es " + c1.getSaldo());
        c1=s1.ingresarSaldo(c1);
        
        System.out.println("el saldo de la cuenta"+ c1.getNumeroDeCuenta()+ " es " + c1.getSaldo());
        
        c1=s1.retirarSaldo(c1);
       System.out.println("el saldo de la cuenta"+ c1.getNumeroDeCuenta()+ " es " + c1.getSaldo());
       
       
       c1=s1.extraccionRapida(c1);
       System.out.println("el saldo de la cuenta"+ c1.getNumeroDeCuenta()+ " es " + c1.getSaldo());
       
    }
    
    
    
}
