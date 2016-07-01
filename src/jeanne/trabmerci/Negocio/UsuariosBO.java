/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeanne.trabmerci.Negocio;

import excecao.LoginNaoEfetuadoException;
import excecao.UsuarioInexistenteException;
import excecao.ValidaAlterarSenhaException;
import excecao.ValidarLoginException;
import excecao.ValidarTamConfirmSenhaException;
import excecao.ValidarTamSenhaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import jeanne.trabmerci.Entidade.Usuario;
import jeanne.trabmerci.Persistencia.BancoDadosUtil;
import jeanne.trabmerci.Persistencia.UsuariosDAO;

/**
 *
 * @author Jeanne
 */
public class UsuariosBO {
    
    public void inserir(Usuario usuarios) throws SQLException{
              
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.inserir(usuarios);
    }
    
    public void alterar(Usuario usuarios) throws SQLException{      
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.alterar(usuarios);
    }
    
    public List<Usuario> buscarTodos() throws SQLException{
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        return usuariosDAO.buscarTodos();
    }

    public void excluir(String login) throws SQLException{
        UsuariosDAO usuarioDAO = new UsuariosDAO();
        usuarioDAO.excluir(login);
    }
 

    public Usuario buscarLogin(Usuario usuario) throws SQLException {
          Usuario usuarioExistente = null;
        UsuariosDAO usuariosDAO = new UsuariosDAO();
     
        usuarioExistente = usuariosDAO.buscarLogin(usuario);
        
        if(usuarioExistente != null){
            return usuarioExistente;
        }else{
            throw new UsuarioInexistenteException("Usuario inexistente");
        }
    }
    
     public void atualizarDadosSenha(Usuario usuario) throws SQLException {
        this.validarTamanhoSenha(usuario);
        this.validarTamanhoConfirmaSenha(usuario);
        this.validarSenhaAlterarSenha(usuario);
        UsuariosDAO usuarioDAO = new UsuariosDAO();
        usuarioDAO.atualizarDadosSenha(usuario);
    } 

   
  
    private void validarSenhaAlterarSenha(Usuario usuario) {
          String replaceAll = usuario.getConfirmarSenha().replaceAll("[^a-zA-Z0-9 ]", "");
         if(usuario.getSenha() == null ? replaceAll != null : !usuario.getConfirmarSenha().equals(replaceAll)){
             throw new ValidaAlterarSenhaException();
         }
    }

    private void validarTamanhoConfirmaSenha(Usuario usuario) {
       if (usuario.getSenha().trim().length() > 8) {
            throw new ValidarTamConfirmSenhaException();
        }
    }

    private void validarTamanhoSenha(Usuario usuario) {
       if (usuario.getSenha().trim().length() > 8) {
            throw new ValidarTamSenhaException();
        }
    }

    public Usuario PesquisarLogin(Usuario usuarioBusca) throws SQLException {
        Usuario usuarioExistente = null;
        UsuariosDAO usuariosDAO = new UsuariosDAO();
     
        usuarioExistente = usuariosDAO.PesquisarLogin(usuarioBusca);
        
        if(usuarioExistente != null){
            return usuarioExistente;
        }else{
            throw new LoginNaoEfetuadoException();
        }
    }

    public void excluirUsuarioPesquisado(String login) throws SQLException {
        UsuariosDAO usuarioDAO = new UsuariosDAO();
        usuarioDAO.excluir(login);
    }

    
    
}
