/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_23 {

    public static void main(String[] args) {
        
        
        String palabra;
        String [] [] Matriz;
        Matriz = new String [20] [20];
   
        Scanner Leer = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("ingrese una palabra de mínimo 3 y hasta 5 caracteres");
            palabra = Leer.next();
            int largo = palabra.length();
            
            if (VerificarPalabra(largo)==false) {
                System.out.println("ingrese una palabra valida");
                i-=1;
            }else{
                GuardarPalabras(palabra,Matriz,largo);
            }
        }
        RellenarMatriz(Matriz);
        MostrarMatriz(Matriz);
    }
    
    public static boolean VerificarPalabra(int largo){
        boolean validez;
        if (largo<=5 && largo>=3) {
            validez=true;         
        }else {
            validez=false;
        }
        return validez;  
    } 
    
    public static void GuardarPalabras(String palabra, String Matriz[][],int largo){
            
        int j; 
        int k; 
        boolean cargado=false;
        do {
            j = (int)(Math.random()*20);
            k = (int)(Math.random()*(20-largo));
            int aux=0;
 
            for (int i = 0; i < largo; i++) { //comprueba que haya espacio suficiente para guardar la palabra
                
                if(Matriz[j][(k+i)]==null){
                    aux+=1;
                }else{
                    break;
                }
            }
            if (aux==largo) { //si hay espacio, guarda la palabra
            
                for (int i = 0; i < largo; i++) {
                    Matriz[j][k+i] = palabra.substring(i,(i+1));
                    cargado=true;
                }
            } 
        } while (!cargado);
    }
    
    public static void RellenarMatriz(String Matriz[][]){
        
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                if (Matriz[i][j]==null) {
                    
                    Matriz[i][j]=""+(int)(Math.random()*9);
                } 
            }
        }
    }
    
    public static void MostrarMatriz(String Matriz[][]){
        
        for (int i = 0; i < 20; i++) {
            System.out.println();
            for (int j = 0; j < 20; j++) {  
                System.out.print("["+Matriz[i][j]+"]");
            }
        }
    }
}

