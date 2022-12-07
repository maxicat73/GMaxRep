package Libreria;

import Libreria.servicios.AutorServicio;
import Libreria.servicios.ClienteServicio;
import Libreria.servicios.EditorialServicio;
import Libreria.servicios.LibroServicio;
import Libreria.servicios.ServicioPrestamo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ej1JPA {

    public static void main(String[] args) throws Exception {

        LibroServicio ls = new LibroServicio();
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        ClienteServicio c1 = new ClienteServicio();
        ServicioPrestamo s1 = new ServicioPrestamo();
        Scanner leer=new Scanner(System.in);
  
            
        
   
        int respuesta;

        do {
            System.out.println("\n=== LIBRERIA ===\n");
            System.out.println("Elija la opcion correspondiente");
            System.out.println("1) AUTOR\n2) CLIENTE\n3) EDITORIAL\n4) LIBRO\n"
                    + "5) PRESTAMO\n6) SALIR\n");
            respuesta = leer.nextInt();
            switch (respuesta) {
                case 1:
                    do {
                        System.out.println("\n=== AUTOR ===\n");
                        System.out.println("Que deseas realizar?");
                        System.out.println("1) Crear autor\n2) Modificar autor\n"
                                + "3) Borrar autor\n4) Buscar autor por nombre\n5) Volver");
                        respuesta = leer.nextInt();
                        switch (respuesta) {
                            case 1:
                                as.crearAutor();
                                break;
                            case 2:
                                as.modificarAutor();
                                break;
                            case 3:
                                as.eliminarAutor();
                                break;
                            case 4:
                                System.out.println("ingrese el nombre del autor a buscar");
                                String nombre = leer.next();
                                as.mostrarAutores(as.buscarPorNombre(nombre));
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("respuesta erronea, intentelo nuevamente");
                        }
                    } while (respuesta != 5);
                    break;
                case 2:
                    do {
                        System.out.println("\n=== CLIENTE ===\n");
                        System.out.println("que desea realizar?");
                        System.out.println("1) Crear cliente\n2) Modificar cliente\n"
                                + "3) Borrar cliente\n4) Buscar cliente por nombre\n5) Volver");
                        respuesta = leer.nextInt();
                        switch (respuesta) {
                            case 1:
                                c1.crearCliente();
                                break;
                            case 2:
                                c1.modificarCliente();
                                break;
                            case 3:
                                c1.eliminarCliente();
                                break;
                            case 4:
                                System.out.println("ingrese el nombre del cliente a buscar");
                                String nombre = leer.next();
                                c1.mostrarClientes(c1.buscarNombre(nombre));
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("respuesta erronea, intentelo nuevamente");
                        }
                    } while (respuesta != 5);
                    break;
                case 3:
                    do {
                        System.out.println("\n=== EDITORIAL ===\n");
                        System.out.println("que desea hacer?");
                        System.out.println("1) Crear editorial\n2) Modificar editorial\n"
                                + "3) Borrar editorial\n4) Buscar editorial por nombre\n5) Volver");
                        respuesta = leer.nextInt();
                        switch (respuesta) {
                            case 1:
                                es.crearEditorial();
                                break;
                            case 2:
                                es.modificarEditorial();
                                break;
                            case 3:
                                es.eliminarEditorial();
                                break;
                            case 4:
                                System.out.println("ingrese el nombre de la editorial a buscar");
                                String nombre = leer.next();
                                es.mostrarEditoriales(es.buscarPorNombre(nombre));
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("respuesta invalida, intetelo nuevamente");
                        }
                    } while (respuesta != 5);
                    break;
                case 4:
                    do {
                        System.out.println("\n=== LIBRO ===\n");
                        System.out.println("que desea realizar?");
                        System.out.println("1) Crear libro\n2) Borrar libro\n3) Buscar libro por titulo\n"
                                + "4) Buscar libro por autor\n5) Buscar libro por titulo\n6) Volver");
                        respuesta = leer.nextInt();
                        switch (respuesta) {
                            case 1:
                                ls.crearLibro();
                                break;
                            case 2:
                                ls.eliminarLibro();
                                break;
                            case 3:
                                System.out.println("ingrese el titulo del libro a buscar");
                                String titulo = leer.next();
                                ls.mostrarLibros(ls.buscarPorTitulo(titulo));
                                break;
                            case 4:
                                System.out.println("ingrese el autor del libro a buscar");
                                String autor = leer.next();
                                ls.mostrarLibros(ls.buscarPorAutor(autor));
                                break;
                            case 5:
                                System.out.println("ingrese la editorial del libro a buscar");
                                String editorial = leer.next();
                                ls.mostrarLibros(ls.buscarPorEditorial(editorial));
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("respuesta erronea, intentelo nuevamente");
                        }
                    } while (respuesta != 6);
                    break;
                case 5:
                    do {
                        System.out.println("\n============= PRESTAMO =============\n");
                        System.out.println("que desea realizar?");
                        System.out.println("1) Crear prestamo\n2) Modificar prestamo\n"
                                + "3) Borrar prestamo\n4) Buscar prestamo por cliente\n5) Volver");
                        respuesta = leer.nextInt();
                        switch (respuesta) {
                            case 1:
                                s1.crearPrestamo();
                                break;
                            case 2:
                                s1.modificarPrestamo();
                                break;
                            case 3:
                                s1.eliminarPrestamo();
                                break;
                            case 4:
                                System.out.println("ingrese el nombre del cliente a buscar");
                                String nombre = leer.next();
                                s1.mostrarPrestamos(s1.buscarPorCliente(nombre));
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("respuesta erronea, intentelo nuevamente");
                        }
                    } while (respuesta != 5);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("respuesta erroena, intentelo nuevamente");
            }
        } while (respuesta != 6);
    }
}
        
        


