/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;
    
    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacaoEnum) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        labelDescricaoDaEspecialidade = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomeDaEspecialidade = new javax.swing.JTextField();
        textFieldDescricaoDaEspecialidade = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelDescricaoDaEspecialidade1 = new javax.swing.JLabel();
        textFieldDescricaoDaEspecialidade1 = new javax.swing.JTextField();
        labelDescricaoDaEspecialidade2 = new javax.swing.JLabel();
        textFieldDescricaoDaEspecialidade2 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("Plano de Saúde - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(20, 10, 300, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 69);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do plano de saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(20, 30, 70, 30);

        labelNomeDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeDaEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        labelNomeDaEspecialidade.setText("Número:");
        jPanel2.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(20, 100, 210, 30);

        labelDescricaoDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDescricaoDaEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        labelDescricaoDaEspecialidade.setText("Categoria:");
        jPanel2.add(labelDescricaoDaEspecialidade);
        labelDescricaoDaEspecialidade.setBounds(390, 110, 190, 30);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 60, 120, 30);

        textFieldNomeDaEspecialidade.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDaEspecialidade);
        textFieldNomeDaEspecialidade.setBounds(20, 130, 190, 30);

        textFieldDescricaoDaEspecialidade.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldDescricaoDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldDescricaoDaEspecialidade);
        textFieldDescricaoDaEspecialidade.setBounds(390, 140, 190, 30);

        buttonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.setBorder(new javax.swing.border.MatteBorder(null));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(510, 270, 70, 60);

        buttonSalvar.setBackground(new java.awt.Color(102, 153, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.setBorder(new javax.swing.border.MatteBorder(null));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(600, 270, 70, 60);

        labelDescricaoDaEspecialidade1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDescricaoDaEspecialidade1.setForeground(new java.awt.Color(0, 0, 0));
        labelDescricaoDaEspecialidade1.setText("Operadora:");
        jPanel2.add(labelDescricaoDaEspecialidade1);
        labelDescricaoDaEspecialidade1.setBounds(20, 170, 190, 30);

        textFieldDescricaoDaEspecialidade1.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldDescricaoDaEspecialidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoDaEspecialidade1ActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldDescricaoDaEspecialidade1);
        textFieldDescricaoDaEspecialidade1.setBounds(20, 200, 190, 30);

        labelDescricaoDaEspecialidade2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDescricaoDaEspecialidade2.setForeground(new java.awt.Color(0, 0, 0));
        labelDescricaoDaEspecialidade2.setText("Categoria:");
        jPanel2.add(labelDescricaoDaEspecialidade2);
        labelDescricaoDaEspecialidade2.setBounds(390, 30, 190, 30);

        textFieldDescricaoDaEspecialidade2.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldDescricaoDaEspecialidade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoDaEspecialidade2ActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldDescricaoDaEspecialidade2);
        textFieldDescricaoDaEspecialidade2.setBounds(390, 60, 190, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 710, 370);

        setSize(new java.awt.Dimension(746, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaEspecialidadeActionPerformed

    private void textFieldDescricaoDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescricaoDaEspecialidadeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
       
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldDescricaoDaEspecialidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoDaEspecialidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescricaoDaEspecialidade1ActionPerformed

    private void textFieldDescricaoDaEspecialidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoDaEspecialidade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescricaoDaEspecialidade2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoDaEspecialidade;
    private javax.swing.JLabel labelDescricaoDaEspecialidade1;
    private javax.swing.JLabel labelDescricaoDaEspecialidade2;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoDaEspecialidade;
    private javax.swing.JTextField textFieldDescricaoDaEspecialidade1;
    private javax.swing.JTextField textFieldDescricaoDaEspecialidade2;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
