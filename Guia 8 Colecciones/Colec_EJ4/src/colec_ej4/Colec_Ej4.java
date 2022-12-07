
package colec_ej4;

import ServicioPeli.ServicePelicula;


public class Colec_Ej4 {

    
    public static void main(String[] args) {
       
        ServicePelicula s1=new ServicePelicula();
        s1.crearPelicula();
      //  s1.mostrarPeliculas();
        
       s1.ordenarPeliMayor();
               System.out.println("*-----------------*****");
      s1.ordenarPeliMenor();
            System.out.println("*-----------------*****");
      s1.ordenarPorTitulo();
            System.out.println("*-----------------*****");
      s1.ordenarporDirector();
      
      
    }
    
}
