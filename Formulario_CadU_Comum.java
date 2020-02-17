/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Modelos.Classe_Usuario_Comum;
import Modelos.Cessar_Sistema;
import static java.awt.SystemColor.menu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junio
 */
public class Formulario_CadU_Comum extends javax.swing.JFrame {
    
    //Criando ArrayList da classe Usua
    ArrayList<Classe_Usuario_Comum> listaUsuario = new ArrayList<>();
    Relatorio_Cad_Usuario_Comum rcu;
    DefaultTableModel modelo;
    Classe_Usuario_Comum usuario = new Classe_Usuario_Comum();
    private String nome;
    private String senha;
   
    
    public void logandoNovoUsuario(String nome,String senha){
        nome = usuario.getNomeLogin();
        senha = usuario.getSenhaLogin();
        
        if (nome == usuario.getNomeLogin() && senha == usuario.getSenhaLogin()) {
            JOptionPane.showMessageDialog(null, "BEM-VINDO! ");
            JOptionPane.showMessageDialog(null, "Primeiro Acesso! ");
            dispose(); 
            Menu_Comum menu = new Menu_Comum();
            menu.setVisible(true);
        }
        
        
    }
    
    /**
     * 
     * 
     * Creates new form Formulario_CadU_Comum
     */
    
    
    public Formulario_CadU_Comum() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    
    public String listandoDados(){
        
        String info = "";
        
        for(Classe_Usuario_Comum usuario: listaUsuario){
            
            info += usuario;
        }
        
        return info;
    }
    
   
    
    public void cadastrarUsuario(){
        
        recebendoInformacoes();
        
       
        if (usuario.getNome().equals("") && usuario.getCpf().equals("") && usuario.getEmail().equals("") && usuario.getNomeLogin().equals("") && usuario.getSenhaLogin().equals("") && usuario.getConfSenha().equals("")) {
               JOptionPane.showMessageDialog(null, "Preencha os Campos");
        }
        else
           if (usuario.getNome().equals("") && usuario.getCpf()!= "" && usuario.getEmail()!= "" && usuario.getNomeLogin()!= "" && usuario.getSenhaLogin()!= "" && usuario.getConfSenha()!= "") {
               JOptionPane.showMessageDialog(null, "Campo Nome esta vazio!");
        }
        else
          if (usuario.getNome()!= "" && usuario.getCpf().equals("") && usuario.getEmail()!= "" && usuario.getNomeLogin()!= "" && usuario.getSenhaLogin()!= "" && usuario.getConfSenha()!= "") {
           JOptionPane.showMessageDialog(null, "Campo CPF esta vazio!");
        }
        else
          if (usuario.getNome()!= "" && usuario.getCpf()!= "" && usuario.getEmail().equals("") && usuario.getNomeLogin()!= "" && usuario.getSenhaLogin()!= "" && usuario.getConfSenha()!= "") {
           JOptionPane.showMessageDialog(null, "Campo E-mail esta vazio!");
        }
        else 
         if (usuario.getNome()!= "" && usuario.getCpf()!= "" && usuario.getEmail()!= "" && usuario.getNomeLogin().equals("") && usuario.getSenhaLogin()!= "" && usuario.getConfSenha()!= "") {
             JOptionPane.showMessageDialog(null, "Campo Nome Login esta vazio!");
        }
        else
          if (usuario.getNome()!= "" && usuario.getCpf()!= "" && usuario.getEmail()!= "" && usuario.getNomeLogin() != "" && usuario.getSenhaLogin().equals("") && usuario.getConfSenha()!= "") {
              JOptionPane.showMessageDialog(null, "Campo Senha Login esta vazio!");
        }
        else
           if (usuario.getNome()!= "" && usuario.getCpf()!= "" && usuario.getEmail()!= "" && usuario.getNomeLogin()!= "" && usuario.getSenhaLogin()!= "" && usuario.getConfSenha().equals("")) {
                
                JOptionPane.showMessageDialog(null, "Campo Confirma Senha esta vazio!");
        }
        else
            if (usuario.getNome()!= "" && usuario.getCpf()!= "" && usuario.getEmail()!= "" && usuario.getNomeLogin()!= "" && usuario.getSenhaLogin().equals(usuario.getConfSenha()) && usuario.getConfSenha().equals(usuario.getSenhaLogin())) {
                modelo = (DefaultTableModel) tbUsuarios.getModel();
                Object[] dados = {usuario.getNome(),usuario.getCpf(),usuario.getEmail(),usuario.getNomeLogin(),
                        usuario.getSenhaLogin(), usuario.getConfSenha()};
                modelo.addRow(dados);
                JOptionPane.showMessageDialog(null, "Usuario Cadastrado com Sucesso!");
                
                int resposta = JOptionPane.showConfirmDialog(null,"Deseja Logar no Sistema? ");
                if (resposta == JOptionPane.YES_OPTION) {
                    Login l = new Login();
                    l.setVisible(true);
                    dispose();
                
            }
        }
        else
           if (usuario.getNome()!= "" && usuario.getCpf()!= "" && usuario.getEmail()!= "" && usuario.getNomeLogin()!= "" && usuario.getSenhaLogin() != usuario.getConfSenha() && usuario.getConfSenha()!= usuario.getSenhaLogin()) {
               JOptionPane.showMessageDialog(null, "Campo Senha e Campo confirma Senha estão diferentes!");
        }
    } 
    
    public void pesquisarDados(){
        recebendoInformacoes();
        
        
        if (txtConfcpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Campo CPF esta vazio!");
        }
        else
          if(usuario.getCpf().equals(txtConfcpf.getText())){
              txtArea1.setText(listandoDados());
        }
        else
          if (usuario.getCpf() != txtConfcpf.getText()) {
              JOptionPane.showMessageDialog(null," CPF Invalido!");
        }
         
        
    }
        
    
    public void limparCampos(){
        txtNome.setText("");
        txtcpf.setText("");
        txtEmail.setText("");
        txtNome_usuario.setText("");
        txtSenha.setText("");
        txtConfSenha.setText("");
        txtConfcpf.setText("");
        txtArea1.setText("");
    }
    
    
   
    public void alterarDados(){
        
        if (usuario.getNome().equals("") && usuario.getCpf().equals("") && usuario.getEmail().equals("") && usuario.getNomeLogin().equals("") && usuario.getSenhaLogin().equals("") && usuario.getConfSenha().equals("")) {
               JOptionPane.showMessageDialog(null, "Preencha os Campos");
        }
        
        if (usuario.getNome()!= "" && usuario.getCpf()!= "" && usuario.getEmail()!= "" && usuario.getNomeLogin()!= "" && usuario.getSenhaLogin().equals(usuario.getConfSenha()) && usuario.getConfSenha().equals(usuario.getSenhaLogin())) {
              
              tbUsuarios.setValueAt(txtNome.getText(), tbUsuarios.getSelectedRow(),0);
              tbUsuarios.setValueAt(txtcpf.getText(), tbUsuarios.getSelectedRow(),1);
              tbUsuarios.setValueAt(txtEmail.getText(), tbUsuarios.getSelectedRow(),2);
              tbUsuarios.setValueAt(txtNome_usuario.getText(), tbUsuarios.getSelectedRow(),3);
              tbUsuarios.setValueAt(txtSenha.getText(), tbUsuarios.getSelectedRow(),4);
              tbUsuarios.setValueAt(txtConfSenha.getText(), tbUsuarios.getSelectedRow(),5);
              
              JOptionPane.showMessageDialog(null, "Campo Alterado com Sucesso!");
        }
        
    }
    
    
    public void add_objeto_na_Lista(){
        
        recebendoInformacoes();
        listaUsuario.add(usuario);
    }
    
    public void recebendoInformacoes(){
        usuario.setNome(txtNome.getText());
        usuario.setCpf(txtcpf.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setNomeLogin(txtNome_usuario.getText());
        usuario.setSenhaLogin(txtSenha.getText());
        usuario.setConfSenha(txtConfSenha.getText());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtcpf = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNome_usuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtConfcpf = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea1 = new javax.swing.JTextArea();
        btnIncluir_Dados = new javax.swing.JButton();
        btnExcluirDados = new javax.swing.JButton();
        btnVisualizar_R = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtConfSenha = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Usuario");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("Nome de Usuario:");

        jLabel6.setText("Senha:");

        jLabel7.setText("Confirmar Senha:");

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "E-mail", "Nome de Login", "Senha", "Confirmar Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Area de Pesquisa");

        jLabel9.setText("CPF:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtArea1.setColumns(20);
        txtArea1.setRows(5);
        jScrollPane2.setViewportView(txtArea1);

        btnIncluir_Dados.setText("Incluir Dados");
        btnIncluir_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluir_DadosActionPerformed(evt);
            }
        });

        btnExcluirDados.setText("Excluir Dados");
        btnExcluirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirDadosActionPerformed(evt);
            }
        });

        btnVisualizar_R.setText("Visualizar Relatorio");
        btnVisualizar_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizar_RActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar Dados");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar Dados");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtConfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcpf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIncluir_Dados)
                        .addGap(57, 57, 57)
                        .addComponent(btnExcluirDados))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addGap(75, 75, 75)
                        .addComponent(btnLimpar)
                        .addGap(65, 65, 65)
                        .addComponent(btnVisualizar_R, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtConfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir_Dados)
                    .addComponent(btnExcluirDados)
                    .addComponent(btnVisualizar_R)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluir_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluir_DadosActionPerformed
        // TODO add your handling code here:
        cadastrarUsuario();
        add_objeto_na_Lista();
        //limparCampos();
    }//GEN-LAST:event_btnIncluir_DadosActionPerformed

    private void btnExcluirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirDadosActionPerformed
        // TODO add your handling code here:
        
         if (tbUsuarios.getSelectedRow() != -1) {
             DefaultTableModel modelo = (DefaultTableModel) tbUsuarios.getModel();
             modelo.removeRow(tbUsuarios.getSelectedRow());
        }
        else
           if (tbUsuarios.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a Reunião Antes de Mandar Excluir!");
        }
        
    }//GEN-LAST:event_btnExcluirDadosActionPerformed
    
    public void visualizarRelatorioUsuario(){
        recebendoInformacoes();
        if (rcu == null) {
            rcu = new Relatorio_Cad_Usuario_Comum();
            //dispose();
            rcu.setVisible(true);
            rcu.pegarDados(listandoDados());
        }
    }
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisarDados();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        // TODO add your handling code here:
        //recebendoDados();
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        alterarDados();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu_Comum mc = new Menu_Comum();
        mc.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVisualizar_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizar_RActionPerformed
        // TODO add your handling code here:
        visualizarRelatorioUsuario();
    }//GEN-LAST:event_btnVisualizar_RActionPerformed
   
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
            java.util.logging.Logger.getLogger(Formulario_CadU_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_CadU_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_CadU_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_CadU_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_CadU_Comum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluirDados;
    private javax.swing.JButton btnIncluir_Dados;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVisualizar_R;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextArea txtArea1;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtConfcpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome_usuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtcpf;
    // End of variables declaration//GEN-END:variables
}
