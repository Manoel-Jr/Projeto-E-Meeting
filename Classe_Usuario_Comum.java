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
public class Classe_Usuario_Comum {
    
    private String nome;
    private String email;
    private String cpf;
    private String nomeLogin;
    private String senhaLogin;
    private String confSenha;

    public Classe_Usuario_Comum() {
    }

    public Classe_Usuario_Comum(String nome, String email, String cpf, String nomeLogin, String senhaLogin, String confSenha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.nomeLogin = nomeLogin;
        this.senhaLogin = senhaLogin;
        this.confSenha = confSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public String getConfSenha() {
        return confSenha;
    }

    public void setConfSenha(String confSenha) {
        this.confSenha = confSenha;
    }

    @Override
    public String toString() {
        String str;
        str = "---------------- Relatorio de Cadastro de Usuario -------------------"+
                
                                 "\n Nome Completo = "+nome+
                                 "\n E-mail = "+email+
                                 "\n CPF = "+cpf+
                                 "\n Nome de Login = "+nomeLogin+
                                 "\n Senha de Login = "+ senhaLogin;
              
        return str;
               
    }
    
    
    
    
}
