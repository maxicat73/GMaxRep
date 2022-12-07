
package libreria.services;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Libro;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

public class LibroService {
    
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("JpaEj1");
    EntityManager em=emf.createEntityManager();
    Scanner leer=new Scanner(System.in);
    Autor a1=new Autor();
    Editorial e1=new Editorial();
     Libro L1=new Libro();
      
    public void crearLibro(){
       
        try {
//               L1.setISBN(25085L);
//               L1.setTitulo("Los muchachosdeEGG");
//               L1.setAnio(2006);
//               L1.setEjemplares(50);
//               L1.setEjemplaresPrestados(5);
//               L1.setEjemplaresRestantes(L1.getEjemplares()-L1.getEjemplaresPrestados());
//               L1.setAlta(true);
//               L1.setEditorial(new Editorial(2,"Picantes",true));
//               L1.setAutor(new Autor(1,"Luis Betancurt",true));
               
               em.getTransaction().begin();
               em.persist(L1);
               em.getTransaction().commit();
              
               
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Libro buscarIsbn(Long isbn){
            
        try{
            return L1 = em.find(Libro.class, isbn);       
        }catch(Exception e){
            throw e;
        }
    }
    
    public void modificarLibro(){
     
          try {
              System.out.println("ingrese el ISBN del libro a modificar");
                 Libro l2=buscarIsbn(leer.nextLong());
                 System.out.println("ingrese el año a modificar");
                 l2.setAnio(leer.nextInt());
               em.getTransaction().begin();
               em.merge(l2);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
    }
        
         public void eliminarLibro() {
              
               try {
              System.out.println("ingrese el ISBN del libro a eliminar");
                 Libro l2=buscarIsbn(leer.nextLong());
                
               em.getTransaction().begin();
               em.remove(l2);
               em.getTransaction().commit();
               
               
        } catch (Exception e) {
            throw e;
        }
        
          }
         
         
          
        
        
    }
    
    
    

