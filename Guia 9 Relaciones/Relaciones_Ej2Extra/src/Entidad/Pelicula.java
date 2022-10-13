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
public enum Pelicula {
    
    AVENGERS("Avengers", 3.0, "D1", 13),
    TITANIC("Titanic", 3.0, "D2", 13),
    SHREK("Shrek", 1.5, "D3", 1),
    TERMINATOR("Terminator", 2.0, "D4", 18),
    PINOCHO("Pinocho", 1.0, "D5", 1),
    LASIRENITA("La Sirenita", 2.0, "D6", 1),
    BUZZLIGHTYEAR("Buzz Lightyear", 2.0, "D7", 1),
    XMEN("X-men", 2.5, "D8", 18);

    private Pelicula(String titulo, Double duracion, String director, int edad_minima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edad_minima = edad_minima;
    }

    private Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    
    
    
    private String titulo;
    private Double duracion;
    private String director;
    private int edad_minima;

    
    
}
