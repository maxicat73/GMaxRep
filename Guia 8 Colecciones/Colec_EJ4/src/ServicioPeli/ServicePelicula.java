
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//
//22
//
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.


package ServicioPeli;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServicePelicula {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peli=new ArrayList();
   String v="s";

    
   public void crearPelicula(){
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            String director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula");
            double duracion = leer.nextDouble();

        peli.add(new Pelicula(titulo, director, duracion));

        System.out.println("Desea ingresar otra pelicula S/N: ");

        v = leer.next();
       
    }   while(!v.equalsIgnoreCase("n")); 
    
}
   
   public void mostrarPeliculas(){
       
       for (Pelicula aux : peli) {
           System.out.println(aux);
       }
       
   }
   
    public void mostrarPelis() {

        for (Pelicula aux : peli) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }
    }
    
    public void ordenarPeliMayor(){
        
        System.out.println("se ordenan las peliculas de Mayor a Menor");
        peli.sort(duracion);
        mostrarPeliculas();
        
    }
   
    public void ordenarPeliMenor(){
        
        System.out.println("se ordenan las peliculas de Menor a Mayor");
        peli.sort(duracion1);
        mostrarPeliculas();
        
    }
    
    public void ordenarPorTitulo(){
        
        System.out.println("a continuacion se ordenaran las peliculas por titulo");
        peli.sort(titulo);
        mostrarPeliculas();
    }
    
    public void ordenarporDirector(){
        
        System.out.println("A continuacion se ordenaran las peliculas por director");
        peli.sort(director);
        mostrarPeliculas();
    }
    
    
    
    
   
   //Metodo comparator para 
    public static Comparator<Pelicula> duracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            double aux = t1.getDuracion() - t.getDuracion();
            if (aux > 0) {
                return 1;
            }
            if (aux < 0) {
                return -1;
            }
            return 0;
        }
    };
    
    private static Comparator<Pelicula> duracion1 = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    
        private static Comparator<Pelicula> titulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
        
           private static Comparator<Pelicula> director = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
    
} 
    



        
        
    
    


            