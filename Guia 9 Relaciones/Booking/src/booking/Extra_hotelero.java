package booking;

public class Extra_hotelero extends Alojamiento {

    protected boolean privado;
    protected double metros;

    public Extra_hotelero(boolean privado, double metros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    public Extra_hotelero() {
    }

    @Override
    public String toString() {
        return super.toString() + "Extra_hotelero{" + "privado=" + privado + ", metros=" + metros + '}';
    }
    
    

}
