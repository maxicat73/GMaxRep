package Libreria.servicios;

import Libreria.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteServicio {

    Scanner leer = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaJPA");
    EntityManager em = emf.createEntityManager();
    Cliente cliente = new Cliente();
    List<Cliente> clientes=new ArrayList();
    
    public void crearCliente() {

        try {
            System.out.println("ingrese el DNI");
            Long dni = leer.nextLong();
            if (buscarPorDocumento(dni) == null) {
                Cliente cli = new Cliente();
                System.out.println("ingrese el ID");
                cli.setId(leer.nextInt());
                System.out.println("Se ingreso el dni brindado;");
                System.out.println("------------");
                cli.setDocumento(dni);
                System.out.println("Ingrese Nombre: ");
                cli.setNombre(leer.next());
                System.out.println("Ingrese Apelllido");
                cli.setApellido(leer.next());
                System.out.println("Ingrese el Telefono");
                cli.setTelefono(leer.next());

                em.getTransaction().begin();
                em.persist(cli);
                em.getTransaction().commit();
                System.out.println("El cliente fue Creado Exitosamente");
            } else {
                System.out.println("el cliente ingresado ya existe");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarCliente() {

        try {
            System.out.println("ingrese el id a modificar");
            int id = leer.nextInt();
            Cliente cli2 = busquedaporID(id);
            if (cli2 != null) {
                System.out.println("¿Que desea modificar?");
                System.out.println("Nombre");
                System.out.println("Apellido");
                System.out.println("Documento");
                System.out.println("Telefono");

                System.out.println("-----------");
                System.out.println("Ingrese la opcion");
                int respuesta = leer.nextInt();
                switch (respuesta) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre");
                        cli2.setNombre(leer.next());
                        break;
                    case 2:
                        System.out.println("ingrese el nuevo Apellido");
                        cli2.setApellido(leer.next());
                        break;
                    case 3:
                        System.out.println("Ingrese el nuevo documento");
                        cli2.setDocumento(leer.nextLong());
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo telefono");
                        cli2.setTelefono(leer.next());
                        break;

                }
                em.getTransaction().begin();
                em.merge(cli2);
                em.getTransaction().commit();

                System.out.println("el cliente se modifico con exito");
            } else {
                System.out.println("no se encuentra el cliente");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarCliente() {
        try {
            System.out.println("ingrese el id:");
            int id = leer.nextInt();
            Cliente cli3 = busquedaporID(id);
            if (cli3 != null) {

                em.getTransaction().begin();
                em.remove(cli3);
                em.getTransaction().commit();

                System.out.println("el cliente fue eliminado con exito");

            } else {
                System.out.println("no se encontro al cliente");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public Cliente busquedaporID(Integer id) {
        try {
            Cliente c = em.find(Cliente.class, id);
            return c;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Cliente buscarPorDocumento(Long documento){
        try {
            Cliente Cli=new Cliente();
               return Cli=(Cliente) em.createQuery("SELECT a FROM Cliente a WHERE a.documento LIKE :documento")
                       .setParameter("documento", documento).getSingleResult();
                
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List buscarNombre(String nombre){
      
        try{
            return clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre")
                    .setParameter("nombre",nombre).getResultList();
        }catch(Exception e){
            throw e;
        }
    }
    
      public void mostrarClientes (List<Cliente> clientes) throws Exception{
        System.out.println("\nCLIENTES");
        System.out.println("____________________________________________________________");
        System.out.printf("|%-3s|%-13s|%-13s|%-13s|%-13s|\n", "ID", "DNI", "NOMBRE", "APELLIDO", "TELEFONO", "");
        for (Cliente aux : clientes) {
            System.out.printf("|%-3s|%-13s|%-13s|%-13s|%-13s|\n",
                             aux.getId(), aux.getDocumento(), aux.getNombre(), aux.getApellido(), aux.getTelefono(), "");
        }
        System.out.println("____________________________________________________________");
    }  
    

}
