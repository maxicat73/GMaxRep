//
//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.

package relaciones_ej1extra;

import java.util.Objects;





public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Perro perro;
    
    
    
    public Persona() {
        
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

     public Persona(String nombre, String apellido, Integer edad, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.perro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.perro, other.perro)) {
            return false;
        }
        return true;
    }

  


    
    
   
}
