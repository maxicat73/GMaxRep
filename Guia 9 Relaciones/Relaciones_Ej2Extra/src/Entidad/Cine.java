//Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
////(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
////sala con los espectadores y el precio de la entrada.
package Entidad;


public class Cine {
    
    private Asiento [][] Sala=new Asiento[8][6];
    private Pelicula pelicula;
    private double precio;

    public Cine() {
    }

    public Cine(Asiento[][] Sala, Pelicula pelicula, Double precio) {
        this.Sala = Sala;
        this.pelicula = pelicula;
        this.precio=precio;
    }   

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return Sala;
    }

    public void setSala(Asiento[][] Sala) {
        this.Sala = Sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Cine{" + "Sala=" + Sala + ", pelicula=" + pelicula + ", precio=" + precio + '}';
    }

    
    
    
    
}



