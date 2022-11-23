package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE ;

    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultado;

    public DAO() {
        this.DATABASE = "tienda";
    }

    protected void conectarDatabase() throws Exception {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = URL + DATABASE;
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (SQLException e) {
            throw e;
        }
    }

    protected void desconectarDatabase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected void ejecutarConsulta(String sql) throws Exception {
        try {
            conectarDatabase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected void ejecutarUpdate(String sql) throws Exception {
        try {
            conectarDatabase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            
            throw ex;
        } finally {
            desconectarDatabase();
        }
    }
}
