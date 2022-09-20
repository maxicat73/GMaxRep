/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import Entidad.Circunferencia;
import ServicioCircunferencia.ServicioC;

/**
 *
 * @author Maxi
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ServicioC c1=new ServicioC();
        Circunferencia c2=c1.crearCircunferencia();
        c1.area(c2);
        c1.perimetro(c2);
        
        
    }
}
