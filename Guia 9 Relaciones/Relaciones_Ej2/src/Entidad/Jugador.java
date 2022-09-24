//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//debe ser ent
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.re 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:

package Entidad;

import java.util.ArrayList;
import java.util.Scanner;


public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    

    public Jugador(int id, String nombre, boolean mojado) {
        
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
   
    
    public boolean disparo(Revolver r){
        
       
        if(r.mojar()){
            this.mojado=true;
            System.out.println("El jugador "+this.id+" Se ha disparado");
            return true;
            
        }else{
            this.mojado=false;
        do{
            System.out.println("El jugador"+" "+this.id
                    + " no se disparo para continuar el juego ingrese un caracter para el siguiente disparo: ");
            Scanner leer=new Scanner(System.in);
            String siguiente=leer.next();
            
            if(!siguiente.equalsIgnoreCase("")){
            
            r.siguienteChorro();
            
            }
       return false;
    }while(!this.mojado);
        
        }
    }
    
    public ArrayList<Jugador> crearJugador(){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de jugadores(1 a 6): ");
        int jugadores=leer.nextInt();
        
        if(jugadores>6 || jugadores<=0){
            jugadores=6;
        }
        
        ArrayList<Jugador> jugadores1=new ArrayList();
        
        for (int i = 1; i <= jugadores; i++) {
            jugadores1.add(new Jugador(i,"Jugador"));
        }
        
        return jugadores1;
        
    }
    
    

}