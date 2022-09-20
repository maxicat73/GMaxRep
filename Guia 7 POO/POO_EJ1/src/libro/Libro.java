/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package libro;

import Entidad.CrearLibro;
import ServicioLibro.ServicioLibro;

/**
 *
 * @author Maxi
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ServicioLibro libro1=new ServicioLibro();
        CrearLibro l1=libro1.cargarLibro();
        libro1.MostrarLibro(l1);
        
    }
    
}
