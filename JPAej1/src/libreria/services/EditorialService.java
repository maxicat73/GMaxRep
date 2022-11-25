
package libreria.services;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


public class EditorialService {
    
     EntityManagerFactory emf=Persistence.createEntityManagerFactory("JpaEj1");
    EntityManager em=emf.createEntityManager();
    Scanner leer=new Scanner(System.in);
    
    Editorial e1=new Editorial();
    
   
      
      
      public void crearEditorial(){
      
        try {
               
           e1.setId(1);
             e1.setNombre("ProfeciasdeEGG");
            e1.setAlta(true);
               
               em.getTransaction().begin();
               em.persist(L1);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
        
    }
    

    
    public void modificarEditorial(){
     
          try {
              System.out.println("ingrese el ID de Editorial a modificar");
                 Editorial e2=em.find(Editorial.class,leer.nextInt() );
                 System.out.println("ingrese el nuevo dato modificar");
                 e2.setNombre("ParaisodeEGG");
                 
               em.getTransaction().begin();
               em.merge(e2);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
    }
        
         public void eliminarEditorial() {
              
               try {
              System.out.println("ingrese el ID de Editorial a Modificar");
                 Editorial e2=em.find(Editorial.class, leer.nextInt());
                
               em.getTransaction().begin();
               em.remove(e2);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
        
        
          }
    
    
}
