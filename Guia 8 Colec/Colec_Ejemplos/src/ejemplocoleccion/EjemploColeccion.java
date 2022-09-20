
package ejemplocoleccion;

import Entidad.Auto;
import ServicioAuto.ServicioAuto;

public class EjemploColeccion {

    
    public static void main(String[] args) {
     
        
        ServicioAuto servAuto=new ServicioAuto();
        
    //    Auto a1=new Auto("hig","vw","negro",2001);
      ///  Auto a2=new Auto("lkq","bmw","azul",2020);
      //  Auto a3=new Auto("mhc","ford","blanco",2013);
        
      Auto a1=servAuto.crearAuto();
       Auto a2=servAuto.crearAuto();
        Auto a3=servAuto.crearAuto();
        
         servAuto.almacenarAuto(a1);
          servAuto.almacenarAuto(a2);
           servAuto.almacenarAuto(a3);
           
        servAuto.mostrarAutos();
        
        
        
        servAuto.eliminarAuto(0);
        
        servAuto.mostrarAutos();
    }
    
}
