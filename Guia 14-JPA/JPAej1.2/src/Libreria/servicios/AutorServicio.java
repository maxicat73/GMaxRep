/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Autor;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mexi_
 */
public class AutorServicio {

    EntityManagerFactory em = Persistence.createEntityManagerFactory("LibreriaJPA");
    EntityManager emf = em.createEntityManager();
   
    List<Autor> autores = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void crearAutor() {

        System.out.println("ingrese el nombre");
        String nombre = leer.next();

        try {
            if (buscarPorNombre(nombre).isEmpty()) {
              
                Autor a1 = new Autor(nombre,true);

               emf.getTransaction().begin();
                emf.persist(a1);
                emf.getTransaction().commit();
                System.out.println("se creo exitosamente el autor");
            } 
            else {
                System.out.println("el autor ya existe");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public Autor buscarAutorId(int id) {

        try {
            Autor a1=new Autor();
            return a1 = emf.find(Autor.class, id);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarAutor() {
        System.out.println("ingrese el Id del Autor a modificar");
        Autor a = buscarAutorId(leer.nextInt());
        try {
            if (a != null) {

         
                System.out.println("ingrese el  nuevo nombre del autor ");
                String nombre = leer.next();
                a.setNombre(nombre);

                emf.getTransaction().begin();
                emf.merge(a);
                emf.getTransaction().commit();
                System.out.println("Se modifico correctamente el  Autor");
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarAutor() {
        System.out.println("ingrese el Id del Autor a borrar");
        Autor a = buscarAutorId(leer.nextInt());
        try {
            if (a != null) {

                emf.getTransaction().begin();
                emf.remove(a);
                emf.getTransaction().commit();
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public List buscarPorNombre(String nombre) {
        try {
            return autores = emf.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        } catch (Exception e) {
            throw e;
        }

    }
    public void mostrarAutores(List<Autor> autores) throws Exception{
        System.out.println("\nAUTORES");
        System.out.println("__________________________");
        System.out.printf("|%-3s|%-13s|%-7s|\n", "ID", "NOMBRE", "ALTA", "");
        for (Autor aux : autores) {
            System.out.printf("|%-3s|%-13s|%-7s|\n", aux.getId(), aux.getNombre(), "");
        }
        System.out.println("__________________________");
    } 
    
    

}
