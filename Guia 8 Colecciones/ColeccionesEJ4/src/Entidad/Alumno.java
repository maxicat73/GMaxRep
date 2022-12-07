


package Entidad;

import java.util.ArrayList;


public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> notas=new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
   
//    public ArrayList<Integer> almacenarNotas(int nota1, int nota2, int nota3){
//        
//        notas.add(nota1);
//        notas.add(nota2);
//        notas.add(nota3);
//        
//        return notas;
//    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    public double notaFinal(){
        double promedio=0;
        for (Integer var : notas) {
            promedio+=var;
            
        }
        return promedio/3;
    }
    
}
