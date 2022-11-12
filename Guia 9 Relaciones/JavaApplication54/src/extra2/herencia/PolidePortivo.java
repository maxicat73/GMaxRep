 
package extra2.herencia;

 
public class PolidePortivo extends Edificio{
    //Atributos
    private String nombre;
    private boolean instalacion; // si es techado o abierto

    
    int cont = 0;
    int cont2 = 0;
        
    public PolidePortivo(String nombre, boolean instalacion, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.instalacion = instalacion;        
        
        if (instalacion == true) {
            cont++;
        } else {
            cont2++;
        }
    }

    
 

    @Override
    public double calcularSuper() {
        return this.getAncho()*this.getLargo();
    }

    @Override
    public double calculaVolumen() {
        return this.getAlto()*this.getAncho()*this.getLargo();
    }

    @Override
    public String toString() {
        return "**PolidePortivo ** \n"
                + "Nombre-> " + nombre + "\n"
                + "Techado-> " + instalacion + "\n";

    }
    
    
    
}
