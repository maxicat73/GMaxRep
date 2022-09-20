

package package_principal_ex_3;

import Package_Entidad.Raices;


public class Principal_ex_3 {

 
    
    public static void main(String[] args) {
       
        // instanciar un objeto de tipo Raices
        
        Raices r1 = new Raices();
        
        r1.cargarValores();
        System.out.println("Valor del Discriminante-> " + r1.getDiscriminante());
        System.out.println("");
        System.out.println("Tiene Dos Soluciones?-> " + r1.tieneraices());
        System.out.println("");
        System.out.println("Tiene una unica Solución?-> " + r1.tieneRaiz());
        System.out.println("");
        //r1.obtenerRaices();
        //System.out.println("");
        //r1.ObtenerRaiz();
        System.out.println("");
        r1.Calcular();
        
    }
    
}
