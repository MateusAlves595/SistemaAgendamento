package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;
    

    public MedicoDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        preencherListaEspecialidades();
        
    }

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        medico = m;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private MedicoDialog(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void preencherFormulario() {

        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCrm.setText(medico.getCrm());
        textFieldNomeDoMedico.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefone());
        textFieldEmail.setText(medico.getEmail());
        textFieldDataNascimento.setText(medico.getDataDeNascimento().toString());
    }

    private void preencherTitulo() {
        labelTitulo.setText("Médico - " + operacao);

        if (operacao == OperacaoEnum.ADICIONAR.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar-arquivo.png")));
        } else {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelCrm = new javax.swing.JLabel();
        textFieldCrm = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelDataNascimento = new javax.swing.JLabel();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        labelEspecialidadesDoMedico = new javax.swing.JLabel();
        scrollListaDeEspecialidades = new javax.swing.JScrollPane();
        listListaDeEspecialidades = new javax.swing.JList<>();
        scrollEspecialidadesDoMedico = new javax.swing.JScrollPane();
        listListaDeEspecialidadesDoMedico = new javax.swing.JList<>();
        botaoVerde = new javax.swing.JButton();
        botaoVermelho = new javax.swing.JButton();
        textFieldDataNascimento = new javax.swing.JFormattedTextField();
        botaoSalvarMedico = new javax.swing.JButton();
        botaoCancelarMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("Médico - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(20, 10, 410, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) Médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCodigo.setText("Código :");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(20, 30, 80, 20);

        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 60, 100, 30);

        labelCrm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCrm.setText("CRM :");
        jPanel2.add(labelCrm);
        labelCrm.setBounds(140, 30, 50, 20);
        jPanel2.add(textFieldCrm);
        textFieldCrm.setBounds(140, 60, 110, 30);

        labelNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeDoMedico.setText("Nome do(a) médico(a) :");
        jPanel2.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(270, 30, 170, 20);
        jPanel2.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(270, 60, 610, 30);

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefone.setText("Telefone :");
        jPanel2.add(labelTelefone);
        labelTelefone.setBounds(20, 120, 80, 20);
        jPanel2.add(textFieldTelefone);
        textFieldTelefone.setBounds(20, 150, 180, 30);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmail.setText("E-Mail :");
        jPanel2.add(labelEmail);
        labelEmail.setBounds(220, 120, 60, 20);
        jPanel2.add(textFieldEmail);
        textFieldEmail.setBounds(220, 150, 390, 30);

        labelDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataNascimento.setText("Data Nascimento :");
        jPanel2.add(labelDataNascimento);
        labelDataNascimento.setBounds(630, 120, 130, 20);

        labelListaDeEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelListaDeEspecialidades.setText("Lista de Especialidades :");
        jPanel2.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(20, 220, 170, 20);

        labelEspecialidadesDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEspecialidadesDoMedico.setText("Especialidades do médico :");
        jPanel2.add(labelEspecialidadesDoMedico);
        labelEspecialidadesDoMedico.setBounds(380, 220, 190, 20);

        scrollListaDeEspecialidades.setViewportView(listListaDeEspecialidades);

        jPanel2.add(scrollListaDeEspecialidades);
        scrollListaDeEspecialidades.setBounds(20, 250, 240, 180);

        scrollEspecialidadesDoMedico.setViewportView(listListaDeEspecialidadesDoMedico);

        jPanel2.add(scrollEspecialidadesDoMedico);
        scrollEspecialidadesDoMedico.setBounds(380, 250, 260, 180);

        botaoVerde.setBackground(new java.awt.Color(0, 153, 0));
        botaoVerde.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        botaoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/right-arrow.png"))); // NOI18N
        botaoVerde.setBorder(new javax.swing.border.MatteBorder(null));
        botaoVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerdeActionPerformed(evt);
            }
        });
        jPanel2.add(botaoVerde);
        botaoVerde.setBounds(280, 260, 80, 70);

        botaoVermelho.setBackground(new java.awt.Color(255, 0, 0));
        botaoVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/left-arrow.png"))); // NOI18N
        botaoVermelho.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(botaoVermelho);
        botaoVermelho.setBounds(280, 350, 80, 70);
        jPanel2.add(textFieldDataNascimento);
        textFieldDataNascimento.setBounds(630, 150, 250, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 910, 460);

        botaoSalvarMedico.setBackground(new java.awt.Color(0, 204, 51));
        botaoSalvarMedico.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarMedico.setText("Salvar");
        botaoSalvarMedico.setBorder(new javax.swing.border.MatteBorder(null));
        botaoSalvarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarMedico);
        botaoSalvarMedico.setBounds(780, 570, 130, 50);

        botaoCancelarMedico.setBackground(new java.awt.Color(255, 255, 51));
        botaoCancelarMedico.setForeground(new java.awt.Color(0, 0, 0));
        botaoCancelarMedico.setText("Cancelar");
        botaoCancelarMedico.setBorder(new javax.swing.border.MatteBorder(null));
        botaoCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelarMedico);
        botaoCancelarMedico.setBounds(640, 570, 130, 50);

        setBounds(0, 0, 943, 672);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarMedicoActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarMedicoActionPerformed

    private void botaoSalvarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarMedicoActionPerformed
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        } else{
            editar();
        }      
    }//GEN-LAST:event_botaoSalvarMedicoActionPerformed

    private void botaoVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerdeActionPerformed
        DefaultListModel especialidades = new DefaultListModel();
        DefaultListModel especialidadesMedicos = new DefaultListModel();
    }//GEN-LAST:event_botaoVerdeActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MedicoDialog dialog = new MedicoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarMedico;
    private javax.swing.JButton botaoSalvarMedico;
    private javax.swing.JButton botaoVerde;
    private javax.swing.JButton botaoVermelho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesDoMedico;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<Especialidade> listListaDeEspecialidades;
    private javax.swing.JList<Especialidade> listListaDeEspecialidadesDoMedico;
    private javax.swing.JScrollPane scrollEspecialidadesDoMedico;
    private javax.swing.JScrollPane scrollListaDeEspecialidades;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JFormattedTextField textFieldDataNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables

    private void editar() {
        medico.setCrm(textFieldCrm.getText());
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataDeNascimento(LocalDate.parse(
                textFieldDataNascimento.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        MedicoDao.atualizar(medico);

        JOptionPane.showMessageDialog(null,
                "Medico(a) atualizado(a) com sucesso",
                "Médico", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void adicionar() {
        //Criar objeto especialidade
        Medico novoMedico = new Medico();
        novoMedico.setCrm(textFieldCrm.getText());
        novoMedico.setNome(textFieldNomeDoMedico.getText());
        novoMedico.setTelefone(textFieldTelefone.getText());
        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setDataDeNascimento(LocalDate.parse(
                textFieldDataNascimento.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //Gravar o objeto, através do DAO
        MedicoDao.gravar(novoMedico);
        JOptionPane.showMessageDialog(this,
                "Médico(a) gravado(a) com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    
    private void preencherListaEspecialidades() {
        listListaDeEspecialidades.setModel(EspecialidadeDao.getListaEspecialidades());
    }
    
    
}
