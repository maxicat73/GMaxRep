/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Uno_Doce_Dispositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        int correcta = 0;
        int incorrecta = 0;
        
        do {
            System.out.println("ingrese una cadena");
            cadena = leer.next();

            int l = cadena.length();

            if (l<=5 && cadena.substring(0,1).equals("X") && cadena.substring(l-1,l).equals("O")) {
                correcta += 1;
            } else {
                incorrecta += 1;
            } 
        } while ( 0 != cadena.compareTo("&&&&&"));

        System.out.println("INFORME");
        System.out.println("cantidad de ingresos correctos: " + correcta);
        System.out.println("cantidad de ingresos incorrectos: " + incorrecta);
    }
    
}
