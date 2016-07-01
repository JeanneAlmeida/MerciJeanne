
package jeanne.trabmerci.Persistencia;
import jeanne.trabmerci.Entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeanne
 */
public class UsuariosDAO {
    private static final String INSERT = "INSERT INTO USERS (NOME,LOGIN,SENHA,CARGO) VALUES (?,?,?,?)";
    private static final String SELECT_TODOS = "SELECT ID, NOME, LOGIN, SENHA, CARGO FROM Users ORDER BY NOME";
    private static final String UPDATE = "UPDATE USERS SET NOME = ?,LOGIN = ? ,SENHA = ?,CARGO = ? WHERE ID = ?";
    private static final String DELETE = "DELETE FROM USERS WHERE LOGIN =?"; 
    private static final String LOGIN_SELECT = "SELECT ID, NOME,LOGIN, SENHA, CARGO FROM USERS WHERE LOGIN = ?"; 
   private static final String AtualizarSenha = "UPDATE USUARIO SET SENHA = ? WHERE ID = ?";
    private static final String BUSCAR_LOGIN_E_SENHA = "SELECT * FROM USERS WHERE LOGIN = ? AND SENHA = ? ";
    
    public void inserir(Usuario usuarios) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(INSERT);
            comando.setString(1, usuarios.getNome());
            comando.setString(2, usuarios.getLogin());
            comando.setString(3, usuarios.getSenha());
            comando.setString(4, usuarios.getCargo());

            comando.execute();
            conexao.commit();

        } catch (Exception e) {
            if (conexao == null) {
                conexao.rollback();
            }
            throw e;
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }
   
    
     public List<Usuario> buscarTodos() throws SQLException{
        List<Usuario> UsuariosLista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SELECT_TODOS);
            resultado = comando.executeQuery();
            
            while(resultado.next()){
                Usuario usuarios = new Usuario();
                
                usuarios.setID(resultado.getInt(1));
                usuarios.setNome(resultado.getString(2));
                usuarios.setLogin(resultado.getString(3));
                usuarios.setSenha(resultado.getString(4));
                usuarios.setCargo(resultado.getString(5));
                                
                UsuariosLista.add(usuarios);
            }
            
        }finally {
            //Todo objeto que referencie o banco de dados deve ser fechado
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
        
        return UsuariosLista;
    }
     
    public void excluir(String login) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;
        
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(DELETE);
            comando.setString(1, login);
          
            comando.execute();
            conexao.commit();
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw e;
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }
    
    public void alterar(Usuario usuarios) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;

        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(UPDATE);
            comando.setString(1, usuarios.getNome());
            comando.setString(2, usuarios.getLogin());
            comando.setString(3, usuarios.getSenha());
            comando.setString(4, usuarios.getCargo());

            comando.execute();
            conexao.commit();

        } catch (Exception e) {
            if (conexao == null) {
                conexao.rollback();
            }
            throw e;
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }

    }

    public Usuario buscarLogin(Usuario usuario) throws SQLException {
          Usuario usuarios = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(LOGIN_SELECT);
            comando.setString(1, usuario.getLogin());   
            //comando.setString(1, usuario.getSenha()); 
            resultado = comando.executeQuery();
            
            while(resultado.next()){
                usuarios = new Usuario();
                usuarios.setID(resultado.getInt(1));
                usuarios.setNome(resultado.getString(2));
                usuarios.setLogin(resultado.getString(3));
                usuarios.setSenha(resultado.getString(4));  
                usuarios.setCargo(resultado.getString(5));
            }        
        }finally {
            //Todo objeto que referencie o banco de dados deve ser fechado
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
        return usuarios;
    }

    public void atualizarDadosSenha(Usuario usuario) throws SQLException {
        PreparedStatement comando = null;
        Connection conexao = null;    
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(AtualizarSenha);
            comando.setString(1, usuario.getSenha());
            comando.setInt(2, usuario.getID());
            comando.execute();
            conexao.commit();
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw new RuntimeException();
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }    }

    public Usuario PesquisarLogin(Usuario usuarioBusca) throws SQLException {
        
        Usuario usuarios = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(LOGIN_SELECT);
            comando.setString(1, usuarioBusca.getLogin());
            resultado = comando.executeQuery();

            while (resultado.next()) {
                usuarios = new Usuario();

                usuarios.setID(resultado.getInt(1));
                usuarios.setNome(resultado.getString(2));
                usuarios.setLogin(resultado.getString(3));
                usuarios.setSenha(resultado.getString(4));
                usuarios.setCargo(resultado.getString(5));

            }
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
        return usuarios;
    }
    
}
       