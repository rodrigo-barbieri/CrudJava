/**
 * Criação de conexão mysql de acesso aos
 * objetos DAO
 */ 
 /**
 *
 * @author rodrigo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public Connection conectaBD() {
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "conexaoDAO" + e.getMessage());
        }        
        return conn;           
}
    
}

