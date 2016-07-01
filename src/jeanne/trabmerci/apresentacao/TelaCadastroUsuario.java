/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeanne.trabmerci.apresentacao;

import javax.swing.JOptionPane;
import jeanne.trabmerci.Entidade.Usuario;
import jeanne.trabmerci.Negocio.UsuariosBO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Window;
import java.util.List;

/**
 *
 * @author Jeanne
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    private Usuario usuarios;
    private Usuario filtro;
    private List<Usuario> listaUsuarios;
    private Usuario pesquisaUsuario;
    private boolean usuariosParaEdicao;
    private ListarUsuarios listagemUsuarios;
    public TelaCadastroUsuario() {
        usuarios = new Usuario();
        initComponents();
    }

    
    public TelaCadastroUsuario(Usuario usuarioselecionado, ListarUsuarios listagemUsuario)
   {
       usuarios = usuarioselecionado;
        initComponents();
        this.inicializarCamposTela();
        usuariosParaEdicao=true;
        this.listagemUsuarios=listagemUsuario;
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jCheckGerente = new javax.swing.JCheckBox();
        jCheckBoxGestorEstoque = new javax.swing.JCheckBox();
        jCheckBoxGestorCompras = new javax.swing.JCheckBox();
        jCheckBoxCaixeiro = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuários"));

        lblNome.setText("Nome: ");

        lblLogin.setText("Login: ");

        lblSenha.setText("Senha: ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão de Usuários"));

        jCheckGerente.setText("Gerente");
        jCheckGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckGerenteActionPerformed(evt);
            }
        });

        jCheckBoxGestorEstoque.setText("Gestor de Estoque");

        jCheckBoxGestorCompras.setText("Gestor de Compras");

        jCheckBoxCaixeiro.setText("Caixeiro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckGerente)
                    .addComponent(jCheckBoxGestorEstoque))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxCaixeiro)
                    .addComponent(jCheckBoxGestorCompras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxGestorEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBoxGestorCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxCaixeiro)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/NovoUsuario.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pesquisa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/SAVE2.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/remove.png"))); // NOI18N
        btnExcluir.setText("excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pwdSenha))
                            .addComponent(txtNome))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(lblSenha)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnPesquisar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       habilitarBotao();
        
       if(usuariosParaEdicao){
            this.editar();
        }else{
            this.salvar();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.LimparCamposTela();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            this.pesquisar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jCheckGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckGerenteActionPerformed
        
    }//GEN-LAST:event_jCheckGerenteActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try { 
                      
            UsuariosBO usuarioBO = new UsuariosBO();
            
            String mensagem = "Realmente deseja excluir o usuário?";
            try {
                usuarioBO.excluirUsuarioPesquisado(usuarios.getLogin());
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
            int opcao = JOptionPane.showConfirmDialog(this,
                            mensagem,
                            "Excluir usuário",
                            JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                        this,
                        "Usuário Excluido com sucesso!.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "",
                    "Exclusão de usuário",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void LimparCamposTela()
    {
        this.txtNome.setText("");
        this.txtLogin.setText("");
        this.pwdSenha.setText("");
        this.jCheckBoxCaixeiro.setSelected(false);
        this.jCheckBoxGestorCompras.setSelected(false);
        this.jCheckBoxGestorEstoque.setSelected(false);
        this.jCheckGerente.setSelected(false);
        this.btnSalvar.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBoxCaixeiro;
    private javax.swing.JCheckBox jCheckBoxGestorCompras;
    private javax.swing.JCheckBox jCheckBoxGestorEstoque;
    private javax.swing.JCheckBox jCheckGerente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void inicializarCamposTela() {
        this.txtNome.setText(this.usuarios.getNome());  
        this.txtLogin.setText(this.usuarios.getLogin());
        this.pwdSenha.setText(this.usuarios.getSenha());
        
        if (usuarios.getCargo().equals("Gerente")){
           jCheckGerente.setSelected(true);
        }else if(usuarios.getCargo().equals("Gestor de Compras")){
            jCheckBoxGestorCompras.setSelected(true);
        }else if(usuarios.getCargo().equals("Gestor de Estoque")){
            jCheckBoxGestorEstoque.setSelected(true);
        }else {
            jCheckBoxCaixeiro.setSelected(true);
        }
    }

    private void habilitarBotao()
    {
    btnSalvar.setEnabled(false);
    }

    private void recuperarCamposTela() {
        if (!txtNome.getText().trim().equals("")) {
            usuarios.setNome(txtNome.getText().trim());
        }
        
        if (!txtLogin.getText().trim().equals("")) {
            usuarios.setLogin(txtLogin.getText().trim());
        } 
        
        if (!pwdSenha.getText().trim().equals("")) {
            usuarios.setSenha(pwdSenha.getText().trim());
        }
        
        if (jCheckGerente.isSelected()) {
           usuarios.setCargo("Gerente");
        } else if (jCheckBoxGestorCompras.isSelected()) {
            usuarios.setCargo("Gestor de Compras");
        }else if(jCheckBoxGestorEstoque.isSelected()){
            usuarios.setCargo("Gestor de Estoque");
        }else{
            usuarios.setCargo("Caixeiro");
        } 
    }

    private void limparCamposTela() {
        this.txtNome.setText("");
        this.txtLogin.setText("");
        this.pwdSenha.setText("");
    
        if (usuarios.getCargo().equals("Gerente")){
           jCheckGerente.setSelected(false);
        }else if(usuarios.getCargo().equals("Gestor de Compras")){
            jCheckBoxGestorCompras.setSelected(false);
        }else if(usuarios.getCargo().equals("Gestor de Estoque")){
            jCheckBoxGestorEstoque.setSelected(false);
        }else {
            jCheckBoxCaixeiro.setSelected(false);
        }
    }

    private void editar() {
        try {
            this.recuperarCamposTela();

            UsuariosBO usuariosBO = new UsuariosBO();
            usuariosBO.alterar(usuarios);

            JOptionPane.showMessageDialog(this,
                    "Usuario alterado com sucesso!",
                    "Alteração de usuario",
                    JOptionPane.INFORMATION_MESSAGE);

            this.dispose();
            this.listagemUsuarios.carregarTabelaUsuario();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage(),
                    "Alteração de usuario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void salvar() {
        try {
            this.recuperarCamposTela();

            UsuariosBO usuariosBO = new UsuariosBO();
            usuariosBO.inserir(usuarios);

            JOptionPane.showMessageDialog(this,
                    "Usuario cadastrado com sucesso!",
                    "Cadastro de usuario",
                    JOptionPane.INFORMATION_MESSAGE);

            this.limparCamposTela();
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage(),
                    "Cadastro de usuario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void pesquisar() throws SQLException {
        Usuario usuarioBusca = new Usuario();
        String login = txtLogin.getText().trim();
        
        usuarioBusca.setLogin(login);
        
        UsuariosBO usuarioBO = new UsuariosBO();
        usuarios = usuarioBO.PesquisarLogin(usuarioBusca);
        inicializarCamposTela();
    }

   
}
