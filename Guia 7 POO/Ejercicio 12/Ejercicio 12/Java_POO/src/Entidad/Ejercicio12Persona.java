
package Entidad;

import java.util.Date;
import java.util.Scanner;

/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior. 
 */
public class Ejercicio12Persona {

    Date fechaActual = new Date();
    Scanner leer = new Scanner(System.in);
    public String nombre;
    public Date fechaN;

    //Constructor vacio
    public Ejercicio12Persona() {
    }

    //Constructor parametrizado
    public Ejercicio12Persona(String nombre, Date fechaN) {
        this.nombre = nombre;
        this.fechaN = fechaN;
    }

    // getter & setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    //Metodo crear persona
    public void crearPersona() {
        System.out.println("Ingrese su nombre");
        this.nombre = leer.next();

        System.out.println("Ingrese dia");

        int dia = leer.nextInt();
        System.out.println("Ingrese mes");

        int mes = leer.nextInt();
        System.out.println("Ingrese año");

        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        this.fechaN = fecha;

    }

    //Metodo calcular edad
    public int calcularEdad() {

        System.out.println("Su edad es: " + (fechaActual.getYear() - fechaN.getYear()));
        return fechaActual.getYear() - fechaN.getYear();
    }

    //Metodo Menorq
    public boolean menorQue(int edad) {
        boolean menor = false;
        if (calcularEdad() > edad) {
            menor = true;
        }
        return menor;
    }

    public void mostrarPersona() {
        System.out.println("El nombre es: " + nombre + "La fecha es: " + fechaN);

    }

    @Override
    public String toString() {
        return "Ejercicio12Persona{" + "nombre=" + nombre + ", fechaN=" + fechaN + '}';
    }

}
    