
package Entidad;

/**
 *
 * @author Maxi
 */
public class Persona {
    
   private String nombre;
   private String Apellido;
   private DNI dni;

    public Persona() {
    }
   
   

    public Persona(String nombre, String Apellido, DNI dni) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni + '}';
    }
    
    
    
}
