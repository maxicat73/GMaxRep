
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
////programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
////después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
////salir, se mostrará todos los perros guardados en el ArrayList.

//
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
package coleccionesej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionesEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> raza = new ArrayList();
        String v = "";

        do {
            System.out.println("Ingrese una raza de perro:");
            String leerraza = leer.next();
            raza.add(leerraza);
            System.out.println("¿desea agregar otra raza? \n -- ingrese S(SI) o N(no)");
            v = leer.next();

        } while (v.equalsIgnoreCase("s") && raza.size() >= 1);

        if (v.equalsIgnoreCase("n")) {

            for (String aux : raza) {
                System.out.println(aux);
            }

        } else {
            System.out.println("Ingreso una letra erronea");

        }

        System.out.println("Ingrese el perro a buscar");

        String searchPerro = leer.next();

        Iterator<String> it = raza.iterator();
        boolean b=false;
        while (it.hasNext()) {

            if (searchPerro.equals(it.next())) {
                it.remove();
                b=true;
                System.out.println("Se elimino el perro "+searchPerro);
            }
            

        }
        
        if(!b){
            System.out.println("No se encontro el perro");
           
        }
        Collections.sort(raza);
        
        for (String aux : raza) {
            System.out.println(aux);
        }
        
        
    }
}
