//A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
//además de los atributos heredados.
//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
//llamar al constructor de la clase padre.
//Los métodos que se implementara serán:
//• Método get y set del atributo carga.
//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
package herencia_ej2;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected double carga;

    public Lavadora(double carga, String color, char consumoEnergetico, Double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public static Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e1 = crearElectrodomestico();
        System.out.println("ingrese la carga de Lavadora:");
        double carga1 = leer.nextDouble();
        return new Lavadora(carga1, e1.getColor(), e1.getConsumoEnergetico(), e1.getPeso());

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            setPrecio(getPrecio() + 500d);
        }
    }

}
