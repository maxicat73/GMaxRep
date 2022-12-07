
package Principal;

import Entidad.Auto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Principal {

    public static void main(String[] args) {
        Auto a1=new Auto("abc123","Negro");
        
        ArrayList<Auto> autos = new ArrayList();

    
    Auto a2=new Auto("MHC814","blanco");
    Auto a3=new Auto("lk1756","crema");
    
    autos.add(a3);
    autos.add(a2);
    autos.add(a1);
    autos.add(new Auto("hig033","negro0"));
    autos.add(new Auto("CYE110","gris"));
    
        for (Auto lista1 : autos) {
            
            System.out.println(lista1.toString()); 
        }
     autos.remove(a1);
    
    
   
    HashSet<Integer> hash1=new HashSet();
   hash1.add(1);
    hash1.add(2);
    hash1.add(20);
    hash1.add(30);
    hash1.add(50);
    
    
        System.out.println(hash1.size());
        
        
    hash1.remove(2);
    
    HashMap<Integer,String> personas=new HashMap();
    int dni=123;
    String nombrepersona="maxi";
      int dni2=1234;
    String nombrepersona2="pablo";
      int dni3=12345;
    String nombrepersona3="Julio";
      int dni4=123456;
    String nombrepersona4="Johana";
      int dni5=1234567;
    String nombrepersona5="Sebastian";
            
    personas.put(dni,nombrepersona);
     personas.put(dni2,nombrepersona2);
     personas.put(dni3,nombrepersona3);
      personas.put(dni4,nombrepersona4);
       personas.put(dni5,nombrepersona5);
    personas.remove(123);
       
       
        
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("DNI:"+entry.getKey()+", nombre: "+ entry.getValue());
            
        }
        
        
        HashMap<Integer,String> personas2 = new HashMap<>();
        String n1= "Albus";
        String n2 = "Severus";
        personas2.put(1,n1);
        personas2.put(2,n2);
        personas2.put(3,"juan");
        System.out.println(personas2);
        
        for (Map.Entry<Integer, String> entry : personas2.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("La persona numero "+ entry.getKey()+", es "+entry.getValue());
            
        }
        
    }
}
