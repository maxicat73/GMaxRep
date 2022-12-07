//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.


package excepciones_ej3;


public class Division {
    
    private int num1;
    private int num2;

    public Division() {
        
        
    }
    
       public Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
    public static double Dividir(int a, int b){
        
        double resultado=a/b;
        
       
        return resultado;
    }
 
    
    
    
}
