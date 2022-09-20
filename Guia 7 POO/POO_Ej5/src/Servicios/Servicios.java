/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cuenta;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Maxi
 */
public class Servicios {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese los datos de la cuenta");
        System.out.println(" ");
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroDeCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        c1.setDni(leer.nextLong());
        System.out.println("Ingrese su saldo");
        c1.setSaldo(leer.nextInt());

        return c1;
    }

    public Cuenta ingresarSaldo(Cuenta c1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese el importe ingresar: ");
        double ingreso = leer.nextDouble();
        int suma= c1.getSaldo()+(int)Math.round(ingreso);

        c1.setSaldo(suma);
        
        return c1;
    }
    
    public Cuenta retirarSaldo(Cuenta c1){
        
        System.out.println("Ingrese el importe a retirar");
        double retiro=leer.nextDouble();
        
        if(retiro>c1.getSaldo()){
            c1.setSaldo(0);
        }
        else{
            int resta=c1.getSaldo()-(int)Math.round(retiro);
            c1.setSaldo(resta);
        }
        
        return c1;
    }

    public Cuenta extraccionRapida(Cuenta c1) {
  
        boolean cond = false;
        while (cond == false) {
        System.out.println("Ingrese el importe a retirar");
        double retiro = leer.nextDouble();

        

      
            if (retiro > (c1.getSaldo() * (0.2))) {
                System.out.println("Usted puede retirar solamente " + c1.getSaldo() * 0.2);
                
                
            } else {
                int resta = c1.getSaldo() - (int) Math.round(retiro);
                c1.setSaldo(resta);
                cond = true;

            }
            break;
        }
        
        return c1;
    }
    
}

