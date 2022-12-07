
package tienda;

import tienda.servicios.ProductoService;

public class Tienda {


    public static void main(String[] args) throws Exception {
     
        ProductoService p1=new ProductoService();
         System.out.println("--------------------");
        p1.mostrarConsulta1();
        System.out.println("--------------------");
        p1.mostrarConsulta2();
         System.out.println("--------------------");
        p1.mostrarConsulta3();
        System.out.println("--------------------");
        p1.mostrarConsulta4();
          System.out.println("--------------------");
          p1.mostrarConsulta5();
                System.out.println("--------------------");
           
    }
    
}
