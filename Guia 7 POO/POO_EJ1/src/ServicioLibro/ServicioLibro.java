/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioLibro;

import Entidad.CrearLibro;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioLibro {

    public CrearLibro cargarLibro() {

        Scanner leer = new Scanner(System.in);
        CrearLibro libro1 = new CrearLibro();
        System.out.println("Ingresar el ISBN del libro");
        libro1.setIsbn(leer.nextInt());
        System.out.println("Ingresar el titulo del libro");
        libro1.setTitulo(leer.next());
        System.out.println("Ingresar el autor del libro");
        libro1.setAutor(leer.next());
        System.out.println("Ingresar la cantidad de paginas del libro");
        libro1.setPaginas(leer.nextInt());

        return libro1;

    }
    
    public void MostrarLibro(CrearLibro libro1){
        
        System.out.println("El Isbn del libro "+libro1.getTitulo()+" es "+libro1.getIsbn()+"y su autor es "+libro1.getAutor()+"y su cantidad de paginas es "+libro1.getPaginas());
        
        
    }

}
