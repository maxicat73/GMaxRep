/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2.herencia;

/**
 *
 * @author EL_SEMENTAL
 */
public abstract class Edificio {
    
    // atributos
    private double ancho;
    private double largo;
    private double alto;

    public Edificio() {
    }

    
    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }
    
    // GET AND SET

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAlto() {
        return alto;
    }
    
    // toString

//    @Override
//    public String toString() {
//        return " ** Edificio **\n"
//                + "Ancho-> " + ancho + "\n"
//                + "Largo-> " + largo + "\n"
//                + "Alto-> " + alto + "\n";
//    }
    
    
    // METODOS
    
    public abstract double calcularSuper();
    
    public abstract double calculaVolumen();
}
