
//Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
//“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
//método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
//un ArrayList de animales y los siguientes animales
//Animal a = new Animal();
//Animal b = new Perro();
//Animal c = new Gato();
//Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
//método hacerRuido() de cada ítem.


package herencia_manosalaobra;




public class Herencia_ManosalaObra {

    
    public static void main(String[] args) {
      
  //Declaración del objeto Perro

Animal perrol = new Perro("Perseo", "bife de chorizo", 7, "Dogo de burdeos");

perrol. Alimentarse();

//Declaración de otro objeto Perro

Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
perro2. Alimentarse();

//Declaración del objeto Gato

Animal gatol= new Gato("Pelusa", "Galletas", 15, "Sianés");
gatol.Alimentarse();

//Declaración del objeto Caballo

Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino"); 
caballo1.Alimentarse();
caballo1.diHola();
        System.out.println("    ---*****      ");



    }
    
}
