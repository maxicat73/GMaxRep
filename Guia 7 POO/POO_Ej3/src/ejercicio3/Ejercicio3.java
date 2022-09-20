/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidad.Operacion;
import ServiciosOperacion.ServiciosOperacion;

/**
 *
 * @author Maxi
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServiciosOperacion operacion1 = new ServiciosOperacion();
        Operacion op1 = operacion1.crearOperacion();
        System.out.println("La suma de los numeros es " + operacion1.sumar(op1));
        System.out.println("La resta de los numeros es " + operacion1.restar(op1));
        System.out.println("La division  de los numeros es " + operacion1.division(op1));
        System.out.println("La multiplicacion  de los numeros es " + operacion1.multiplicar(op1));

    }

}
