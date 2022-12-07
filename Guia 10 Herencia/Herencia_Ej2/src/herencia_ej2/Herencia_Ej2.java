
package herencia_ej2;

public class Herencia_Ej2 {

    public static void main(String[] args) {

        Electrodomestico e1 = Lavadora.crearLavadora();
        e1.precioFinal();
        System.out.println(e1.getPrecio());

    }

}
