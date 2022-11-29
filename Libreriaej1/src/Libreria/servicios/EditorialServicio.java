/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EditorialServicio {

    EntityManagerFactory em = Persistence.createEntityManagerFactory("LibreriaJPA");
    EntityManager emf = em.createEntityManager();
    Editorial e1 = new Editorial();
    Scanner leer = new Scanner(System.in);
    List<Editorial> editoriales = new ArrayList();

    public void crearEditorial() {

        try {
            System.out.println("Ingrese los datos de la editorial:");
            System.out.println("ingrese el nombre de la editorial");
            String nombre = leer.next();

            if (buscarPorNombre(nombre).isEmpty()) {

                e1.setNombre(nombre);

                e1.setAlta(true);

                emf.getTransaction().begin();
                emf.persist(e1);
                emf.getTransaction().commit();
                System.out.println("Se creo Exitosamente la Editorial");
            } else {
                System.out.println("La editorial ya se encuentra creada");
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public Editorial buscarEditorialId(int id) {

        try {
            return e1 = emf.find(Editorial.class, id);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarEditorial() {

        System.out.println("ingrese el Id del Editorial a borrar");
        Editorial e = buscarEditorialId(leer.nextInt());
        try {
            if (e != null) {

                emf.getTransaction().begin();
                emf.remove(e);
                emf.getTransaction().commit();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificarEditorial() {

        System.out.println("ingrese el Id de la Editorial a modificar");
        Editorial e = buscarEditorialId(leer.nextInt());
        try {
            if (e != null) {
                System.out.println("ingrese el Nombre a modificar");
                String nombre = leer.next();
                e.setNombre(nombre);

                emf.getTransaction().begin();
                emf.merge(e);
                emf.getTransaction().commit();
            } else {
                System.out.println("no se encontro la editorial ingresada");
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public List buscarPorNombre(String nombre) {

        try {
            return editoriales = emf.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        } catch (Exception e) {
            throw e;
        }

    }

}
