package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LibroServicio {

    Scanner leer = new Scanner(System.in);
    EntityManagerFactory em = Persistence.createEntityManagerFactory("LibreriaJPA");
    EntityManager emf = em.createEntityManager();
    Libro L1 = new Libro();
    Editorial e1 = new Editorial();
    Autor a1 = new Autor();
    EditorialServicio ed1 = new EditorialServicio();
    AutorServicio at1 = new AutorServicio();

    List<Libro> libros = new ArrayList();

    public void crearLibro() {

        try {

            System.out.println("Ingrese el isbn: ");

            Long isbn = leer.nextLong();

            if (buscarIsbn(isbn) == null) {
                Libro l2 = new Libro();
                l2.setIsbn(isbn);
                System.out.println("ingrese el Titulo: ");
                l2.setTitulo(leer.next());
                System.out.println("ingrese el Año: ");
                l2.setAnio(leer.nextInt());
                System.out.println("Ingrese los ejemplares:");
                l2.setEjemplares(leer.nextInt());
                System.out.println("ingrese los ejemplares prestados");
                l2.setEjemplaresPrestados(leer.nextInt());

                l2.setEjemplaresRestantes(l2.getEjemplares() - l2.getEjemplaresPrestados());
                l2.setAlta(true);

                System.out.println("Ingrese la editorial; ");
                l2.setEditorial(ed1.buscarEditorialId(leer.nextInt()));

                System.out.println("ingrese el Autor:");
                l2.setAutor(at1.buscarAutorId(leer.nextInt()));

                emf.getTransaction().begin();
                emf.persist(l2);
                emf.getTransaction().commit();
                System.out.println("Se cargo con Exito el Libro ingresado");
            } else {
                System.out.println("El libro ya fue ingresado");
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public Libro buscarIsbn(Long isbn) {

        try {
            return L1 = emf.find(Libro.class, isbn);
        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarLibro() {

        try {
            System.out.println("Ingrese el isbn: ");

            Long isbn = leer.nextLong();
            Libro l2 = buscarIsbn(isbn);
            if (l2 != null) {

                System.out.println("ingrese el año a modificar");
                l2.setAnio(leer.nextInt());

                emf.getTransaction().begin();
                emf.merge(l2);
                emf.getTransaction().commit();

            } else {
                System.out.println("el libro se modifico correctamente.");
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarLibro() {

        try {

            System.out.println("ingrese el ISBN del libro a eliminar");
            Long isbn = leer.nextLong();
            if (buscarIsbn(isbn) != null) {

                Libro l2 = buscarIsbn(isbn);

                emf.getTransaction().begin();
                emf.remove(l2);
                emf.getTransaction().commit();
                System.out.println("se elimino el libro correctamente");
            } else {
                System.out.println("no se encontro el libro ingresado");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public List buscarPorTitulo(String titulo) {

        try {
            return libros = emf.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :titulo")
                    .setParameter("titulo", titulo).getResultList();
        } catch (Exception e) {
            throw e;
        }

    }

    public List buscarPorEditorial(String editorial) {

        try {
            return libros = emf.createQuery("SELECT a FROM Libro a JOIN a.editorial e WHERE e.nombre LIKE :editorial")
                    .setParameter("editorial", editorial).getResultList();

        } catch (Exception e) {
            throw e;
        }

    }

    public List buscarPorAutor(String autor) {

        try {
            return libros = emf.createQuery("SELECT a FROM Libro a JOIN  a.autor au WHERE au.nombre LIKE :autor")
                    .setParameter("autor", autor).getResultList();

        } catch (Exception e) {
            throw e;
        }

    }

}
