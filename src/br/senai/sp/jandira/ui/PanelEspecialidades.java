/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;

    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDao.criarListaDeEspecialidades();
        ajustarTabela();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

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
        scrollEspecialidades.getAccessibleContext().setAccessibleDescription("");

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

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade que você deseja excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

    private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você tem certeza de que deseja excluir?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDao.excluir(getCodigo());
            preencherTabela();
        }

    }

    private void buttonEditarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadesActionPerformed

        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja editar.",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarEspecialidadesActionPerformed

    private void editarEspecialidade() {

        Especialidade especialidade = EspecialidadeDao.getEspecialidade(getCodigo());

        EspecialidadesDialog especialidadeDialog
                = new EspecialidadesDialog(null,
                        true,
                        especialidade,
                        OperacaoEnum.EDITAR);
        
        especialidadeDialog.setVisible(true);
        
        preencherTabela();
    }

    private void buttonAdicionarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadesActionPerformed
        EspecialidadesDialog especialidadesDialog = new EspecialidadesDialog(null,
                true,
                OperacaoEnum.ADICIONAR);
        
        especialidadesDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAdicionarEspecialidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidades;
    private javax.swing.JButton buttonEditarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDao.getTebelaEpecialidades());
        ajustarTabela();
    }

    private void ajustarTabela() {

        //Impedir que o usuario movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);

        //Definir tamanho das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(460);
    }
}
