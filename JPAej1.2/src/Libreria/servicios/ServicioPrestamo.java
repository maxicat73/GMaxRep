
package Libreria.servicios;

import Libreria.entidades.Cliente;
import Libreria.entidades.Libro;
import Libreria.entidades.Prestamo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ServicioPrestamo {

    Scanner leer = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaJPA");
    EntityManager em = emf.createEntityManager();
    List<Prestamo> prestamos = new ArrayList();
    Prestamo p = new Prestamo();
    LibroServicio l1 = new LibroServicio();
    ClienteServicio c1 = new ClienteServicio();
    SimpleDateFormat s1 = new SimpleDateFormat("yyyy/mm/dd");

    public void crearPrestamo() throws Exception {

        Cliente cli = new Cliente();
        Libro lib = new Libro();
        LibroServicio l = new LibroServicio();
        Prestamo pre = new Prestamo();
        ClienteServicio c1 = new ClienteServicio();
       List<Prestamo> prestamosC2 = new ArrayList();
        List<Prestamo> prestamosT2 = new ArrayList();
        try {
            
            System.out.println("Ingrese la fecha del prestamo AAAA/MM/DD");
            String fecha1 = leer.next();
            SimpleDateFormat s = new SimpleDateFormat("yyyy/mm/dd");
            Date f1 = s.parse(fecha1);
            pre.setFechaPrestamo(f1);
            System.out.println("Ingrese el titulo");
            String titulo = leer.next();
            List<Libro> l2 = l1.buscarPorTitulo(titulo);
            for (Libro aux : l2) {
                System.out.println(aux.toString());
            }
            
            System.out.println("ingrese el ibsn a prestar");
            lib = l1.buscarIsbn(leer.nextLong());
            pre.setLibro(lib);
            System.out.println("Ingrese el documento del cliente");
            cli = c1.buscarPorDocumento(leer.nextLong());
              prestamosC2 =buscarPorCliente(cli.getNombre());
            prestamosT2 = buscarPorLibro(titulo);
            if (cli != null && prestamosT2.isEmpty() && prestamosC2.isEmpty() ) {
                pre.setCliente(cli);
            }
            System.out.println("A continuacion debera modificar la cantidad");
            l.modificarLibro();
            
            em.getTransaction().begin();
            em.persist(pre);
            em.getTransaction().commit();
            System.out.println("------------------------------");
            System.out.println("El prestamo se creo Exitosamente");
        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarPrestamo() throws Exception {

        System.out.println("Ingrese el nombre del cliente :");
        String cliente = leer.next();
        System.out.println("ingrese el titulo del libro");
        String titulo = leer.next();
        List<Prestamo> prestamosC = new ArrayList();
        List<Prestamo> prestamosT = new ArrayList();
        prestamosC = buscarPorCliente(cliente);
        prestamosT = buscarPorLibro(titulo);
        ClienteServicio cl = new ClienteServicio();
        try {

            if (!prestamosC.isEmpty() && !prestamosT.isEmpty()) {
                for (Prestamo aux : prestamosC) {
                    System.out.println(aux.toString());
                }
                System.out.println("ingrese el Id del cliente:");
                Prestamo p2 = buscarPorId(leer.nextInt());
                if (p2 != null && p2.getLibro().getEjemplaresPrestados() > 0) {
                    l1.modificarLibro();
                    
                    System.out.println("ingrese la fecha de devolucion");
                    String fechaD = leer.next();
                    p2.setFechaDevolucion(s1.parse(fechaD));
                    
                    
                 
                    em.getTransaction().begin();
                    em.merge(p2);
                    em.getTransaction().commit();
                    System.out.println("Modificacion exitosa");
                    
                } else {
                    System.out.println("No se encontro el prestamo");
                }
            } else {
                System.out.println("No se encuentra el Prestamo ");
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarPrestamo() {

        System.out.println("ingrese el Id del Prestamo a borrar");
        Prestamo p = buscarPorId(leer.nextInt());
        try {
            if (p != null) {
                em.getTransaction().begin();
                em.remove(p);
                em.getTransaction().commit();
                System.out.println("El Prestamo fue eliminado con exito");
            } else {
                System.out.println("No se encontro el prestamo");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Prestamo buscarPorId(int id) {

        try {
            Prestamo p2 = new Prestamo();
            return p2 = em.find(Prestamo.class, id);
        } catch (Exception e) {
            throw e;
        }
    }

    public List buscarPorCliente(String cliente) {
        try {

            return prestamos = em.createQuery("SELECT p FROM Prestamo p JOIN p.cliente c WHERE c.nombre LIKE :nombre ")
                    .setParameter("nombre", cliente).getResultList();

        } catch (Exception e) {
            throw e;
        }

    }

    public List buscarPorLibro(String libro) {
        try {

            return prestamos = em.createQuery("SELECT p FROM Prestamo p JOIN p.libro l WHERE l.titulo LIKE :nombre ")
                    .setParameter("nombre", libro).getResultList();

        } catch (Exception e) {
            throw e;
        }

    }

    public List buscarPorFecha(String fechaPres) {
        try {

            return prestamos = em.createQuery("SELECT p FROM Prestamo p  WHERE p.fechaPrestamo LIKE :fechaPres ")
                    .setParameter("fechaPres", fechaPres).getResultList();

        } catch (Exception e) {
            throw e;
        }

    }

    public List buscarPrestamo() {
        try {

            return prestamos = em.createQuery("SELECT p FROM Prestamo p ")
                    .getResultList();

        } catch (Exception e) {
            throw e;
        }

    }
    
     public void mostrarPrestamos(List<Prestamo> prestamos) throws Exception{
        System.out.println("\nPRESTAMO");
        System.out.println("________________________________________________________");
        System.out.printf("|%-3s|%-13s|%-13s|%-13s|%-13s|\n", "ID", "PRESTAMO", "DEVOLUCION", "LIBRO", "CLIENTE", "");
        for (Prestamo aux : prestamos) {
            System.out.printf("|%-13s|%-7s|%-26s|%-13s|%-13s|%-13s|%-13s|\n",
                             aux.getId(), aux.getFechaPrestamo(), aux.getFechaDevolucion(), aux.getLibro().getTitulo(), aux.getCliente().getNombre(), "");
        }
        System.out.println("________________________________________________________");
    } 

}
