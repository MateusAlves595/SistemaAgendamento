package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {

    public PanelMedico() {
        initComponents();
        MedicoDao.criarListaDeMedicos();
        preencherTabela();
    }

    private int linha;

    private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonExcluirMedico = new javax.swing.JButton();
        buttonEditarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();
        scrollMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(920, 400));
        setLayout(null);

        buttonExcluirMedico.setBackground(new java.awt.Color(255, 0, 51));
        buttonExcluirMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-apagar.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir");
        buttonExcluirMedico.setBorder(new javax.swing.border.MatteBorder(null));
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(670, 330, 70, 60);

        buttonEditarMedico.setBackground(new java.awt.Color(0, 0, 153));
        buttonEditarMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar-arquivo.png"))); // NOI18N
        buttonEditarMedico.setToolTipText("Editar");
        buttonEditarMedico.setBorder(new javax.swing.border.MatteBorder(null));
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        add(buttonEditarMedico);
        buttonEditarMedico.setBounds(750, 330, 70, 60);

        buttonAdicionarMedico.setBackground(new java.awt.Color(0, 255, 0));
        buttonAdicionarMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar");
        buttonAdicionarMedico.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(830, 330, 70, 60);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollMedicos.setViewportView(tableMedicos);

        add(scrollMedicos);
        scrollMedicos.setBounds(20, 30, 880, 290);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed

        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o(a) medico(a) que você deseja excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void excluirMedico() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você tem certeza de que deseja excluir?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDao.excluir(getCodigo());
            preencherTabela();
        }
    }
    
    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed
       if (getLinha() != -1) {
            editarMedico();
            
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você deseja editar.",
                    "Plano de Saúde",
                    JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_buttonEditarMedicoActionPerformed

    private void editarMedico() {
        Medico medico = MedicoDao.getMedico(getCodigo());

        MedicoDialog medicoDialog
                = new MedicoDialog(null,
                        true,
                        medico,
                        OperacaoEnum.EDITAR);
        
        medicoDialog.setVisible(true);
        preencherTabela();
       }
    
    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed
        MedicoDialog medicoDialog = new MedicoDialog(null,
            true,
            OperacaoEnum.ADICIONAR);

        medicoDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JScrollPane scrollMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        tableMedicos.setModel(MedicoDao.getTabelaMedicos());
        ajustarTabela();
    }

    private void ajustarTabela() {
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        tableMedicos.setDefaultEditor(Object.class, null);

        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(400);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(260);
    }

}
