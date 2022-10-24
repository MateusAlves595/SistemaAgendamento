/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

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
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        
        planoDeSaude = p;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
    }
    
    private void preencherFormulario() {
         
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldNumeroDoPlano.setText(planoDeSaude.getNumero());
        textFieldOperadoraDoPlano.setText(planoDeSaude.getOperadora());
        textFieldCategoriaDoPlano.setText(planoDeSaude.getCategoria());
        textFieldValidadeDoPlano.setText(planoDeSaude.getValidade().toString());
    }
    
    private void preencherTitulo() {
        labelTitulo.setText("Plano de Saúde - " + operacao);
        
        if(operacao == OperacaoEnum.ADICIONAR.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar-arquivo.png")));
        }else{
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png")));
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        textFieldNumeroDoPlano = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadoraDoPlano = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        textFieldCategoriaDoPlano = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textFieldValidadeDoPlano = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

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

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 60, 120, 30);

        labelNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(0, 0, 0));
        labelNumero.setText("Número:");
        jPanel2.add(labelNumero);
        labelNumero.setBounds(20, 100, 210, 30);

        textFieldNumeroDoPlano.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldNumeroDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNumeroDoPlano);
        textFieldNumeroDoPlano.setBounds(20, 130, 190, 30);

        labelOperadora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelOperadora.setForeground(new java.awt.Color(0, 0, 0));
        labelOperadora.setText("Operadora:");
        jPanel2.add(labelOperadora);
        labelOperadora.setBounds(20, 170, 190, 30);

        textFieldOperadoraDoPlano.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldOperadoraDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldOperadoraDoPlano);
        textFieldOperadoraDoPlano.setBounds(20, 200, 190, 30);

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCategoria.setForeground(new java.awt.Color(0, 0, 0));
        labelCategoria.setText("Categoria:");
        jPanel2.add(labelCategoria);
        labelCategoria.setBounds(390, 30, 190, 30);

        textFieldCategoriaDoPlano.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldCategoriaDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoriaDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCategoriaDoPlano);
        textFieldCategoriaDoPlano.setBounds(390, 60, 190, 30);

        labelValidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelValidade.setForeground(new java.awt.Color(0, 0, 0));
        labelValidade.setText("Validade:");
        jPanel2.add(labelValidade);
        labelValidade.setBounds(390, 110, 190, 30);

        textFieldValidadeDoPlano.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldValidadeDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadeDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldValidadeDoPlano);
        textFieldValidadeDoPlano.setBounds(390, 140, 190, 30);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 710, 370);

        setSize(new java.awt.Dimension(746, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNumeroDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroDoPlanoActionPerformed

    private void textFieldValidadeDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadeDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadeDoPlanoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
       if(operacao == OperacaoEnum.ADICIONAR){
           adicionar();
       }else{
           editar();
       }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldOperadoraDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraDoPlanoActionPerformed

    private void textFieldCategoriaDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCategoriaDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCategoriaDoPlanoActionPerformed

    private void adicionar() {
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setNumero(textFieldNumeroDoPlano.getText());
        novoPlanoDeSaude.setOperadora(textFieldOperadoraDoPlano.getText());
        novoPlanoDeSaude.setCategoria(textFieldCategoriaDoPlano.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidadeDoPlano.getText(), DateTimeFormatter.ISO_DATE));
        
        PlanoDeSaudeDao.gravar(novoPlanoDeSaude);
        JOptionPane.showMessageDialog(this,
                "Plano de Saúde Adicionado com sucesso",
                "Plano De Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void editar(){
        planoDeSaude.setNumero(textFieldNumeroDoPlano.getText());
        planoDeSaude.setOperadora(textFieldOperadoraDoPlano.getText());
        planoDeSaude.setCategoria(textFieldCategoriaDoPlano.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidadeDoPlano.getText(), DateTimeFormatter.ISO_DATE));
        
        PlanoDeSaudeDao.atualizar(planoDeSaude);
        
        JOptionPane.showMessageDialog(null,
                "Plano de Saúde atualizado com sucesso", 
                "Plano De Sáude",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JTextField textFieldCategoriaDoPlano;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNumeroDoPlano;
    private javax.swing.JTextField textFieldOperadoraDoPlano;
    private javax.swing.JTextField textFieldValidadeDoPlano;
    // End of variables declaration//GEN-END:variables
}
