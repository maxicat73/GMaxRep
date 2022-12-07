/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej4;

/**
 *
 * @author Maxi
 */
public class Rectangulo implements CalculosFormas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        double perimetro=(base+altura)*2;
        System.out.println("el perimetro del Rectangulo es : "+ perimetro);
       
    }

    @Override
    public void calcularArea() {
      double area=base*altura;
        System.out.println("el area del Rectangulo es :"+area);
    }



    
    
}
