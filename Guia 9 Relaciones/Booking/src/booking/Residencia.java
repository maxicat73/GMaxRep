package booking;

public class Residencia extends Extra_hotelero {

    public Residencia(int cant_hab, boolean descuento_gremio, boolean campo_dep, boolean privado, double metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.cant_hab = cant_hab;
        this.descuento_gremio = descuento_gremio;
        this.campo_dep = campo_dep;
    }

    public Residencia() {
    }

    protected int cant_hab;
    protected boolean descuento_gremio;
    protected boolean campo_dep;

}
