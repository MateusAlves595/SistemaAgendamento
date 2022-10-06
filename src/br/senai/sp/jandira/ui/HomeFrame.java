/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282205
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png")));
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        painelEspecialidades = new javax.swing.JPanel();
        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonEditarEspecialidades = new javax.swing.JButton();
        buttonAdicionarEspecialidades = new javax.swing.JButton();

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame2.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("Z:\\agenda.png")); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 20, 40, 70);

        jFrame2.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 940, 90);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Sistema de Agendamento de Consultas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Sistema de Agendamento de Consultas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 10, 630, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 10, 70, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(850, 10, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 90);

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agendamento.png"))); // NOI18N
        jButton5.setText("Agenda");
        jButton5.setToolTipText("Novo agendamento");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 100, 120, 50);

        buttonPacientes.setBackground(new java.awt.Color(51, 204, 255));
        buttonPacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPacientes.setForeground(new java.awt.Color(255, 255, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPacientes.setText("Pacientes");
        buttonPacientes.setToolTipText("Cadastro de paciente");
        buttonPacientes.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(140, 100, 120, 50);

        buttonMedicos.setBackground(new java.awt.Color(51, 204, 255));
        buttonMedicos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMedicos.setForeground(new java.awt.Color(255, 255, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMedicos.setText("Médicos");
        buttonMedicos.setToolTipText("Cadastro de médicos");
        buttonMedicos.setBorder(new javax.swing.border.MatteBorder(null));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(270, 100, 110, 50);

        buttonEspecialidades.setBackground(new java.awt.Color(51, 204, 255));
        buttonEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/diploma.png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setToolTipText("Cadastro de especialidades");
        buttonEspecialidades.setBorder(new javax.swing.border.MatteBorder(null));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(390, 100, 140, 50);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(51, 204, 255));
        buttonPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPlanoDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        buttonPlanoDeSaude.setText("Plano de Saúde");
        buttonPlanoDeSaude.setToolTipText("Cadastro do seu plano de saúde");
        buttonPlanoDeSaude.setBorder(new javax.swing.border.MatteBorder(null));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(540, 100, 150, 50);

        buttonSair.setBackground(new java.awt.Color(255, 0, 51));
        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/saida-de-emergencia.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.setToolTipText("Sair da aplicação");
        buttonSair.setBorder(new javax.swing.border.MatteBorder(null));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(790, 100, 130, 50);

        painelEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)), "Especialidades médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        painelEspecialidades.setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollEspecialidades.setViewportView(tableEspecialidades);

        painelEspecialidades.add(scrollEspecialidades);
        scrollEspecialidades.setBounds(20, 30, 880, 290);

        buttonExcluirEspecialidades.setBackground(new java.awt.Color(255, 0, 51));
        buttonExcluirEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-apagar.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir");
        buttonExcluirEspecialidades.setBorder(new javax.swing.border.MatteBorder(null));
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        painelEspecialidades.add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(670, 330, 70, 60);

        buttonEditarEspecialidades.setBackground(new java.awt.Color(0, 0, 153));
        buttonEditarEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEditarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar-arquivo.png"))); // NOI18N
        buttonEditarEspecialidades.setToolTipText("Editar");
        buttonEditarEspecialidades.setBorder(new javax.swing.border.MatteBorder(null));
        buttonEditarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadesActionPerformed(evt);
            }
        });
        painelEspecialidades.add(buttonEditarEspecialidades);
        buttonEditarEspecialidades.setBounds(750, 330, 70, 60);

        buttonAdicionarEspecialidades.setBackground(new java.awt.Color(0, 255, 0));
        buttonAdicionarEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAdicionarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarEspecialidades.setToolTipText("Adicionar");
        buttonAdicionarEspecialidades.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAdicionarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadesActionPerformed(evt);
            }
        });
        painelEspecialidades.add(buttonAdicionarEspecialidades);
        buttonAdicionarEspecialidades.setBounds(830, 330, 70, 60);

        getContentPane().add(painelEspecialidades);
        painelEspecialidades.setBounds(10, 160, 920, 400);

        setSize(new java.awt.Dimension(956, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonAdicionarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarEspecialidadesActionPerformed

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

    private void buttonEditarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarEspecialidadesActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidades;
    private javax.swing.JButton buttonEditarEspecialidades;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel painelEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){
        
        String[][] dados = {
            {"100", "Jandira", "SP"},
            {"200", "Itapevi", "SP"},
            {"300", "Cotia", "SP"},
            {"400", "Barueri", "SP"},
            {"500", "Curitiba", "SP"},
            {"600", "Fortaleza", "SP"},
        };
        
        String[] titulos = {"CODIGO", "NOME DA CIDADE", "ESTADO"};
        
        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
        
        tableEspecialidades.setModel(modelo);
    }
    
}
