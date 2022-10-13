
package Servicios;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Set;


public class ServiceCine {
    
    
    ArrayList<Espectador> espectadores=new ArrayList();
    
   public void crearEspectadorRandom(int minimo, int maximo) {
        String nombre = "Espectador " + aleatorio(1, minimo * maximo);
        espectadores.add(new Espectador(nombre, aleatorio(1, 100), aleatorio(0, 5000)));

    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public void crearEspectador(){
        
        for (int i = 0; i < aleatorio(1,48); i++) {
            crearEspectadorRandom(1,48);
            
        }
        
        for (Espectador aux : espectadores) {
            System.out.println(aux.toString());
        }
        
    }
    
    Cine c1=new Cine();
    
    public void crearSala(){
        
        c1.setPelicula(Pelicula.PINOCHO);
        c1.setPrecio(850);
        String letras = "ABCDEF";
     
       
        for (int i = 7; i>=0 ; i--) {
            for (int j = 0; j <=5; j++) {
                
                Asiento a1=new Asiento(i,letras.substring(j,j+1));
                c1.setSala()[i][j];
            }               
        }
        
        
        
//        c1.setSala(aux);

//        for (int i = 7; i >=0 ; i--) {
//            for (int j = 0; j <= 5; j++) {
//                 
//               System.out.print(c1.getSala()[i][j]+" ");
//                }
//              System.out.println("");
//        }
//        
    }
    
    public void llenarSala(){
        
        for (Espectador aux : espectadores) {
            if(aux.getEdad()>=c1.getPelicula().getEdad_minima() && aux.getDinero()>= c1.getPrecio()){
                
                String[][] asiento=new String[8][6];
                int i=aleatorio(0,7);
                int j=aleatorio(0,5);
                asiento[i][j]=c1.getSala()[i][j]+"X";
                if(!asiento[i][j].equals(c1.getSala()[i][j])){ 
                   
                 
                    
                    
                    
                  }
            }
        }
        
        
    }
    
    
    
    
    
    
    
}

