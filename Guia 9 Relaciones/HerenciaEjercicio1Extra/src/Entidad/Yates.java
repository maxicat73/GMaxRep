/*
  En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public final class Yates extends Barco {
  private int cantCamarotes;
  private double potenciaCV;
    Scanner leer = new Scanner(System.in);
    public Yates() {
    }

    public Yates(int cantCamarotes, double potenciaCV, String matricula, int esloraMetros, int añoFabricaion) {
        super(matricula, esloraMetros, añoFabricaion);
        this.cantCamarotes = cantCamarotes;
        this.potenciaCV = potenciaCV;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public int getAñoFabricaion() {
        return añoFabricaion;
    }

    public void setAñoFabricaion(int añoFabricaion) {
        this.añoFabricaion = añoFabricaion;
    }

    @Override
    public double calcularAlquiler(){
        return 10*esloraMetros+cantCamarotes+potenciaCV;
    }
    
    
  @Override
    public void  llenarAtributosPropios(){
    System.out.println("ingrese la cantidad de camarotes");
    cantCamarotes=leer.nextInt();
    System.out.println("ingrese la potencia CV");
    potenciaCV=leer.nextDouble();
}
    
  
    
   
    
}
