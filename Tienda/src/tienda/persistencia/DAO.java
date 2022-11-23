package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement stmt;

    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/tienda";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE;

    public DAO(){
    this.DATABASE="tienda";
}
  
    // Conexion de Base de Datos
    protected void conexionBase() throws ClassNotFoundException, SQLException {

        try {
            Class.forName(DRIVER);

           
            String urlBaseDeDatos=URL+DATABASE;
             conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;

        }

    }
    
//metodo para desconectar base 
protected void desconectarBase() throws Exception{
    
    try{
    if(resultado!=null){
    resultado.close();
    };
    
    if(conexion!=null){
        conexion.close();
    };    
    if(stmt!=null){
        stmt.close();
        
    };
    } catch(Exception ex){
    throw ex;
    };
    

    
}

    protected void consultarBase(String sql) throws Exception{
        
        try {
                conexionBase();
                stmt=conexion.createStatement();
                resultado=stmt.executeQuery(sql);
                
        } catch (Exception ex) {
            throw ex;
        }
        
        
        
    }
    
    protected void crearModificarEliminar(String sql) throws Exception{
        
         try {
                conexionBase();
                stmt=conexion.createStatement();
              stmt.executeUpdate(sql);
                
        } catch (Exception e) {
            throw e;
            
        } finally{
             desconectarBase();
         };
        
    }

    
    
}