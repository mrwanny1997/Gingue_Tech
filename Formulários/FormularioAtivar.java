/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulários;

import java.sql.*;
import javax.swing.*;
import Classes.*;

/**
 *
 * @author Mr. Wanny
 */
public class FormularioAtivar extends javax.swing.JFrame {

    /**
     * Creates new form FormulrioAtivar
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public FormularioAtivar() {
        initComponents();
        con = SQL.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelAtivar = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblEstatus = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        PainelAtivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PainelAtivar.setLayout(null);

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblID.setText("ID");
        PainelAtivar.add(lblID);
        lblID.setBounds(30, 20, 18, 50);

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setEnabled(false);
        PainelAtivar.add(txtID);
        txtID.setBounds(60, 20, 60, 50);

        lblEstatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEstatus.setText("Estatus");
        PainelAtivar.add(lblEstatus);
        lblEstatus.setBounds(160, 20, 60, 50);

        txtEstatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelAtivar.add(txtEstatus);
        txtEstatus.setBounds(230, 20, 140, 50);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/updated.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        PainelAtivar.add(btnAlterar);
        btnAlterar.setBounds(380, 20, 60, 50);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        PainelAtivar.add(btnCancelar);
        btnCancelar.setBounds(450, 20, 60, 50);

        getContentPane().add(PainelAtivar);
        PainelAtivar.setBounds(20, 50, 530, 90);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Ativar Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 230, 48);

        setSize(new java.awt.Dimension(588, 202));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try {
            String alterar = "update tb_login set estatus = ? where id_login = ?";
            pst = con.prepareStatement(alterar);
            pst.setString(1, txtEstatus.getText());
            pst.setString(2, txtID.getText());
            int alterado = pst.executeUpdate();
            if (txtEstatus.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Especifique o Estatus do Usuário!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (alterado > 0) {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Seu Login estará ativo dentro de alguns segundos!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    for (int x = 0; x <= 100; x += 2) {
                        Thread.sleep(100);
                    }
                    JOptionPane.showMessageDialog(null, "Login Ativado com Sucesso\nFaça o Login!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    FormularioLogin log = new FormularioLogin();
                    log.setVisible(true);
                    this.dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na Comunicação com o Banco de Dados\n" + e, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        FormularioLogin log = new FormularioLogin();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioAtivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioAtivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioAtivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioAtivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioAtivar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAtivar;
    public static javax.swing.JButton btnAlterar;
    public static javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblEstatus;
    public static javax.swing.JLabel lblID;
    public static javax.swing.JTextField txtEstatus;
    public static javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
