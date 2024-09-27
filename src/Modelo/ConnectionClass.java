
package Modelo;

import java.sql.*;

public class ConnectionClass {
     //Cadena conexión
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USUARIO = "LimaCrudJava";
    private static final String CONTRASENA = "LimaCrudJava";
    
    //Metodo de conexión
    public static Connection getConnection() {
        try {
            //Llamar la libreria
            Class.forName("oracle.jdbc.driver.OracleDriver");
 
            //Obtener conexion en variable
            Connection connection = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            
            return connection;
        } catch (SQLException e) {
            System.out.println("[Conexión] Error al conectar a la Base: " + e);
              return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("[ConnectionClass] Error en ConnectionClass: " + ex);
              return null;
        }
    }
}
