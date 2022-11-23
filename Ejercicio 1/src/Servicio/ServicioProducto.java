/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import persistencia.ProductoDAO;


public class ServicioProducto {

    Scanner leer = new Scanner(System.in);
    Producto producto = new Producto();
    private ProductoDAO dao;

    public ServicioProducto() {
        this.dao = new ProductoDAO();
        
    }

    
     public void crearProducto() throws Exception{
         
         System.out.println("INGRESO DE NUEVO PRODUCTO");
         
         System.out.println("Ingrese el codigo del producto"); 
         int codigo = leer.nextInt();
         System.out.println("Ingrese el nombre del Producto");
         String produc = leer.next();
         System.out.println("Ingrese el precio del Producto");
         Double precio = leer.nextDouble();
         System.out.println("Ingrese el codigo del fabricante");
         int fabri = leer.nextInt();
         
         Producto producto = new Producto();
         producto.setCodigo(codigo);
         producto.setNombre(produc);
         producto.setPrecio(precio);
         producto.setCodigo_fabricante(fabri);
         dao.guardarProducto(producto);
                          
         
     }
     
     public void eliminacion(){
         
         System.out.println("Ingrese el codigo del producto a eliminar");
         int codigo1 = leer.nextInt();
         
         dao.eliminarProducto(codigo1);
     }
     
     public Producto consultardatos() throws Exception{
         
         System.out.println("Ingrese el codigo del Producto a buscar en la consulta");
         int codigo = leer.nextInt();
         return dao.buscarProductoPorCodigo(codigo);
     }
     
     public ArrayList < String > arra() throws Exception{
         return dao.listadeproductos();
             
     }
        
    }


//   

