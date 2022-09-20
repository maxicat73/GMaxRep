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
public class Auto {
    
    private String patente;
    private String marca;
    private String color;
    private int modelo;
    

    public Auto() {
    }

    public Auto(String patente, String marca, String color, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        
    }
    
    
    
    
    

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + '}';
    }
    
    
    
}
