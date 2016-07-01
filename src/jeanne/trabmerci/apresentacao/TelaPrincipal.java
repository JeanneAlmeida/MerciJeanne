/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeanne.trabmerci.apresentacao;

import excecao.SenhaInvalidaException;
import excecao.SistemaUsuarioException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jeanne.trabmerci.Entidade.Usuario;
import jeanne.trabmerci.Negocio.UsuariosBO;

/**
 *
 * @author Jeanne
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    Usuario usuarioLogin = new Usuario();
    
    public TelaPrincipal() {
        initComponents();
        BotoesDesabilitadosLogin(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmaSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        pwdConfirmarSenha = new javax.swing.JPasswordField();
        btnLogoff = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnAlterarSenha = new javax.swing.JButton();
        btnConfirmarSenha = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuGestao = new javax.swing.JMenu();
        jMnuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemListaUsuarios = new javax.swing.JMenuItem();
        jMnuItemFornecedores = new javax.swing.JMenuItem();
        jMnuItemMercadorias = new javax.swing.JMenuItem();
        jMnuIPedidoCompras = new javax.swing.JMenuItem();
        jMnuItemEstoque = new javax.swing.JMenuItem();
        jMnuItemAbrirCaixa = new javax.swing.JMenuItem();
        jMnuItemSair = new javax.swing.JMenuItem();
        jMnuVendas = new javax.swing.JMenu();
        jMnuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        lblLogin.setText("Login: ");

        lblSenha.setText("Senha: ");

        lblConfirmaSenha.setText("Confirmar Senha: ");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/logoff.png"))); // NOI18N
        btnLogoff.setText("Logoff");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/login_1.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/alterar.png"))); // NOI18N
        btnAlterarSenha.setText("Alterar Senha");
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        btnConfirmarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/confirmar.png"))); // NOI18N
        btnConfirmarSenha.setText("Confirmar Senha");
        btnConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblConfirmaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwdConfirmarSenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(lblSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin)
                            .addComponent(pwdSenha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogoff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarSenha)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmaSenha)
                    .addComponent(pwdConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogoff)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarSenha)
                    .addComponent(btnConfirmarSenha))
                .addContainerGap())
        );

        jMnuGestao.setText("Gestão");

        jMnuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/usuario.png"))); // NOI18N
        jMnuItemUsuario.setText("Usuários");
        jMnuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemUsuarioActionPerformed(evt);
            }
        });
        jMnuGestao.add(jMnuItemUsuario);

        jMenuItemListaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lista.png"))); // NOI18N
        jMenuItemListaUsuarios.setText("Lista de Usuários");
        jMenuItemListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaUsuariosActionPerformed(evt);
            }
        });
        jMnuGestao.add(jMenuItemListaUsuarios);

        jMnuItemFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fornecedores.png"))); // NOI18N
        jMnuItemFornecedores.setText("Fornecedores");
        jMnuGestao.add(jMnuItemFornecedores);

        jMnuItemMercadorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/mercadoria.png"))); // NOI18N
        jMnuItemMercadorias.setText("Mercadorias");
        jMnuGestao.add(jMnuItemMercadorias);

        jMnuIPedidoCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pedidosCompras.png"))); // NOI18N
        jMnuIPedidoCompras.setText("Pedidos de Compras");
        jMnuIPedidoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuIPedidoComprasActionPerformed(evt);
            }
        });
        jMnuGestao.add(jMnuIPedidoCompras);

        jMnuItemEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estoque.png"))); // NOI18N
        jMnuItemEstoque.setText("Estoque");
        jMnuItemEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemEstoqueActionPerformed(evt);
            }
        });
        jMnuGestao.add(jMnuItemEstoque);

        jMnuItemAbrirCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/abrirCaixa.png"))); // NOI18N
        jMnuItemAbrirCaixa.setText("Abrir Caixa");
        jMnuGestao.add(jMnuItemAbrirCaixa);

        jMnuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        jMnuItemSair.setText("Sair");
        jMnuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuItemSairActionPerformed(evt);
            }
        });
        jMnuGestao.add(jMnuItemSair);

        jMenuBar1.add(jMnuGestao);

        jMnuVendas.setText("Vendas");
        jMenuBar1.add(jMnuVendas);

        jMnuAjuda.setText("Ajuda");
        jMenuBar1.add(jMnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jMnuIPedidoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuIPedidoComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuIPedidoComprasActionPerformed

    private void jMnuItemEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuItemEstoqueActionPerformed

    private void jMnuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMnuItemSairActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       //habilitarBotoesLogin();
       
        try {
            buscarLogin();
           
        } catch (SistemaUsuarioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Login",JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Login",JOptionPane.ERROR_MESSAGE);
        } 
      
    }//GEN-LAST:event_btnLoginActionPerformed
    
    
    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        ConfirmarSenha();
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void jMnuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuItemUsuarioActionPerformed
        TelaCadastroUsuario telaUsuarios = new TelaCadastroUsuario();
        telaUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuItemUsuarioActionPerformed

    private void jMenuItemListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaUsuariosActionPerformed
        ListarUsuarios listaUsuarios = new ListarUsuarios();
        listaUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemListaUsuariosActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
       this.dispose();
       TelaPrincipal tela = new TelaPrincipal();
       tela.setVisible(true);
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void btnConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarSenhaActionPerformed
        this.confirmarSenha();  
    }//GEN-LAST:event_btnConfirmarSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnConfirmarSenha;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemListaUsuarios;
    private javax.swing.JMenu jMnuAjuda;
    private javax.swing.JMenu jMnuGestao;
    private javax.swing.JMenuItem jMnuIPedidoCompras;
    private javax.swing.JMenuItem jMnuItemAbrirCaixa;
    private javax.swing.JMenuItem jMnuItemEstoque;
    private javax.swing.JMenuItem jMnuItemFornecedores;
    private javax.swing.JMenuItem jMnuItemMercadorias;
    private javax.swing.JMenuItem jMnuItemSair;
    private javax.swing.JMenuItem jMnuItemUsuario;
    private javax.swing.JMenu jMnuVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmaSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pwdConfirmarSenha;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables

   
    private void limparCamposdaTela() {
        this.txtLogin.setText("");
        this.pwdSenha.setText("");
    }

    private void buscarLogin() throws SQLException {
        Usuario usuario = new Usuario();
        Usuario usuarioEncontrado = null;

        String login = txtLogin.getText().trim();
        String senha = pwdSenha.getText().trim();

        usuario.setLogin(login);
        usuario.setSenha(senha);

        UsuariosBO usuarioBO = new UsuariosBO();
        usuarioEncontrado = usuarioBO.buscarLogin(usuario);
         
        if (usuarioEncontrado.getLogin().equals(usuario.getLogin()) && usuarioEncontrado.getSenha().equals(usuario.getSenha())) {
            
            JOptionPane.showMessageDialog(this, "Login efetuado com sucesso", "Login",JOptionPane.INFORMATION_MESSAGE);
            HabilitandoBotoesUsuario();
            if(usuarioEncontrado.getCargo().equals("Gerente")|| usuarioEncontrado.getCargo().equals("gerente"))
            {
               this.jMnuItemUsuario.setEnabled(true);
               this.jMenuItemListaUsuarios.setEnabled(true);
               this.jMnuItemEstoque.setEnabled(true);
               this.jMnuItemAbrirCaixa.setEnabled(true);
            } 
           
            
            //this.limparCamposdaTela();
        }else{
           // throw new SistemaUsuarioException("erro ao verificar no banco de dados");
            throw new SenhaInvalidaException();
            
        }
    }

    private void BotoesDesabilitadosLogin() {
        btnAlterarSenha.setEnabled(false);
        btnLogoff.setEnabled(false);
        jMnuVendas.setEnabled(false);
        jMnuItemAbrirCaixa.setEnabled(false);
        lblConfirmaSenha.setEnabled(false);
        btnConfirmarSenha.setEnabled(false);
        jMnuItemUsuario.setEnabled(false);
        jMenuItemListaUsuarios.setEnabled(false);
        jMnuItemAbrirCaixa.setEnabled(false);
        jMnuItemEstoque.setEnabled(false);
       
    }

    private void habilitarBotoesLogin() {
        btnLogoff.setEnabled(true);
        btnAlterarSenha.setEnabled(true);
        btnLogin.setEnabled(false);
        btnConfirmarSenha.setEnabled(false);
        jMnuItemAbrirCaixa.setEnabled(false);
    }

    private void habilitarConfirmarSenha() {
        btnConfirmarSenha.setEnabled(false);
    }

    private void ConfirmarSenha() {
         txtLogin.setEnabled(false);
           pwdSenha.setEnabled(true);
           pwdConfirmarSenha.setEnabled(true);
           lblSenha.setEnabled(true);
           lblConfirmaSenha.setEnabled(true);
           btnAlterarSenha.setEnabled(false);
           btnConfirmarSenha.setEnabled(true);
           this.txtLogin.setText(usuarioLogin.getLogin());
    }

    private void confirmarSenha() {
       try{
            if(pwdSenha.getText().trim().isEmpty() || pwdConfirmarSenha.getText().trim().isEmpty()){
            String mensagemErro = "Favor preencher os campos!!\n";
            JOptionPane.showMessageDialog(this, mensagemErro, "Confirma Senha", JOptionPane.ERROR_MESSAGE);
        }else{  
            this.lerDadosAlterarSenha(); 
            UsuariosBO  usuarioBO = new UsuariosBO();
            usuarioBO.atualizarDadosSenha(usuarioLogin);
            this.limparCamposAlterarSenha();
            this.desabilitarCamposAlterarSenha();
            exibirMensagemSucesso("Senha alterada com sucesso!", "Alterar senha de usuário");
        }
        }catch(SistemaUsuarioException e){
            String mensagem = "Erro ao alterar senha!!\n" + e.getMessage();
            JOptionPane.showMessageDialog(this, mensagem, "Aterar Senha", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            exibirMensagemErro("Erro desconhecido contate com administrador", "Cadastrar login usuário");
        }
    }
   
    private void exibirMensagemErro(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void exibirMensagemSucesso(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    private void lerDadosAlterarSenha(){
       usuarioLogin.setSenha(pwdSenha.getText().trim());
       usuarioLogin.setConfirmarSenha(pwdConfirmarSenha.getText().trim());  
    }

    private void limparCamposAlterarSenha() {
        pwdSenha.setText("");
        pwdConfirmarSenha.setText("");  
    }

    private void desabilitarCamposAlterarSenha() {
        btnConfirmarSenha.setEnabled(false);
        pwdSenha.setEnabled(false);
        pwdConfirmarSenha.setEnabled(false);
        lblSenha.setEnabled(false);
        lblConfirmaSenha.setEnabled(false);
        btnAlterarSenha.setEnabled(true);    }

    private void HabilitandoBotoesUsuario() {
        btnAlterarSenha.setEnabled(true);
        btnLogoff.setEnabled(true);
        btnLogin.setEnabled(false);
        lblLogin.setEnabled(false);
        lblSenha.setEnabled(false);
        lblConfirmaSenha.setEnabled(false);
        jMnuItemUsuario.setEnabled(false);
    }

    
}