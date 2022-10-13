//
//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.
//Los métodos a implementar son:
//• Métodos getters y setters de todos los atributos.
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
//• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
//
//13
//
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
package herencia_ej2;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, Double peso) {
        this.precio = 1000d;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        char char1=Character.toLowerCase(letra);
        if (letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e') {
            return letra;
        } else {
            return 'f';
        }
    }

    public String comprobarColor(String color) {

        if (color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
            return color;
        } else {
            return "blanco";
        }

    }

    public static Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el color :");
        String color1 = leer.next();
        System.out.println("ingrese el grado de consumo Energetico(A,B,C,D,E,F");
        char letra = leer.next().charAt(0);
        System.out.println("Ingrese el peso ");
        double peso2 = leer.nextDouble();

        return new Electrodomestico(color1, letra, peso2);

    }

    public void precioFinal() {
        String letra2 = String.valueOf(consumoEnergetico);
        switch (letra2.toLowerCase()) {
            case "a":
                this.precio = retornarPrecio(peso) + 1000d;
                break;
            case "b":
                this.precio = retornarPrecio(peso) + 800d;
                break;
            case "c":
                this.precio = retornarPrecio(peso) + 600d;
                break;
            case "d":
                this.precio = retornarPrecio(peso) + 500d;
                break;
            case "e":
                this.precio = retornarPrecio(peso) + 300d;
                break;
            case "f":
                this.precio = retornarPrecio(peso) + 100d;
                break;

        }

    }

    public double retornarPrecio(double peso) {
        if (peso >= 1 && peso <= 19) {

            this.precio += 100d;

        } else if (peso >= 20 && peso <= 49) {
            this.precio += 500d;
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800d;
        } else if (peso >= 80) {
            this.precio += 1000d;
        }
        return precio;

    }

}
