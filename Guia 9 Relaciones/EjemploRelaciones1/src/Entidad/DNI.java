
package Entidad;


class DNI {
    private String serie;
    private int numero;

    public DNI() {
    }
    
    

    public DNI(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
   
    
}
