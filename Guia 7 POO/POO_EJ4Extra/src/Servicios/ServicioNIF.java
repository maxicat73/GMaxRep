/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioNIF {
    Scanner leer=new Scanner(System.in);
    String[] v1=new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
    
    public String crearNif(NIF n1){
        
      
        long resto=n1.getDni()%23;
        
        String letra = v1[Math.toIntExact(resto)];
       
        return letra;
        
        
    }

   
    
    
    
    
}
