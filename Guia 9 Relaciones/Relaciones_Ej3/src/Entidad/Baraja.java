
//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.
//Las operaciones que podrá realizar la baraja son:
//• barajar(): cambia de posición todas las cartas aleatoriamente.
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.

package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja {

    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> descarte=new ArrayList();
    
    
    public Baraja() {
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    Scanner leer = new Scanner(System.in);
    
    public void crearCartas() {

        for (Enum auxnum : Numeros.values()) {
            for (Enum auxpalo : Palo.values()) {
                this.mazo.add(new Carta(auxnum, auxpalo));
            }
        }

    }

    public void barajar() {
        Collections.shuffle(mazo);

    }

  

    public Carta siguienteCarta() {
        
        Iterator<Carta> it = mazo.iterator();
        
        Carta aux = new Carta();
        
        while (it.hasNext()) {
            Carta next = it.next();
            aux = next;
        }

        if (mazo.isEmpty()) {
            System.out.println("No Hay mas cartas");
        } else {
            mazo.remove(aux);
            descarte.add(aux);
        }
        
        return aux;    
    }

    public void cartasDisponibles() {
        System.out.println("las cartas disponibles para repartir son: " + mazo.size());
    }
    
    public void darCartas(){
            
        int cantidad;
        System.out.println("Cuantas cartas desea ??");
        cantidad=leer.nextInt();
        if(mazo.size()>=cantidad){
            for (int i = 0; i < cantidad; i++) {
                  siguienteCarta();
            }
        }
        else{
            System.out.println("no hay suficientes cartas para repartir");
        }      
    }
    public void  cartasMonton(){
        
        boolean finMazo=descarte.isEmpty();
        if(finMazo){
            System.out.println("no hay cartas repartidas");
        }else{
            for (Carta aux : descarte) {
                System.out.println(aux);
            }
        }
        
    }
    
    public void mostrarBaraja(){
        
        for (Carta aux : mazo) {
            System.out.println(aux);
        }
        
    }
    
    

}
    

