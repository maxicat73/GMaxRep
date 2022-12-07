
package jpaej1;


import libreria.services.AutorService;
import libreria.services.EditorialService;
import libreria.services.LibroService;

public class JPAej1 {

   
    public static void main(String[] args) {
    
        LibroService l1=new LibroService();
        AutorService a1=new AutorService();
        EditorialService e1=new EditorialService();
        
        
       a1.crearAutor();
        e1.crearEditorial();
       l1.crearLibro();
        
    }
    
}
