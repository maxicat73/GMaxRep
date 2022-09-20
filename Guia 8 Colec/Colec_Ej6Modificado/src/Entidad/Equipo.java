
package Entidad;

import java.util.Date;


public class Equipo {
    
    private String nombre;
    private String apellido;
    private String apodo;
    private String posicion;
    private Double altura;
    private Integer camiseta;
 

    public Equipo() {
    }

    public Equipo(String nombre, String apellido, String apodo, String posicion, Double altura, Integer camiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.posicion = posicion;
        this.altura = altura;
        this.camiseta = camiseta;
    }
    
    

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(Integer camiseta) {
        this.camiseta = camiseta;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", apellido=" + apellido + ", apodo=" + apodo + ", posicion=" + posicion + ", altura=" + altura + ", camiseta=" + camiseta + '}';
    }

    


    
    
    
}
