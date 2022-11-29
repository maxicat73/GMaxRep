
package Libreria;

import Libreria.servicios.AutorServicio;
import Libreria.servicios.EditorialServicio;
import Libreria.servicios.LibroServicio;
import java.util.Scanner;

public class Ej1JPA {

  
    public static void main(String[] args) {
      
        LibroServicio ls=new LibroServicio();
        AutorServicio as=new AutorServicio();
        EditorialServicio es=new EditorialServicio();
        Scanner leer=new Scanner(System.in);
        int respuesta;
            do {
            System.out.println("\n============= LIBRERIA =============\n");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1) Crear autor");
            System.out.println("2) Modificar Autor");
            System.out.println("3) Eliminar Autor");
            System.out.println("4) Buscar Autor por nombre");
            System.out.println("5) Crear editorial");
            System.out.println("6) Modificar Editorial ");
            System.out.println("7) Eliminar Editorial");
            System.out.println("8) Crear libro");
            System.out.println("9) Modificar Libro");
            System.out.println("10) Eliminar Libro");
            System.out.println("11) Buscar Libro por ISBN");
            System.out.println("12) Buscar Libro por titulo");
            System.out.println("13) Buscar Libro por Autor");
            System.out.println("14) Buscar Libro por Editorial ");
            System.out.println("15) Salir");
            respuesta = leer.nextInt();

            switch (respuesta){

                case 1: as.crearAutor();
                break;
                case 2: as.modificarAutor();
                break;
                case 3: as.eliminarAutor();
                break;
                case 4: 
                    System.out.println("ingrese el nombre a buscar");
                    String nombre=leer.next();
                    as.buscarPorNombre(nombre);
                break;
                case 5: es.crearEditorial();
                break;
                case 6: es.modificarEditorial();
                break;
                case 7: es.eliminarEditorial();
                break;
                case 8: ls.crearLibro();
                break;
                case 9: ls.modificarLibro();
                break;
                case 10: ls.eliminarLibro();
               
                break;
                case 11: 
                    System.out.println("ingrese el isbn a buscar");
                    Long isbn=leer.nextLong();
                    ls.buscarIsbn(isbn);
                break;
                case 12:
                    System.out.println("ingrese el titulo que desea buscar");
                    String titulo=leer.next();
                    ls.buscarPorTitulo(titulo);
                break;
                case 13:
                    System.out.println("ingrese el autor que desea buscar:");
                    String autor=leer.next();
                  
                   ls.buscarPorAutor(autor);
                        
                break;
                case 14:
                    System.out.println("ingrese la editorial que desea buscar:");
                    String editorial=leer.next();
                    ls.buscarPorEditorial(editorial);
                case 15: break;
            } 
        }  while (respuesta!=15); 
    }
    
}
        
        
       // a1.crearAutor();
     //  e1.crearEditorial();
   //
       
       
    
    

