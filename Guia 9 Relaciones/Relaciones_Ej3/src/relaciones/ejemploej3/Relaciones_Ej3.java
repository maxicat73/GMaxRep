
package relaciones.ejemploej3;

import Entidad.Baraja;

         

public class Relaciones_Ej3 {

    
    public static void main(String[] args) {
       
        Baraja baraja=new Baraja();
        System.out.println("inicializando el mazo");
        baraja.crearCartas();
        System.out.println("*********************************");
        System.out.println("*********************************");
        baraja.mostrarBaraja();
        System.out.println("a continuacion se muestran la cartas disponibles");
        baraja.cartasDisponibles();
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("a continuacion se mezclara el mazo");
        baraja.barajar();
         baraja.mostrarBaraja();
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("a continuacion se solicitaran las cartas");
        baraja.darCartas();
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("despues de repartir quedaran las siguientes casas");
     
        baraja.cartasDisponibles();
         System.out.println("se muestran las cartas que se repartieron ");
         baraja.cartasMonton();
         System.out.println("*********************************");
        System.out.println("*********************************");
         System.out.println("se muestran las cartas que quedaron en el mazo ");
         baraja.mostrarBaraja();
    }
    
    
}
