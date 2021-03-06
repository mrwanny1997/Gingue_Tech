/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulários;

import java.sql.*;
import javax.swing.*;
import Classes.*;
import java.awt.Color;

/**
 *
 * @author Mr. Wanny
 */
public class FormularioLogin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    ImageIcon acept, denied;

    /**
     * Creates new form FormulartioLogin
     */
    public FormularioLogin() {
        initComponents();
        con = SQL.connect();
        if (con != null) {
            lblStatus.setIcon(new ImageIcon(getClass().getResource("/Imagens/iconfinder_accept-database_49574.png/")));
        } else {
            lblStatus.setIcon(new ImageIcon(getClass().getResource("/Imagens/iconfinder_remove-from-database_49610.png/")));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogotipo = new javax.swing.JLabel();
        PainelLogin = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gingue Tech 2.0.png"))); // NOI18N
        getContentPane().add(lblLogotipo);
        lblLogotipo.setBounds(10, 10, 360, 90);

        PainelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PainelLogin.setLayout(null);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenha.setText("Senha");
        PainelLogin.add(lblSenha);
        lblSenha.setBounds(20, 70, 50, 40);

        txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelLogin.add(txtLogin);
        txtLogin.setBounds(80, 20, 240, 40);

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogin.setText("Login");
        PainelLogin.add(lblLogin);
        lblLogin.setBounds(20, 20, 50, 40);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelLogin.add(txtSenha);
        txtSenha.setBounds(80, 70, 240, 40);

        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/updated.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setToolTipText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        PainelLogin.add(btnEntrar);
        btnEntrar.setBounds(10, 130, 120, 41);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        PainelLogin.add(btnCancelar);
        btnCancelar.setBounds(140, 130, 130, 40);

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_remove-from-database_49610.png"))); // NOI18N
        PainelLogin.add(lblStatus);
        lblStatus.setBounds(270, 110, 70, 70);

        getContentPane().add(PainelLogin);
        PainelLogin.setBounds(20, 110, 350, 190);

        setSize(new java.awt.Dimension(400, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        String sql = "select * from tb_login where login = ? and senha = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, txtLogin.getText());
            pst.setString(2, txtSenha.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String estatus = rs.getString(5);
                if (estatus.equals("1")) {
                    String perfil = rs.getString(4);
                    if (perfil.equals("Administrador")) {
                        FormularioPrincipal prin = new FormularioPrincipal();
                        prin.setVisible(true);
                        FormularioPrincipal.lblEstatus.setText("Ativo");
                        FormularioPrincipal.lblEstatus.setForeground(Color.green);
                        FormularioPrincipal.MenuCadastrar.setEnabled(true);
                        FormularioPrincipal.MenuRelatorio.setEnabled(true);
                        FormularioPrincipal.MenuRelatoroServico.setEnabled(true);
                        FormularioPrincipal.MenuRelatorioCliente.setEnabled(true);
                        FormularioPrincipal.MenuBackUp.setEnabled(true);
                        FormularioPrincipal.MenuServico.setEnabled(true);
                        FormularioCadastrarUsuario.btnAlterar.setEnabled(true);
                        FormularioCadastrarUsuario.btnApagar.setEnabled(true);
                        FormularioCadastrarClientes.btnAlterar.setEnabled(true);
                        FormularioCadastrarClientes.btnApagar.setEnabled(true);
                        FormularioServico.btnAlterar.setEnabled(true);
                        FormularioServico.btnApagar.setEnabled(true);
                        FormularioTecnico.btnAlterar.setEnabled(true);
                        FormularioTecnico.btnApagar.setEnabled(true);
                        FormularioCadastroLogin.btnAlterar.setEnabled(true);
                        FormularioCadastroLogin.btnApagar.setEnabled(true);
                        this.dispose();
                    } else {
                        FormularioPrincipal prin = new FormularioPrincipal();
                        prin.setVisible(true);
                        FormularioPrincipal.lblEstatus.setText("Ativo");
                        FormularioPrincipal.lblEstatus.setForeground(Color.green);
                        FormularioPrincipal.MenuCadastrar.setEnabled(true);
                        FormularioPrincipal.MenuRelatorio.setEnabled(true);
                        FormularioPrincipal.MenuRelatoroServico.setEnabled(!true);
                        FormularioPrincipal.MenuRelatorioCliente.setEnabled(!true);
                        FormularioPrincipal.MenuBackUp.setEnabled(true);
                        FormularioPrincipal.MenuServico.setEnabled(true);
                        FormularioCadastrarUsuario.btnAlterar.setEnabled(!true);
                        FormularioCadastrarUsuario.btnApagar.setEnabled(!true);
                        FormularioCadastrarClientes.btnAlterar.setEnabled(!true);
                        FormularioCadastrarClientes.btnApagar.setEnabled(!true);
                        FormularioServico.btnAlterar.setEnabled(!true);
                        FormularioServico.btnApagar.setEnabled(!true);
                        FormularioTecnico.btnAlterar.setEnabled(!true);
                        FormularioTecnico.btnApagar.setEnabled(!true);
                        FormularioCadastroLogin.btnAlterar.setEnabled(!true);
                        FormularioCadastroLogin.btnApagar.setEnabled(!true);
                        this.dispose();
                    }
                } else {
                    int estado = JOptionPane.showConfirmDialog(null, "Usuário Inválido!\nDeseja Validar este Usuário", "Aviso", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (estado == JOptionPane.YES_OPTION) {
                        this.dispose();
                        FormularioAtivar ativo = new FormularioAtivar();
                        ativo.setVisible(true);
                        FormularioAtivar.txtID.setText(rs.getString(1));
                        FormularioAtivar.txtEstatus.setText(rs.getString(5));
                    } else if (estado == JOptionPane.NO_OPTION) {
                        int ver = JOptionPane.showConfirmDialog(null, "Deseja Simplesmente Visualizar este perfil?", "Aviso", JOptionPane.YES_NO_OPTION);
                        if (ver == JOptionPane.YES_OPTION) {
                            FormularioPrincipal prin = new FormularioPrincipal();
                            prin.setVisible(true);
                            FormularioPrincipal.MenuCadastrar.setEnabled(!true);
                            FormularioPrincipal.MenuRelatorio.setEnabled(!true);
                            FormularioPrincipal.MenuRelatoroServico.setEnabled(!true);
                            FormularioPrincipal.MenuRelatorioCliente.setEnabled(!true);
                            FormularioPrincipal.MenuServico.setEnabled(!true);
                            FormularioPrincipal.MenuBackUp.setEnabled(!true);
                            FormularioPrincipal.MenuAjudaAtualizacoes.setEnabled(!true);
                            FormularioPrincipal.lblEstatus.setText("Inativo");
                            this.dispose();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Email e/ou Senha Inválido(s)", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na Comunicação com o Banco de Dados\n" + e, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        int cancelar = JOptionPane.showConfirmDialog(null, "Deseja Cancelar o Login?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (cancelar == JOptionPane.YES_OPTION) {
            System.exit(cancelar);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void lblLimparEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimparEmailMouseClicked
        // TODO add your handling code here:
        txtLogin.setText(null);
    }//GEN-LAST:event_lblLimparEmailMouseClicked

    private void lblLimparSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimparSenhaMouseClicked
        // TODO add your handling code here:
        txtSenha.setText(null);
    }//GEN-LAST:event_lblLimparSenhaMouseClicked

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
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelLogin;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
