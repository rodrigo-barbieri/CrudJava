/*
 * Getters and Setters para
 * manipulação dos dados inseridos
 */
package DTO;

/**
 *
 * @author rodrigo
 */
public class funcionarioDTO {
    private String nome_funcionario;
    private String endereco_funcionario;

    /**
     * @return the nome_funcionario
     */
    public String getNome_funcionario() {
        return nome_funcionario;
    }

    /**
     * @param nome_funcionario the nome_funcionario to set
     */
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    /**
     * @return the endereco_funcionario
     */
    public String getEndereco_funcionario() {
        return endereco_funcionario;
    }

    /**
     * @param endereco_funcionario the endereco_funcionario to set
     */
    public void setEndereco_funcionario(String endereco_funcionario) {
        this.endereco_funcionario = endereco_funcionario;
    }
    
}
