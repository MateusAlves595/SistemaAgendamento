package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelPlanoDeSaude extends javax.swing.JPanel {

    private int linha;
    
    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDao.criarListaDePlanosDeSaude();
        preencherTabela();
    }
    
     private int getLinha() {
        linha = tablePlanoDeSaude.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanoDeSaude = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        setLayout(null);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanoDeSaude.setViewportView(tablePlanoDeSaude);

        add(scrollPlanoDeSaude);
        scrollPlanoDeSaude.setBounds(20, 30, 880, 290);

        buttonExcluirPlanoDeSaude.setBackground(new java.awt.Color(255, 0, 51));
        buttonExcluirPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-apagar.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir");
        buttonExcluirPlanoDeSaude.setBorder(new javax.swing.border.MatteBorder(null));
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(670, 330, 70, 60);

        buttonEditarPlanoDeSaude.setBackground(new java.awt.Color(0, 0, 153));
        buttonEditarPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar-arquivo.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar");
        buttonEditarPlanoDeSaude.setBorder(new javax.swing.border.MatteBorder(null));
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(750, 330, 70, 60);

        buttonAdicionarPlanoDeSaude.setBackground(new java.awt.Color(0, 255, 0));
        buttonAdicionarPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar");
        buttonAdicionarPlanoDeSaude.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAdicionarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(830, 330, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
        if(getLinha() != -1) {
            excluirPlanoDeSaude();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o Plano que você deseja excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
        private void excluirPlanoDeSaude() {
            
            int resposta = JOptionPane.showConfirmDialog(
                    this,
                    "Você confirma a exclusão?",
                    "Atenção",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
            if(resposta == 0) {
                PlanoDeSaudeDao.excluir(getCodigo());
                preencherTabela();
            }
        
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed

        if (getLinha() != -1) {
            editarPlanoDeSaude();
            
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você deseja editar.",
                    "Plano de Saúde",
                    JOptionPane.WARNING_MESSAGE);
        }
    }                                                          

    private void editarPlanoDeSaude() {

        PlanoDeSaude planoDeSaude = PlanoDeSaudeDao.getPlanoDeSaude(getCodigo());

        PlanoDeSaudeDialog planoDeSaudeDialog
                = new PlanoDeSaudeDialog(null,
                        true,
                        planoDeSaude,
                        OperacaoEnum.EDITAR);
        
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    
    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null,
            true,
            OperacaoEnum.ADICIONAR);

        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JScrollPane scrollPlanoDeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables

    
    private void preencherTabela() {
        tablePlanoDeSaude.setModel(PlanoDeSaudeDao.getTabelaPlanoDeSaude());
        ajustarTabela();
    }
    
    private void ajustarTabela() {
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);
        
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(3).setPreferredWidth(250);
        tablePlanoDeSaude.getColumnModel().getColumn(4).setPreferredWidth(210);
    }

}
