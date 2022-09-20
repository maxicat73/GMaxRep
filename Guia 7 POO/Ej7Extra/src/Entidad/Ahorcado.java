/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Maxi
 */
public class Ahorcado {
    
    private String [] palabra;
    private int cantLetras; 
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetras, int cantJugadas) {
        this.palabra = palabra;
        this.cantLetras = cantLetras;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
    
    
    
    
    
}
