/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidad;

import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author Maxi
 */
public class Cadena {
    
    private String frase;
    private int longitud;
    
    public Cadena(){
}
    
    public Cadena(String frase, int longitud){
    this.frase=frase;
    this.longitud=longitud;
    }
    
    
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public int mostrarVocales(Cadena c1){
        int vocales=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            if(c1.getFrase().substring(i,i+1).equalsIgnoreCase("a")  || c1.getFrase().substring(i,i+1).equalsIgnoreCase("e") || c1.getFrase().substring(i,i+1).equalsIgnoreCase("i")  || c1.getFrase().substring(i,i+1).equalsIgnoreCase("o") || c1.getFrase().substring(i,i+1).equalsIgnoreCase("u"))
            {
                vocales++;
            }
            
        }
        return vocales;
        
        
    }
    
    public String invertirFrase(Cadena c1){
        
        String fraseinvertida="";
        
        for (int i = (c1.getLongitud()-1); i >= 0; i--) {
            
            fraseinvertida+=c1.getFrase().charAt(i);
            
        }
        
        return fraseinvertida;
    }
    
    /*public String invertirfrase2(Cadena c1){
       
        StringBuilder f1 = new StringBuilder(c1.getFrase());
        String frase2 = f1.reverse().toString();

            return frase2;

    }
    */
    public int vecesRepetido(String letra){
        
        int repetido=0;
        for (int i = 0; i < longitud; i++) {
            
          if(frase.charAt(i)==letra.charAt(0)){
            repetido++;
         
        }
        
        
    }
        return repetido;
    }
    
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    
    public void compararLongitud(String frase2){
        
        if(longitud>frase2.length()){
            System.out.println("la primer cadena es mayor a la segunda");
        }
        else if(longitud==frase2.length()){
            System.out.println("ambas frases tienen la misma longitud");
        }
        
        else{
            System.out.println("la longitud de la segunda frase es mayor");
        }
        
    }
    
    public void unirFrases(String frase3){
        
        String frase4;
        frase4=frase.concat(frase3);
        
        System.out.println("la frase final es " + frase4);
        
    }
    
    public void reemplazar(String letra){
        
        String frase2="";
        for (int i = 0; i < longitud ; i++) {
             if (frase.substring(i,i+1).equalsIgnoreCase("a")){
                frase2= frase.replace("a",letra);
      }
             
        }
     System.out.println("la frase con reemplazo queda de la siguiente manera: "+ frase2);
        
    }
    
    
   public boolean contiene(String letra){
      boolean v1=false;
       for (int i = 0; i < longitud; i++) {
           if(frase.charAt(i)==letra.charAt(0)){
          v1=true; 
          
       }
           
       } 
       return v1;
}
}

