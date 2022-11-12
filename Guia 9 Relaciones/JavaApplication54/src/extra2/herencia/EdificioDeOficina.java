 
package extra2.herencia;

 
public class EdificioDeOficina extends Edificio{
    // atributos
    private int oficinas;
    private int pisos;
    private int personasPorOficina;

    public EdificioDeOficina(int oficinas, int pisos, int personasPorOficina, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.oficinas = oficinas;
        this.pisos = pisos;
        this.personasPorOficina = personasPorOficina;
    }

    

   
    
    
    
    
    
    
    // metodos
    /**
     * desde el main se va a pedir al usuario que llene los campos
     * y estos llegaran por parametro a esta funcion el cual hara los 
     * calculos y devolvera 
     * 
     * 1-la cantidad de personas que hay por piso 
     * 2- la cantidad total de personas en el edificio
     * 
//     * @param cantpersona
//     * @param cantpisos
//     * @param cantOficinas
//     * @return 
//
     * @return  */
//    public int cantidadPersona( int cantpersona, int cantpisos, int cantOficinas){
//        this.personasPorOficina = cantpersona;
//        this.pisos = cantpisos;
//        this.oficinas = cantOficinas;
//        
//        if (this.oficinas == this.pisos) {
//            return this.personasPorOficina * this.pisos;            
//        }        
//        return this.personasPorOficina * this.oficinas * this.pisos;
//    }
    
      public int cantidadPersona( ){
          
        if (this.oficinas == this.pisos) {
            return this.personasPorOficina * this.pisos;            
        }        
        return this.personasPorOficina * this.oficinas * this.pisos;
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
        return " ** EdificioDeOficina** \n" 
                + "Oficinas-> " + oficinas + "\n"
                + "Pisos-> " + pisos + "\n"
                + "Personas Por Oficina-> " + personasPorOficina + "\n";
    }
    
    
}
