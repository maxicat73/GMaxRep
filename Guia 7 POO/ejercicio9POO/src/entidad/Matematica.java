/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Maxi
 */
public class Matematica {
    public double n1;
    public double n2;
    

public Matematica(){
}

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double devolverMayor(Matematica m1){
       
 
       double m=Math.max(m1.getN2(),m1.getN1());
       
        return m;
          }
    
    public double calcularPotencia(){
      
        double num1=Math.round(n1);
        double num2=Math.round(n2);
        double m=Math.max(num1,num2);
        
        return m;
    }
    
    
}

