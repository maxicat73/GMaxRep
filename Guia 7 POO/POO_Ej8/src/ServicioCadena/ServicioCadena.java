
package ServicioCadena;

import entidad.Cadena;
import java.util.Scanner;


public class ServicioCadena {
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    Cadena c1=new Cadena();
    
    public int mostrarVocales(Cadena c1){
        
        int contador=0;
        String letra="";
        
        for (int i = 0; i < c1.getLongitud() ; i++) {
            
            letra=c1.getFrase().substring(i,i+1);
            if(letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")){
                contador++;
            }
            
        }
     
      return contador;      
        
        
        
    }
    
}
