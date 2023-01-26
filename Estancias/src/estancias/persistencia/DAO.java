
package estancias.persistencia;

// @author Pablo

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO{
    
    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultado;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void Conectar_Base() throws Exception{
        
        try{
            Class.forName(DRIVER);
            String url="jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";

            conexion=DriverManager.getConnection(url, USER, PASSWORD);
        }
        catch(ClassNotFoundException| SQLException e){
            throw e;
        }
                
    }
    
    protected void Desconectar_Base() throws Exception {
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
        }
        catch (Exception ex) {
            throw ex;
        }
    }
    
    protected void Insert_Modific_Elim(String sql) throws Exception{
        
        try{
            Conectar_Base();
            sentencia=conexion.createStatement();
            sentencia.executeUpdate(sql);    
        } 
        catch (SQLException ex){  
            
            // conexion.rollback();
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda */
            
            throw ex;
        }
        finally{
            Desconectar_Base();
        }
    }
    
    protected void Hacer_Consulta(String sql) throws Exception{
    
        try{
            Conectar_Base();
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sql);
        }
        catch(SQLException ex){
            
            throw ex;
        }
    }
}
