 
package extra2.herencia;

import java.util.ArrayList;
import java.util.Scanner;

 
public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Edificio> edificio = new ArrayList();

        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int cont1 = 0;
        
        String opcion = "n";
        boolean techado;
        String letra = null;
        do {
            System.out.println("**********************************");
            System.out.println(" ** Edificios de Oficina ** \n");
            
            System.out.print("\n 1-)ingrese la cantidad de oficinas por piso->");
            int oficinasPiso = leer.nextInt();
            System.out.print("\n 2-)Ingrese la cantidad de pisos del Edificio->");
            int pisos = leer.nextInt();
            System.out.print("\n 3-)ingrese la cantidad de personas por oficina->");
            int personaPorOfi = leer.nextInt();
            
            System.out.println("--------------------------------------");
            
            System.out.println("\n ** Dimensiones del Edificio ** \n");
            
            System.out.print("ingrese el ancho del Edificio->");
            double anchoedi = leer.nextDouble();
            System.out.print("ingrese el largo del Edificio->");
            double largoedi = leer.nextDouble();
            System.out.print("ingrese el alto del Edificio->");
            double altoedi = leer.nextDouble();
            
            edificio.add(new EdificioDeOficina(oficinasPiso, pisos, personaPorOfi, anchoedi, largoedi, altoedi));
            System.out.println("**********************************");
            
            System.out.println(" ** PoliDeportivos ** \n");
            
            System.out.print("ingrese el nombre del PoliDeportivo-> ");
            String nombrepoli = leer.next();
           
            System.out.println("el PoliDeportivo, esta techado? S/N");
            do{
                System.out.print("op-> ");
                letra = leer.next(); 
                if (!letra.equalsIgnoreCase("N") && !letra.equalsIgnoreCase("S")) {
                    System.out.println("DISCULPE, INGRESE CORRECTAMENTE\n");
                }
            }while (!letra.equalsIgnoreCase("N") && !letra.equalsIgnoreCase("S")) ;
            
            if (letra.equalsIgnoreCase("s")) {
                     techado = true;
                     cont++;
                }else{
                    techado = false;
                    cont1++;
                }
            
             System.out.println("--------------------------------------");
            
            System.out.println("\n ** Dimensiones del PoliDeportivo** \n");
            
            System.out.print("ingrese el ancho del PolidePortivo->");
            double anchopoli = leer.nextDouble();
            System.out.print("ingrese el largo del PolidePortivo->");
            double largopoli = leer.nextDouble();
            System.out.print("ingrese el alto del PolidePortivo->");
            double altopoli = leer.nextDouble();
            
            edificio.add(new PolidePortivo(nombrepoli, techado, anchopoli, largopoli, altopoli));
            
            System.out.println("**********************************");
            
            System.out.println("desea seguir agregando mas campos? S/N");
            System.out.print("opcion-> ");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s"));
        
        System.out.println("");
        
        for (Edificio edificio1 : edificio) {
            
            System.out.println(edificio1);
            System.out.println("La superficie es de " + edificio1.calcularSuper());
            System.out.println("El Volumen es de " + edificio1.calculaVolumen())  ;
            
            if (edificio1 instanceof EdificioDeOficina) {
                System.out.println("La cantidad de personas en el Edificio es-> "
                + ((EdificioDeOficina) edificio1).cantidadPersona() );                
            }
            System.out.println("--------------------");
        }
        
        System.out.println("********************************");
        
        System.out.println("La cantidad de PoliDeportivos techados son-> "
                + cont);
        System.out.println("La cantidad de PoliDeportivos al aire libre son-> "
                + cont1);
        
//        for (Edificio edificio1 : edificio) {
//            if (edificio1 instanceof PolidePortivo) {
//                System.out.println("La cantidad de PoliDeportivos techados son-> "
//                + cont);
//                System.out.println("La cantidad de PoliDeportivos al aire libre son-> "
//                + cont1); 
//                break;
//            }
//        }
        
        System.out.println("********************************");

    }


}
