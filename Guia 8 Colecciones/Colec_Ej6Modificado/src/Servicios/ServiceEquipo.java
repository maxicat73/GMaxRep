package Servicios;

import Entidad.Equipo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ServiceEquipo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, Equipo> team = new HashMap<>();
    ArrayList<Equipo> equipo1=new ArrayList<>();
    
    
    public void cargarJugadores() {
        String v = "n";
        Integer numerojugador = 0;
       
//            System.out.println("----a continuacion se ingresaran los datos del jugador");
//            System.out.println("----");
//            System.out.println("Ingrese el nombre:");
//            String nombre = leer.next();
//            System.out.println("ingrese el apellido:");
//            String apellido = leer.next();
//            System.out.println("ingrese el apodo:");
//            String apodo = leer.next();
//            System.out.println("ingrese la posicion en el campo de juego:");
//            String posicion = leer.next();
//            System.out.println("ingrese la altura del jugador:");
//            Double altura = leer.nextDouble();
//            System.out.println("ingrese el numero de camiseta:");
//            int numerocamiseta = leer.nextInt();
//            System.out.println("ingrese la fecha de nacimiento:");
//            System.out.println("ingrese dia de nacimiento:");
//            int dia = leer.nextInt();
//            System.out.println("ingrese mes de nacimiento");
//            int mes = leer.nextInt();
//            System.out.println("ingrese el año de nacimiento:");
//            int nacimiento = leer.nextInt();
//            System.out.println("ingrese el puntaje de juego:");
//            Double puntaje = leer.nextDouble();

           // Date fechanac = new Date(nacimiento-1900, mes-1, dia);
          //String nombre, String apellido, String apodo, String posicion, Double altura, Integer camiseta
        
          
          Equipo E1 = new Equipo("Pablo", "Gimenez", "Pablito", "Delantero", 1.70, 5);
       
        Equipo E2 = new Equipo("Julio", "Romero", "Ciudade", "Zaguero Derecho", 1.80, 9);
        

        Equipo E3 = new Equipo("Diego", "De Haro", "Dieguito", "Enganche", 1.75, 8);
        
        Equipo E4 = new Equipo("Sebastian", "Girolmini", "El Sebita", "Defensor", 1.85, 3);
        
        Equipo E5 = new Equipo("Damian", "Canteros", "el pibe", "mediocampo", 1.75, 5);
      
        Equipo E6 = new Equipo("Roberto", "Santopietro", "El rober", "Arquero", 1.80, 7);
       
        Equipo E7 = new Equipo("Leandro", "Cueito", "Lea", "Delantero", 1.81, 10);
        
        Equipo E8 = new Equipo("Daniel", "Maidana", "CafeCafe", "Defensor Central", 1.75, 2);
       
        Equipo E9 = new Equipo("German", "Elaskar", "ElRapi", "Arquero", 1.76, 1);
        
        Equipo E10 = new Equipo("Johana", "Carrizo", "Ingeniera", "Delantera", 1.68, 13);
        
        Equipo E11 = new Equipo("Raul", "Acosta", "El Ruli", "9 de area", 1.70, 9);
        
        equipo1.add(E1);
        equipo1.add(E2);
        equipo1.add(E3);
        equipo1.add(E4);
        equipo1.add(E5);
        equipo1.add(E6);
        equipo1.add(E7);
        equipo1.add(E8);
        equipo1.add(E9);
        equipo1.add(E10);
        equipo1.add(E11);
       
        for (int i = 0; i < equipo1.size(); i++) {
               
            team.put(numerojugador,)
            
        }
            
        }
        
        
   
    }
    
    public void MostrarEquipo(){
        System.out.println("Los jugadores del equipo :");
        for (Map.Entry<Integer, Equipo> entry : team.entrySet()) {
            Integer key = entry.getKey();
            Equipo value = entry.getValue();
            
            System.out.println("jugador "+key +" "+ value);
        }
        
    }
    
    
//    public void compararPorPuntaje(){
//        
//        ArrayList<Equipo> a1=new ArrayList<>();
//        Set<Integer> s1=team.keySet();
//        for (Integer aux : s1) {
//            a1.add(team.get(aux));
//        }
//        Collections.sort(a1, comp);
//        
//        System.out.println("el orden por puntaje es el siguiente: ");
//        System.out.println(a1.toString());
//    }

//   public static Comparator<Equipo> comp=new Comparator<Equipo>() {
//        @Override
//        public int compare(Equipo t, Equipo t1) {
////        Double dif=t.getPuntaje()-t1.getPuntaje();
//       
//         return t.getPuntaje().compareTo(t1.getPuntaje());
//        }
//       
//   };
//   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    
}
