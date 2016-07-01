/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeanne.trabmerci.Entidade;

/**
 *
 * @author Jeanne
 */
public class Usuario {
    private int ID;
    private String NOME;
    private String LOGIN;
    private String SENHA;
    private String CARGO; 
    private String ConfirmarSenha;

    public String getConfirmarSenha() {
        return ConfirmarSenha;
    }

    public void setConfirmarSenha(String ConfirmarSenha) {
        this.ConfirmarSenha = ConfirmarSenha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return NOME;
    }

    public void setNome(String nome) {
        this.NOME = nome;
    }

    public String getLogin() {
        return LOGIN;
    }

    public void setLogin(String login) {
        this.LOGIN = login;
    }

    public String getSenha() {
        return SENHA;
    }

    public void setSenha(String senha) {
        this.SENHA = senha;
    }
    

    public String getCargo() {
        return CARGO;
    }

    public void setCargo(String cargo) {
        this.CARGO = cargo;
    }

    
}
