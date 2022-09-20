/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import Entidad.Rectangulo;
import Servicios.ServicioRectangulo;

/**
 *
 * @author Maxi
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioRectangulo s1 = new ServicioRectangulo();

        Rectangulo r1 = s1.crearRectangulo();
        s1.calcularPerimetro(r1);
        s1.calcularSuperficie(r1);
        
        System.out.println("El perimetro del rectangulo es: "+s1.calcularPerimetro(r1)+ "y la superficie es : "+  s1.calcularSuperficie(r1));
        
        s1.dibujarRectangulo(r1);
        
    }

}
