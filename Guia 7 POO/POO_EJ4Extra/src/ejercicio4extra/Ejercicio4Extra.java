/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extra;

import Entidad.NIF;
import Servicios.ServicioNIF;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       ServicioNIF s1=new ServicioNIF();
       NIF n1=new NIF();
        System.out.println("Ingrese el DNI:");
        n1.setDni(leer.nextLong());
        
        System.out.println("EL NIF correspondiente es :" + n1.getDni()+ "-" + s1.crearNif(n1)); 
       
    }
    
}
