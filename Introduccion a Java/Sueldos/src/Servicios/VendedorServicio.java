/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Maxi
 */
public class VendedorServicio {
    
    public Vendedor altaVendedor(){
     //instanciar un objeto vendedor
     Vendedor v1=new Vendedor();
     Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor: ");
        v1.setNombre(leer.next());
         System.out.println("Ingrese el DNI del vendedor: ");
        v1.setDni(leer.nextInt());
         System.out.println("Ingrese el sueldo basico del vendedor: ");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el día que empezo a trabajar en la empresa: ");
        int dia=leer.nextInt();
         System.out.println("Ingrese el mes que empezo a trabajar en la empresa: ");
        int mes=leer.nextInt();
         System.out.println("Ingrese el año que empezo a trabajar en la empresa: ");
        int anio=leer.nextInt();
        Date fecha=new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        
        return v1;
     
    }
    
    public void SueldoMensual(Vendedor v1){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor: ");
        Double ventas=leer.nextDouble();
        v1.setComisiones(ventas);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        
        System.out.println("El sueldo mensual del vendedor: "+ v1.getNombre()+ " es de $" +v1.getSueldoMensual());
        
        
    }
    
    public void vacaciones(Vendedor v1){
        Date hoy=new Date();
        int antiguedad=hoy.getYear()-v1.getFechaInicio().getYear();
        
        if(antiguedad<5){
            System.out.println("Le corresponden 14 días de vacaciones");
        }
        else if(antiguedad<10){
            System.out.println("Le corresponden 21 días de vacaciones");
        }
         else if(antiguedad<20){
            System.out.println("Le corresponden 28 días de vacaciones");
        }
        
        else if(antiguedad>20){
            System.out.println("Le corresponden 35 días de vacaciones");
        }
        else {
            System.out.println("Le corresponden vacaciones proporcionales");
        }
    }
    
    
    
}
