/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_ej3;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Excepciones_Ej3 {

    
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        
        
        try{
        System.out.println("a continuacion ingrese dos numeros");
       
        
        System.out.println("ingrese el numero 1");
        String a=leer.next();
        String b=leer.next();
        
        Division d=new Division();
       d.setNum1(Integer.parseInt(a));
       d.setNum2(Integer.parseInt(b));
       
       System.out.println("el resultado es" +Division.Dividir(d.getNum1(),d.getNum2()) );
    }
        catch(NumberFormatException n){
            System.out.println("Error, debe ingresar el numero en formato correcto ");
        }
        catch(ArithmeticException a){
            System.out.println("No se puede dividir por cero");
        }
        catch(RuntimeException r){
            
            System.out.println("error al compilar el codigo");
        }
        
        
        
    
}
    
}
