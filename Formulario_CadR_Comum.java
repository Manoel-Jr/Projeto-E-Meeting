/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Modelos.Cad_Reuniao;
import Modelos.SalaR_Comum;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelos.Cad_Reuniao;

/**
 *
 * @author junior
 */
public class Formulario_CadR_Comum extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Cad_Reuniao  cadr = new Cad_Reuniao();
    SalaR_Comum sala = new SalaR_Comum();
    Relatorio_Presença_Reunioes visuP;
    private String local;
    
    //DefaultTableModel modelo;
    
    //Criaando arraylist da classe 'Classe_reuniao_Comum'
     ArrayList<Cad_Reuniao> listaR = new ArrayList<>();
     
     
     //instanciando objetos como null.
     Relatorio_Cad_Reuniao_Comum cdr;
     
     
    /**
     * Creates new form Cadastrar_Reuniao
     */
    public Formulario_CadR_Comum() {
        initComponents();
        
        this.setLocationRelativeTo(null);//Centralizando  Tela.
        
        
    }
    
    //Percorrendo arraylist retornando o ToString
    public String dados(){
        
        String add = "";
        
        for( Cad_Reuniao cadR : listaR){
            
            add += cadR;
        }
        
        return add;
    }
    
    //faz alteração  se caso os campos não esteja vazios, caso contrario ele retorna uma mensagem
    public void alterarDados(){
         
        recebendoInformacoes();
        
        if (cadr.getPauta().equals("") && cadr.getAta().equals("") && cadr.getTema().equals("") && cadr.getnP().equals("") && cadr.getProprietario().equals("") && cadr.getPresenca().equals("") && cadr.getDia().equals("") && cadr.getHora().equals("") && cadr.getHoraFim().equals("") && cadr.getSugestao().equals("") && cadr.getSala().equals("")) {
              JOptionPane.showMessageDialog(null, "Campos estão Vazios!");
            }
        
        if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario().equals("sim") && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "") {
            TbReuniao.setValueAt(txtPauta.getText(), TbReuniao.getSelectedRow(),0);
            TbReuniao.setValueAt(txtAta.getText(), TbReuniao.getSelectedRow(),1);
            TbReuniao.setValueAt(txtTema.getText(), TbReuniao.getSelectedRow(),2);
            TbReuniao.setValueAt(txtnP.getText(), TbReuniao.getSelectedRow(),3);
            TbReuniao.setValueAt(txtProprietario.getText(), TbReuniao.getSelectedRow(),4);
            TbReuniao.setValueAt(txtPresenca.getText(), TbReuniao.getSelectedRow(),5);
            TbReuniao.setValueAt(txtDia.getText(), TbReuniao.getSelectedRow(),6);
            TbReuniao.setValueAt(txtHora.getText(), TbReuniao.getSelectedRow(),7);
            TbReuniao.setValueAt(txtHora_Fim.getText(), TbReuniao.getSelectedRow(),8);
            TbReuniao.setValueAt(txtSugestao.getText(), TbReuniao.getSelectedRow(),9);
            TbReuniao.setValueAt(txtRecebeSala.getText(),TbReuniao.getSelectedRow(),10);
            JOptionPane.showMessageDialog(null, "Dado Alterado com Sucesso!!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não e Proprietario!");
        }
       
    }
    
    public void recebendoInformacoes(){
        
        cadr.setPauta(txtPauta.getText());
        cadr.setAta(txtAta.getText());
        cadr.setTema(txtTema.getText());
        cadr.setnP(txtnP.getText());
        cadr.setProprietario(txtProprietario.getText());
        cadr.setPresenca(txtPresenca.getText());
        cadr.setDia(txtDia.getText());
        cadr.setHora(txtHora.getText());
        cadr.setHoraFim(txtHora_Fim.getText());
        cadr.setSugestao(txtSugestao.getText());
        cadr.setSala(txtRecebeSala.getText());
    }
    /*
    faz validação do campo cadastro de sala enviando uma sala não cadastrada,
    se caso o usuario quizer cadastrar uma sala que ja foi reservada , o mesmo 
    retorna uma mensagem informando que a sala ja foi reservada.
   */
    public void receberDados(){
       
        sala.setNomeSala(txtCadSala.getText());
        
        if (sala.getNomeSala().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Cadastro de Sala Está Vazio!");
        }
        else
          if(sala.getNomeSala().equals(txtRecebeSala.getText())){
            JOptionPane.showMessageDialog(null, sala.getNomeSala()+" já esta Reservada!");
        }
        
        if (sala.getNomeSala() != "") {
            txtRecebeSala.setText(sala.getNomeSala());
        }
        txtCadSala.setText("");
        
    }
    
    public void confirmarLocal(String local){
        local = txtSugestao.getText();
        
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TbReuniao = new javax.swing.JTable();
        btnVisualizarReunioes = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnIncluirSala = new javax.swing.JButton();
        txtCadSala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPauta = new javax.swing.JTextField();
        txtAta = new javax.swing.JTextField();
        txtTema = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRecebeSala = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtProprietario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPresenca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHora_Fim = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSugestao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TbReuniao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pauta", "Ata", "Tema", "Nº Pessoas", "Proprietario", "Presença", "Dia", "Hora DE Inicio", "Hora de Termino", "Sugestão de LOcal de Reunião", "Sala"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbReuniao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbReuniaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbReuniao);

        btnVisualizarReunioes.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVisualizarReunioes.setText("Vusualizar Reuniões");
        btnVisualizarReunioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarReunioesActionPerformed(evt);
            }
        });

        btnVisualizar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVisualizar.setText("Visualizar Relatorio");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnIncluir.setText("Incluir Dados");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAlterar.setText("Alterar Dados");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnExcluir.setText("Excluir Dados");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel15.setText("Cadastrar Sala");

        jLabel1.setText("Sala:");

        btnIncluirSala.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnIncluirSala.setText("Incluir Sala");
        btnIncluirSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirSalaActionPerformed(evt);
            }
        });

        jLabel2.setText("Pauta:");

        jLabel3.setText("Ata:");

        jLabel4.setText("Tema:");

        jLabel5.setText("Sala:");

        jLabel6.setText("NªPessoas");

        jLabel7.setText("Proprietario?");

        jLabel8.setText("Presença:");

        jLabel9.setText("Dia:");

        jLabel10.setText("Hora/Inicio:");

        jLabel11.setText("Hora/Fim:");

        jLabel12.setText("Sugestão L.");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel13.setText("Cadastrar Reunião");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtCadSala, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(btnIncluirSala)))
                            .addComponent(btnVisualizarReunioes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtAta)
                                                .addComponent(txtPauta, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTema, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtnP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtHora_Fim, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                    .addComponent(txtHora)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDia)
                                                        .addComponent(txtPresenca)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(31, 31, 31)
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtRecebeSala, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnVisualizar)
                                        .addGap(54, 54, 54)
                                        .addComponent(btnIncluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtSugestao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(jLabel13)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCadSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnIncluirSala))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtSugestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtRecebeSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtHora_Fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizar)
                    .addComponent(btnIncluir)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnAlterar)
                    .addComponent(btnVisualizarReunioes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        
        alterarDados();//Invocando metodo.
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
        excluirDados();//Invocando metodo.
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void TbReuniaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbReuniaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TbReuniaoMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        
        LimparCampos();//Invocando metodo.
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVisualizarReunioesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarReunioesActionPerformed
        // TODO add your handling code here:
        visualizarReunioesP();
     
    }//GEN-LAST:event_btnVisualizarReunioesActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
        
        VisualizarDados();//Invocando metodo.
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        
        //fecha a tela onde foi selecionado a Opção e retorna para o menu.
        dispose();
        Menu_Comum menu = new Menu_Comum();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        
        //Invocando metodos.
        validarCadastroR();
        recebeObjetoR();
       
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnIncluirSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirSalaActionPerformed
        // TODO add your handling code here:
        receberDados();
    }//GEN-LAST:event_btnIncluirSalaActionPerformed
    
    // Exclui dados  da tabela se a linha da tabela for selecionada, caso contrario
    // Retorna uma mensagem pedindo para selecionar.
    public void excluirDados(){
       
       if (TbReuniao.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) TbReuniao.getModel();
            modelo.removeRow(TbReuniao.getSelectedRow());
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um Reunião e Exclua!");
        }
    }
    
    //Adcionando os campos dentro do arraylist ListaR.
    public void recebeObjetoR(){
        
        recebendoInformacoes();
        listaR.add(cadr);
    }
    
    public void visualizarReunioesP(){
        
        recebendoInformacoes();
        
        if (visuP == null && cadr.getPresenca().equals("sim")) {
            visuP = new Relatorio_Presença_Reunioes();
            visuP.setVisible(true);
            visuP.receberRelatorio(dados());
        }
    }
    /*
     Instancia um Objeto que recebe todos os campos digitados pelo Usuario
     valida essas informações se os campos tiverem preenchidos ele joga essas informações
     dentro da tabela se não ele retorna uma mensagem.
    */
    public void validarCadastroR(){
        
        recebendoInformacoes();
        
        if (cadr.getPauta().equals("") && cadr.getAta().equals("") && cadr.getTema().equals("") && cadr.getnP().equals("") && cadr.getProprietario().equals("") && cadr.getPresenca().equals("") && cadr.getDia().equals("") && cadr.getHora().equals("") && cadr.getHoraFim().equals("") && cadr.getSugestao().equals("") && cadr.getSala().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os Campos!");
        }
        else
           if (cadr.getPauta().equals("") && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Preencha a Palta!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta().equals("") && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Preencha a Ata!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema().equals("") && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Preencha o Tema!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP().equals("") && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Numero de Participantes!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario().equals("") && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Informe o Proprietario");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca().equals("") && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Campo Presença em Reunião esta vazio!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia().equals("") && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Campo Dia esta vazio!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora().equals("")&& cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Campo Hora do Inicio da Reunião esta vazio!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim().equals("") && cadr.getSugestao() != "" && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Campo Horario do Fim da Reunião esta vazio!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao().equals("") && cadr.getSala() != "") {
            JOptionPane.showMessageDialog(null, "Campo Sugestão de Local esta vazio!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "" && cadr.getSala().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Sala esta vazio!");
        }
        else
           if (cadr.getPauta() != "" && cadr.getAta() != "" && cadr.getTema() != "" && cadr.getnP() != "" && cadr.getProprietario() != "" && cadr.getPresenca() != "" && cadr.getDia() != "" && cadr.getHora() != "" && cadr.getHoraFim() != "" && cadr.getSugestao() != "") {
               modelo = (DefaultTableModel) TbReuniao.getModel();
               Object[] dados = {cadr.getPauta(),cadr.getAta(),cadr.getTema(),cadr.getnP(),
               cadr.getProprietario(), cadr.getPresenca(),cadr.getDia(),
               cadr.getHora(),cadr.getHoraFim(),cadr.getSugestao(),cadr.getSala()};
               modelo.addRow(dados);
               JOptionPane.showMessageDialog(null, "Cadastro de Reunião Realizado com Sucesso!!");
            }
        
        
    }
   
    //Limpa todos os campos.
    public void LimparCampos(){
        txtPauta.setText("");
        txtAta.setText("");
        txtDia.setText("");
        txtHora.setText("");
        txtHora_Fim.setText("");
        txtPresenca.setText("");
        txtTema.setText("");
        txtProprietario.setText("");
        txtnP.setText("");
        txtSugestao.setText("");
        txtRecebeSala.setText("");
        txtCadSala.setText("");
    }
    
    /*
     
    */
    
   
    
    // Se obejto cdr for nulo ele vai chama uma jframe e vai exibir meu ToString
    // referente ao meu cadastro de reunião
    public void VisualizarDados(){
            
       if(cdr == null){
          cdr = new Relatorio_Cad_Reuniao_Comum();
          cdr.setVisible(true);
          cdr.pegarR(dados());
        }
    }
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
            java.util.logging.Logger.getLogger(Formulario_CadR_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_CadR_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_CadR_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_CadR_Comum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_CadR_Comum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbReuniao;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluirSala;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVisualizarReunioes;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAta;
    private javax.swing.JTextField txtCadSala;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHora_Fim;
    private javax.swing.JTextField txtPauta;
    private javax.swing.JTextField txtPresenca;
    private javax.swing.JTextField txtProprietario;
    private javax.swing.JTextField txtRecebeSala;
    private javax.swing.JTextField txtSugestao;
    private javax.swing.JTextField txtTema;
    private javax.swing.JTextField txtnP;
    // End of variables declaration//GEN-END:variables
}
