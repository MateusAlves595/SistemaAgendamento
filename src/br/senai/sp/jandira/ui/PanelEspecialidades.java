/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282205
 */
public class PanelEspecialidades extends javax.swing.JPanel {

    /**
     * Creates new form PanelEspecialidades
     */
    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDao.criarListaDeEspecialidades();
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

        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonEditarEspecialidades = new javax.swing.JButton();
        buttonAdicionarEspecialidades = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        setPreferredSize(new java.awt.Dimension(920, 400));
        setLayout(null);

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

        add(scrollEspecialidades);
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
        add(buttonExcluirEspecialidades);
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
        add(buttonEditarEspecialidades);
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
        add(buttonAdicionarEspecialidades);
        buttonAdicionarEspecialidades.setBounds(830, 330, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

    private void buttonEditarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarEspecialidadesActionPerformed

    private void buttonAdicionarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadesActionPerformed
        EspecialidadesDialog d = new EspecialidadesDialog(null, true);
        d.setVisible(true);
    }//GEN-LAST:event_buttonAdicionarEspecialidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidades;
    private javax.swing.JButton buttonEditarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){
        
        tableEspecialidades.setModel(EspecialidadeDao.getTebelaEpecialidades());
    }
}