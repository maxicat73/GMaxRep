/*
 *c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */


package ServicioCircunferencia;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class ServicioC {
    
    public Circunferencia crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio de la cicunferencia");
        Circunferencia c1=new Circunferencia(leer.nextDouble());
      
        return c1;
        
    }
    
    public void area(Circunferencia c1){
        
        double area=(Math.PI)*(c1.getRadio()*c1.getRadio());
        
        System.out.println("El area de la circunferencia es "+ area);
        
    }
    
    public void perimetro(Circunferencia c1){
        
        double perimetro=2*(Math.PI)*c1.getRadio();
        
        System.out.println("El perimetro de la circunferencia es "+perimetro);
    }
    
    
    
}
