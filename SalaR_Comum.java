/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author junior
 */
public class SalaR_Comum {
    
    private String nomeSala;
    private String enderecoSala;

    public SalaR_Comum() {
    }

    public SalaR_Comum(String nomeSala, String enderecoSala) {
        this.nomeSala = nomeSala;
        this.enderecoSala = enderecoSala;
    }

    /**
     * @return the nomeSala
     */
    public String getNomeSala() {
        return nomeSala;
    }

    /**
     * @param nomeSala the nomeSala to set
     */
    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    /**
     * @return the enderecoSala
     */
    public String getEnderecoSala() {
        return enderecoSala;
    }

    /**
     * @param enderecoSala the enderecoSala to set
     */
    public void setEnderecoSala(String enderecoSala) {
        this.enderecoSala = enderecoSala;
    }
    
    
    @Override
    public String toString() {
        
        return this.nomeSala;
    }
}
