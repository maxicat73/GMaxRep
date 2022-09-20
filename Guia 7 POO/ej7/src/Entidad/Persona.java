/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 * @author Maxi
 */
public class Persona {
    
    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public double altura;
    public int dni;
    
    
  public Persona(){
    
}                 

    public Persona(String nombre, int edad, String sexo, double peso, double altura, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("O") && !sexo.equalsIgnoreCase("M"))
        {

            if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) {

                this.sexo = sexo;

            } else {
                System.out.println("La letra ingresada no es correcta: ingrese H , O , M");
                 
            }
        sexo = leer.nextLine();
        }
           
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
    
