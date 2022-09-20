
//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos elsiguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main. 

package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class ServiceAlumno {
    
    Scanner leer = new Scanner(System.in);
   
        ArrayList<Alumno> alu = new ArrayList();

       public void crearAlumno(){
            boolean v=false;
             
        do{
         
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese su nota 1: ");
        int nota1 = leer.nextInt();
        System.out.println("Ingrese su nota 2: ");
        int nota2 = leer.nextInt();
        System.out.println("Ingrese su nota 3: ");
        int nota3 = leer.nextInt();
        ArrayList<Integer> notas2=new ArrayList();
        notas2.add(nota1);
         notas2.add(nota2);
          notas2.add(nota3);

        alu.add(new Alumno(nombre,notas2));
        System.out.println("¿Desea ingresar a otro alumno? S o N");
        String resp=leer.next();
        if(resp.equalsIgnoreCase("s")){
        v=true;
        }else{
            v=false;
        }
            
    }  while(v);
      
    }
       
     public void mostrarLista(){
         
         for (Alumno aux : alu) {
             System.out.println(aux.toString());
         }
         
     }
       
  
    public void notaFinal() {
        String nombreAlu;
        System.out.println("ingrese el alumno a buscar:");
        nombreAlu = leer.next();

        for (Alumno alumno : alu) {

            if (alumno.getNombre().equalsIgnoreCase(nombreAlu)) {

                System.out.println("el promedio de " + nombreAlu +" "+ alumno.notaFinal());

            }

        }

    }


}
        



