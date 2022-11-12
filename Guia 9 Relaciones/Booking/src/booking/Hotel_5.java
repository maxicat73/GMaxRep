package booking;

public final class Hotel_5 extends Hotel_4 {

    protected int cant_conf;
    protected int cant_suites;
    protected int cant_lim;

    public Hotel_5(int cant_conf, int cant_suites, int cant_lim, boolean gimnasio, String nombre_resto, int cap_rest, int cantHab, int numeroCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombre_resto, cap_rest, cantHab, numeroCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.cant_conf = cant_conf;
        this.cant_suites = cant_suites;
        this.cant_lim = cant_lim;
    }

    public Hotel_5() {
    }

    public double cantLim() {
        return cant_lim * 15;

    }

    @Override
    public String toString() {
        return super.toString() + "Hotel_5{" + "cant_conf=" + cant_conf + ", cant_suites=" + cant_suites + ", cant_lim=" + cant_lim + '}';
    }
    
    

    @Override
    public double valorResto() {
        double valor2 = 0;
        if (this.cap_rest < 30) {
            valor2 = 10;

        } else if (this.cap_rest >= 30 && this.cap_rest <= 50) {
            valor2 = 30;
        } else if (this.cap_rest > 50) {
            valor2 = 50;
        }

        return valor2;

    }

    @Override
    public double valorGym() {

        double valor;
        if (gimnasio) {
            valor = 50;
        } else {
            valor = 30;

        }
        return valor;

    }

    @Override
    public double capacidadHotel() {
        return this.cantHab * this.cantPisos * this.numeroCamas;

    }

    @Override
    public double preciohab() {

         return this.precioHab = 50 + (1 * capacidadHotel()) + valorResto() + valorGym() + cantLim();

    }
    
    

}
