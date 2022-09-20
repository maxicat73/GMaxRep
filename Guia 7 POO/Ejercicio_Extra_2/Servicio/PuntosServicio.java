
package Ejercicio_Extra_2.Servicio;

import Ejercicio_Extra_2.Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in);
    Puntos p1 = new Puntos();
    
//Generar un objeto puntos que le pide al usuario los dos puntos
    public void crearPuntos(){
        
        System.out.println("Ingrese las coodenadas del primer punto");
        System.out.print("X: ");
        p1.setX1(leer.nextInt());
        System.out.print("Y: ");
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese las coodenadas del seguntp punto");
        System.out.print("X: ");
        p1.setX2(leer.nextInt());
        System.out.print("Y: ");
        p1.setY2(leer.nextInt());
    }

//calcula y devuelve la distancia que existe entre los dos puntos
    public double calcularDistancia(){
        
        return Math.sqrt(Math.pow(p1.getX2()-p1.getX1(), 2)+Math.pow(p1.getY2()-p1.getY1(), 2));
    }
}
