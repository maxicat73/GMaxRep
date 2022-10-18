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

import java.util.Date;
import java.util.Scanner;


public class Main {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
iniciar();
    }

    public static void menu(){
    
        System.out.println("seleccione el barco");
        System.out.println("1-velero");
        System.out.println("2-yate");
        System.out.println("3-barco a motor");
        System.out.println("4-salir");

    }

    public static void iniciar() {

        boolean bandera = true;
        do {
            menu();
            int opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    llenarDatosClientes( new Velero(2, "pepe", opcion, opcion));
                    break;
                case 2:
                    llenarDatosClientes(new Yates());
                    break;
                case 3:
                    llenarDatosClientes(new barcoMotor());
                    break;
                case 4:
                    bandera=false;
                    break;
                default : System.out.println("ingrese un numero correcto "); 
                    break;
            }

        } while (bandera);
        
        
    }
    public static void llenarDatosClientes(Barco b) {
        Alquiler a1 = new Alquiler();
        System.out.println("ingresar nombre");
        a1.setNombre( leer.next()); 
        System.out.println("ingrese dni");
        a1.setDocCliente(leer.nextInt()); 
        a1.setFechaAlquiler(new Date(122, 10, 14)); 
        a1.setFechaDevolucion(new Date(122, 10, 24)); 
        a1.setPosAmarre(5); 
        System.out.println("ingrese la matricula");
        b.matricula = leer.next();
        System.out.println("ingrese el eslora");
        b.esloraMetros = leer.nextInt();
        System.out.println("ingrese el año de fabricacion");
        b.añoFabricaion = leer.nextInt();
        b.llenarAtributosPropios();
        a1.setBarco(b);
        mostrarAlquiler(a1);
    }
    public static void mostrarAlquiler(Alquiler alquiler){
        
        System.out.println("alquiler realizado con exito");
        System.out.println("el precio del alquiler es : "+alquiler.CalcularAlquiler());
        
    }
//falta crear objeto clases hijas
//    private static Barco retornarVelero() {
//        
//        llenarAtributosPropios();
//    }
    
}