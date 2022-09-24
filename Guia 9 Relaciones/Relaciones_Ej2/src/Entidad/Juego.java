//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//
//10
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.

//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;


public class Juego {
    
   private ArrayList<Jugador> jugadores;
   private Revolver revolver; 

    public Juego() {
    }
    
    

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores=new ArrayList();
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

  
   

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
   
   
    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    
    Jugador j1=new Jugador();
    
    
    
   public void llenarJuego(ArrayList<Jugador>jugadores2, Revolver r){
    
      this.revolver=r;
      this.jugadores=jugadores2;
       
   }
    
   public void ronda() {
        boolean mojado = false;
        do {
            for (Jugador aux : this.jugadores) {
                if (aux.disparo(revolver)) {
                    System.out.println("El jugador mojado fue el " + aux.getNombre()+" "+aux.getId()+" Fin del juego");
                    mojado = true;
                    break;
                }
            }
        } while (!mojado);
    }

    
    
}
