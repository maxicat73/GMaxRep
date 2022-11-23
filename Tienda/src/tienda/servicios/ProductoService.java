
package tienda.servicios;

import tienda.entidades.Producto;
import tienda.persistencia.ProductoDao;

public class ProductoService {
        

   ProductoDao d=new ProductoDao();
    
   //mostrar consulta 1
   public void mostrarConsulta1() throws Exception{
       System.out.println("El metodo muestra el nombre de todos los productos que hay en la tabla producto");
       for (Producto p1 : d.consulta1()) {
           System.out.println(p1.getNombre());
       }
   }
   
   public void mostrarConsulta2() throws Exception{
       System.out.println("El metodo muestra nombres y los precios de todos los productos de la tabla producto");
       for (Producto p1 : d.consulta2()) {
           System.out.println(p1.getNombre()+" "+p1.getPrecio());
       }
   }
   public void mostrarConsulta3() throws Exception{
       System.out.println("El metodo lista aquellos productos que su precio esté entre 120 y 202");
       for (Producto p1 : d.consulta3()) {
           System.out.println(p1.getNombre()+" "+p1.getPrecio());
       }
   }
   
    public void mostrarConsulta4() throws Exception{
       System.out.println("El metodo muestra el nombre de todos los productos que son portatiles");
       for (Producto p1 : d.consulta4()) {
           System.out.println(p1.getNombre());
       }
   }
       public void mostrarConsulta5() throws Exception{
       System.out.println("El metodo muestra el nombre del producto mas barato");
       for (Producto p1 : d.consulta5()) {
           System.out.println(p1.getNombre()+" "+p1.getPrecio());
       }
   }
       
        public void ejecutarConsulta6() throws Exception{
       System.out.println("El metodo ingresa un producto a la base de datos");
       d.consulta6(new Producto(12,"notebook picante ryzen 10",12000,2));
       
   }
}
     /*   
           public void ejecutarConsulta7() throws Exception{
       System.out.println("El metodo modifica un producto a la base de datos");
         d.consulta7();
}
*/
       
   

   
   
    
    
    

