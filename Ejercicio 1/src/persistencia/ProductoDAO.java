package persistencia;

import Entidades.Producto;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public final class ProductoDAO extends DAO {

    Producto pord = new Producto();
    Scanner leer = new Scanner(System.in);

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                
                System.out.println("El producto es nulo");
            }
            
            conectarDatabase();
            String sql = "INSERT INTO Producto (codigo,nombre,precio,codigo_fabricante)" + " VALUES(' " + producto.getCodigo() + " '   , ' " + producto.getNombre() + " '  , ' " + producto.getPrecio() + " ' ,  ' " + producto.getCodigo_fabricante() + " ' );";

            ejecutarUpdate(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProd(Producto producto) throws Exception {

        try {
            conectarDatabase();
            String sql = " UPDATE Producto SET " + " nombre = '" + producto.getNombre() + "' WHERE codigo = '" + producto.getCodigo() + "' );";
            ejecutarUpdate(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(int codigo1) {

        try {
            String sql = "DELETE FROM Producto WHERE codigo = '" + codigo1 + "'";

            ejecutarUpdate(sql);
        } catch (Exception e) {
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo;
            ejecutarConsulta(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigo_fabricante(resultado.getInt("codigo_fabricante"));
            }
            desconectarDatabase();
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<String> listadeproductos() throws Exception {

        try {

            String sql = "SELECT nombre , precio FROM Producto";
            ejecutarConsulta(sql);

            ArrayList<String> produc = new ArrayList<String>();
            while (resultado.next()) {
               
                produc.add(resultado.getString("nombre"));
                 produc.add(resultado.getString("precio"));
            }
            desconectarDatabase();
            return produc;
        } catch (Exception e) {
            throw e;
        }
    }
}
