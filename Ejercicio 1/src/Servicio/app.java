package Servicio;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        Producto producto;

        ServicioProducto servicioProducto = new ServicioProducto();
        int opcion = leer.nextInt();
   
        
        System.out.println("MENUUUUU");
        
        servicioProducto.crearProducto();

   
        servicioProducto.eliminacion();

   
        producto = servicioProducto.consultardatos();
        System.out.println(producto);

         
        ArrayList<String> nombres;
        try {
            nombres = servicioProducto.arra();
            for (String string : nombres) {
                System.out.println(string);
            }
        } catch (Exception e) {
            System.out.println("Error nombres");
        }

    }

}
