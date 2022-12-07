
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;


public final class ProductoDao extends DAO {

 
    
//metodo de consulta
    
    public Collection<Producto>  consulta(String sql) throws Exception{
        try {
            Collection<Producto> productos=new ArrayList();
            Producto prod=null;
           consultarBase(sql);
           
           while(resultado.next()){
               prod=new Producto();
               prod.setCodigo(resultado.getInt("codigo"));
               prod.setNombre(resultado.getString("nombre"));
               prod.setPrecio(resultado.getDouble("precio"));
               prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                
               productos.add(prod);
               
              
           }
           desconectarBase();
           return productos;
           
        } catch (Exception e) {
            desconectarBase();
            throw e;
            
        }
        
    }
    
    
    public void CrearModElim(Producto p, String sql) throws Exception{
        
        try {
                if(p==null){
                    throw new Exception("Debe ingresar un  producto");
                }
                crearModificarEliminar(sql);
                      
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    public Collection<Producto> consulta1() throws Exception{
        
        String sql="Select * from producto ";
        return consulta(sql);
    }
    
    public Collection<Producto> consulta2() throws Exception{
        String sql="Select *  from producto";
        return consulta(sql);
    }
    public Collection<Producto> consulta3() throws Exception{
        String sql="Select *  from producto where precio between 120 and 202";
        return consulta(sql);
    }
    
    public Collection<Producto> consulta4() throws Exception{
        String sql="Select * from producto where nombre like '%Portátil%'";
        return consulta(sql);
    }
    public Collection<Producto> consulta5() throws Exception{
        String sql="Select * from producto order by precio limit 1";
        return consulta(sql);
    }
    
    public void consulta6(Producto p) throws Exception{
        String sql="Insert Into producto(codigo,nombre,precio,codigo_fabricante) "
                + "values('"+p.getCodigo()+"','"+p.getNombre()+"','"+p.getPrecio()+"','"+p.getCodigoFabricante()+"');";
        CrearModElim(p, sql);
    }
    
    public void consulta7(Producto p) throws Exception{
        String sql="Update producto set nombre='"+p.getNombre()+"' where codigo='"+p.getCodigo()+"';";
        CrearModElim(p, sql);
    }
    
    
    /*
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
    */
}
