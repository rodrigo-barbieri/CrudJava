/*
 * Inserir dados no banco de dados
 * e gerenciar conexão.
 */
package DAO;

import DTO.funcionarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author rodrigo
 */
public class funcionarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarfuncionario(funcionarioDTO objfuncionariodto){
        String sql = "insert into funcionario (nome_funcionario, endereco_funcionario) values (?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            
            pstm.execute();
            pstm.close();
            
        }catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "funcionarioDAO" + e);
        }
    }
    
}
