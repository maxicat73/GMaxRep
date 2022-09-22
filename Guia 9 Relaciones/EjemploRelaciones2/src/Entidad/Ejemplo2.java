
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejemplo2 {

   
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        Jugador j1=new Jugador("Julio","Romero",EnumPosicion.Arquero,1);
        Jugador j2=new Jugador("Damian","Canteros",EnumPosicion.Mediocampo,5);
        Jugador j3=new Jugador("Luis","Betancur",EnumPosicion.Enganche,8);
        Jugador j4=new Jugador("Sebastian","Girolmini",EnumPosicion.Defensor,2);
        
        ArrayList<Jugador> aux=new ArrayList();
        aux.add(j1);
        aux.add(j2);
        aux.add(j3);
        aux.add(j4);
        
        Equipo e1=new Equipo();
        e1.setJugadores(aux);
//        
//        for (Jugador lista : e1.getJugadores()) {
//            System.out.println(lista.toString());
//        }
        
        
         System.out.println(e1.getJugadores().toString());
        
     
        
    }
    
}
