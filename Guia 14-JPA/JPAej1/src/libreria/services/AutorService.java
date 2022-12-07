
package libreria.services;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


public class AutorService {
    
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("JpaEj1");
    EntityManager em=emf.createEntityManager();
    Scanner leer=new Scanner(System.in);
    Autor a1=new Autor();
    Editorial e1=new Editorial();
      Libro L1=new Libro();
   
      
      
      public void crearAutor(){
      
        try {
               
//              a1.setId(1);
//               a1.setNombre("JulioelTUCU");
//               a1.setAlta(true);
               
               em.getTransaction().begin();
               em.persist(L1);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
        
    }
    

    
    public void modificarAutor(){
     
          try {
              System.out.println("ingrese el ID del Autor a modificar");
                 Autor a2=em.find(Autor.class,leer.nextInt() );
                 System.out.println("ingrese el nuevo dato modificar");
                 a2.setNombre("Juancho");
                 
               em.getTransaction().begin();
               em.merge(a2);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
    }
        
         public void eliminarAutor() {
              
               try {
              System.out.println("ingrese el ID del Autor a Modificar");
                 Autor a2=em.find(Autor.class, leer.nextInt());
                
               em.getTransaction().begin();
               em.remove(a2);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
        
        
          }
         
         
    
    
}
