

package Package_Entidad;

import java.util.Scanner;


public class Raices {   

    Scanner leer = new Scanner(System.in);
    
    // ATRIBUTOS
    
    public int a;
    public int b;
    public int c;

    
    // Constuctor vacio
    public Raices() {
    }

    // Constuctor parametrizado
    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //////////////////////////////////////////////////
    // Metodo de Calculo
    /////////////////////////////////////////////////
    
    // cargar valores
    public void cargarValores (){
      
        System.out.println("ingrese los valores: a,b,c "); 
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        
       // • Método getDiscriminante(): devuelve el valor del discriminante (double). El
       //discriminante tiene la siguiente formula: (b^2)-4*a*c

    }
    
    // Discriminante
    public double getDiscriminante(){
        
        return (Math.pow(b, 2))-4*a*c;
        
    }    
 
  // Método tieneRaices
    public boolean tieneraices(){
        
        return getDiscriminante() > 0;
        
    }
    
    // Metodo tiene Raiz
     public boolean tieneRaiz(){
        
        return getDiscriminante() == 0;
        
    }
     
     // Obetener Raices
     public void obtenerRaices(){
         
         if ( tieneraices() ) {
             
             System.out.println("solución_1 -> " + ( -b+Math.sqrt(getDiscriminante() ) )/(2*a) );
             System.out.println("");
             System.out.println("solución_2 -> " + ( -b-Math.sqrt(getDiscriminante() ) )/(2*a) );
             
         }else {
             System.out.println("No tiene dos Soluciones");
         }
         
     }
     
     // Obtener Raiz
     public void ObtenerRaiz(){
         
         if (tieneRaiz()) {
             
              System.out.println("solución unica -> " + ( -b+Math.sqrt(getDiscriminante() ) )/(2*a) );
             
         }
         
     }
     
     // Calcular
     public void Calcular() {
        
         if (tieneRaiz()) {
             
             ObtenerRaiz();
             
         }else if (tieneraices()) {
             
             obtenerRaices();
             
         }else {
             System.out.println("No Existe Solución");
         }
         
         
     }
    
    
}
