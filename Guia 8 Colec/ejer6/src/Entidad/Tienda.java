/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Entidad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Tienda {
    
    Scanner leer = new Scanner(System.in);
    HashMap<String,Integer>precios = new HashMap<>();
    
    public void menu (){
        System.out.println("ingrese la opcion : ");
        System.out.println("1-ingresar productos y precio");
        System.out.println("2-mostrar productos");
        System.out.println("3-modificar un producto");
        System.out.println("4-eliminar un producto");
        System.out.println("5-salir");
        System.out.println("");
        
        int opcion = 0;
        
        do {
            System.out.print("ingrese su opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
            case 1:
              almacenar(); 
              break;
            case 2:
                mostrarProductos(); 
                break;
            case 3:
                modificar();
                break;
            case 4:
                EliminarProducto();
                break;
            case 5:
                System.out.println("usted salio del menu");
                break;
            default:
                System.out.println("no ingreso una opcion valida");
        }       
        } while (opcion != 5 );
        
       
 
        
        
    }
    
    
    
    public void almacenar(){
        String seguir = "y";
        
        do {
             System.out.println("ingrese el producto");    
        String producto = leer.next().toUpperCase();
        System.out.println("ingrese el valor del producto");
        int valor = leer.nextInt();
        
        precios.put(producto, valor);
            System.out.println("desea ingresar otro producto (y/n)");
            seguir = leer.next();
            
        } while (seguir.equalsIgnoreCase("y"));
          
      
        }
    public void mostrarProductos(){
        
        for (Map.Entry<String, Integer> entry : precios.entrySet()) {
           
            System.out.println("producto = "+ entry.getKey() + " precio = "+ entry.getValue() );
            
        }
    }
    
    
    public void modificar(){
      
        System.out.println("que producto desea modificar??");
        String modificar = leer.next().toUpperCase();
        for (Map.Entry<String, Integer> entry : precios.entrySet()) {
            if (modificar.equalsIgnoreCase(entry.getKey())) {
                System.out.println("ingrese el nuevo precio");
                Integer precio2 = leer.nextInt();
                precios.replace(modificar,precio2 );
                System.out.println("el nuevo precio de " + entry.getKey() + " es $ " + entry.getValue());
                
            }
            
        }
        
        
    }
    
    public void EliminarProducto(){
        
        System.out.println("que producto desea eliminar??");
        String eliminar = leer.next().toUpperCase();
      
            if (precios.containsKey(eliminar)) {
            
                precios.remove(eliminar);
              
            }   
       
    }
    
}
