
package Libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Boolean alta;

    public Autor() {
    }

 public Autor(String nombre, Boolean alta) {
        setNombre(nombre);
        setAlta(alta);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
       if(id!=null){
        this.id = id;
    }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       if(nombre!=null){
        this.nombre = nombre;
    }
    }
    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        if(alta!=null){
        this.alta = alta;
    }
    }
    
    
    
}
