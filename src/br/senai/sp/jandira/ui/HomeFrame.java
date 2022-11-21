/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import java.awt.Toolkit;


public class HomeFrame extends javax.swing.JFrame {

   
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png")));
        initPanels();
        
    }
    
    //atributos da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanoDeSaude panelPlanoDeSaude;
    PanelMedico panelMedico;
    
    //Constantes
    private final int POS_X = 10;
    private final int POS_Y = 160;
    private final int LARGURA = 920;
    private final int ALTURA = 400;
    
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
        buttonHome = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

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

        buttonHome.setBackground(new java.awt.Color(51, 204, 255));
        buttonHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home32.png"))); // NOI18N
        buttonHome.setToolTipText("Novo agendamento");
        buttonHome.setBorder(new javax.swing.border.MatteBorder(null));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 100, 90, 50);

        buttonAgenda.setBackground(new java.awt.Color(51, 204, 255));
        buttonAgenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAgenda.setForeground(new java.awt.Color(255, 255, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agendamento.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.setToolTipText("Novo agendamento");
        buttonAgenda.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(110, 100, 120, 50);

        buttonPacientes.setBackground(new java.awt.Color(51, 204, 255));
        buttonPacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPacientes.setForeground(new java.awt.Color(255, 255, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPacientes.setText("Pacientes");
        buttonPacientes.setToolTipText("Cadastro de paciente");
        buttonPacientes.setBorder(new javax.swing.border.MatteBorder(null));
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(240, 100, 120, 50);

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
        buttonMedicos.setBounds(370, 100, 110, 50);

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
        buttonEspecialidades.setBounds(490, 100, 140, 50);

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
        buttonPlanoDeSaude.setBounds(640, 100, 150, 50);

        buttonSair.setBackground(new java.awt.Color(255, 0, 51));
        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/saida-de-emergencia.png"))); // NOI18N
        buttonSair.setToolTipText("Sair da aplicação");
        buttonSair.setBorder(new javax.swing.border.MatteBorder(null));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(860, 100, 60, 50);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("SISACON");
        panelHome.add(jLabel6);
        jLabel6.setBounds(20, 60, 160, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel7);
        jLabel7.setBounds(20, 100, 340, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Dados para contato:");
        panelHome.add(jLabel8);
        jLabel8.setBounds(730, 180, 170, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(jLabel9);
        jLabel9.setBounds(700, 210, 200, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Telefone: (11)94763-5366");
        panelHome.add(jLabel10);
        jLabel10.setBounds(730, 240, 170, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Site: www.sisacon.com.br");
        panelHome.add(jLabel11);
        jLabel11.setBounds(740, 270, 160, 20);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        panelHome.add(jPanel2);
        jPanel2.setBounds(20, 140, 880, 10);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 160, 920, 400);

        setSize(new java.awt.Dimension(956, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(true);
        panelPlanoDeSaude.setVisible(false);
        panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelPlanoDeSaude.setVisible(true);
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        panelMedico.setVisible(true);
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        
    }//GEN-LAST:event_buttonPacientesActionPerformed

    /**
     * @ram args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA,
                ALTURA);
        
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        panelPlanoDeSaude = new PanelPlanoDeSaude();
        panelPlanoDeSaude.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA,
                ALTURA);
        
        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);
        
        panelMedico = new PanelMedico();
        panelMedico.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA,
                ALTURA);
        
        getContentPane().add(panelMedico);
        panelMedico.setVisible(false);
    }
    

    

}
