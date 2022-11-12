package booking;

public class Camping extends Extra_hotelero {

    public Camping(int max_carpas, int baños, boolean restaurante, boolean privado, double metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.max_carpas = max_carpas;
        this.baños = baños;
        this.restaurante = restaurante;
    }

    public Camping() {
    }
    
    

    protected int max_carpas;
    protected int baños;
    protected boolean restaurante;

}
