/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulários;

import java.sql.*;
import javax.swing.*;
import Classes.*;
import net.proteanit.sql.DbUtils;
import javax.swing.filechooser.*;

/**
 *
 * @author Mr. Wanny
 */
public class FormularioCadastrarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioCadastrarUsuario
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    JFileChooser chooser;
    FileNameExtensionFilter filtro;

    public FormularioCadastrarUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        PainelCadastroUsuario = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblMorada = new javax.swing.JLabel();
        txtMorada = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPerfil = new javax.swing.JLabel();
        txtPerfil = new javax.swing.JTextField();
        lblEstatus = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Usuario = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        lblPesquisar = new javax.swing.JLabel();
        lblLimpar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuário");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuários");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 0, 340, 48);

        PainelCadastroUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PainelCadastroUsuario.setLayout(null);

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblID.setText("ID");
        PainelCadastroUsuario.add(lblID);
        lblID.setBounds(30, 10, 30, 40);

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome");
        PainelCadastroUsuario.add(lblNome);
        lblNome.setBounds(30, 170, 50, 40);

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setEnabled(false);
        PainelCadastroUsuario.add(txtID);
        txtID.setBounds(60, 10, 50, 40);

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelCadastroUsuario.add(txtNome);
        txtNome.setBounds(100, 170, 820, 40);

        lblMorada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMorada.setText("Morada");
        PainelCadastroUsuario.add(lblMorada);
        lblMorada.setBounds(30, 220, 70, 30);

        txtMorada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelCadastroUsuario.add(txtMorada);
        txtMorada.setBounds(100, 220, 330, 40);

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTelefone.setText("Telefone");
        PainelCadastroUsuario.add(lblTelefone);
        lblTelefone.setBounds(480, 220, 70, 30);

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelCadastroUsuario.add(txtTelefone);
        txtTelefone.setBounds(550, 220, 370, 40);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("E - mail");
        PainelCadastroUsuario.add(lblEmail);
        lblEmail.setBounds(30, 270, 70, 40);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelCadastroUsuario.add(txtEmail);
        txtEmail.setBounds(100, 270, 330, 40);

        lblPerfil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPerfil.setText("Perfil");
        PainelCadastroUsuario.add(lblPerfil);
        lblPerfil.setBounds(480, 270, 50, 40);

        txtPerfil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelCadastroUsuario.add(txtPerfil);
        txtPerfil.setBounds(530, 270, 390, 40);

        lblEstatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEstatus.setText("Estatus");
        PainelCadastroUsuario.add(lblEstatus);
        lblEstatus.setBounds(30, 320, 60, 40);

        txtEstatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PainelCadastroUsuario.add(txtEstatus);
        txtEstatus.setBounds(100, 320, 820, 40);

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        PainelCadastroUsuario.add(btnAdicionar);
        btnAdicionar.setBounds(30, 370, 60, 50);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/updated.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        PainelCadastroUsuario.add(btnAlterar);
        btnAlterar.setBounds(450, 380, 60, 50);

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove.png"))); // NOI18N
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        PainelCadastroUsuario.add(btnApagar);
        btnApagar.setBounds(860, 380, 60, 50);

        tb_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "Email", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_UsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Usuario);

        PainelCadastroUsuario.add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 890, 100);

        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        PainelCadastroUsuario.add(txtPesquisar);
        txtPesquisar.setBounds(500, 10, 390, 40);

        lblPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifying-glass.png"))); // NOI18N
        PainelCadastroUsuario.add(lblPesquisar);
        lblPesquisar.setBounds(900, 10, 34, 40);

        getContentPane().add(PainelCadastroUsuario);
        PainelCadastroUsuario.setBounds(20, 50, 940, 460);

        lblLimpar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLimpar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpar.setText("X");
        lblLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimparMouseClicked(evt);
            }
        });
        getContentPane().add(lblLimpar);
        lblLimpar.setBounds(930, 0, 30, 48);

        setBounds(0, 0, 1000, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        String sql = "insert into tb_user(nome_user, morada_user, telefone_user, email_user, perfil_user, estatus_user) values(?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtMorada.getText());
            pst.setString(3, txtTelefone.getText());
            pst.setString(4, txtEmail.getText());
            pst.setString(5, txtPerfil.getText());
            pst.setString(6, txtEstatus.getText());
            int adicionado = pst.executeUpdate();
            if (txtEmail.getText().isEmpty() || txtNome.getText().isEmpty() || txtPerfil.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira todos os Campos!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário Adicionado Com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    txtID.setText(null);
                    txtNome.setText(null);
                    txtMorada.setText(null);
                    txtTelefone.setText(null);
                    txtEmail.setText(null);
                    txtPerfil.setText(null);
                    txtEstatus.setText(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na Comunicação com o Banco de Dados\n" + e, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        String sql = "update tb_user set nome_user = ?, morada_user = ?, telefone_user = ?, email_user = ?, perfil_user = ?, estatus_user = ? where id_user = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtMorada.getText());
            pst.setString(3, txtTelefone.getText());
            pst.setString(4, txtEmail.getText());
            pst.setString(5, txtPerfil.getText());
            pst.setString(6, txtEstatus.getText());
            pst.setString(7, txtID.getText());
            btnAdicionar.setEnabled(false);
            int alterado = pst.executeUpdate();
            if (txtID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira o ID do Usuário", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (alterado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário Alterado Com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    txtID.setText(null);
                    txtNome.setText(null);
                    txtMorada.setText(null);
                    txtTelefone.setText(null);
                    txtEmail.setText(null);
                    txtPerfil.setText(null);
                    txtEstatus.setText(null);
                    btnAdicionar.setEnabled(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na Comunicação com o Banco de Dados\n" + e, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        int apagar = JOptionPane.showConfirmDialog(null, "Deseja Apagar este Usuário?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (apagar == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_user where id_user = ?";
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, txtID.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário Apagado com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    txtID.setText(null);
                    txtNome.setText(null);
                    txtMorada.setText(null);
                    txtTelefone.setText(null);
                    txtEmail.setText(null);
                    txtPerfil.setText(null);
                    txtEstatus.setText(null);
                    btnAdicionar.setEnabled(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha na Comunicação com o Banco de Dados\n" + e, "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void lblLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimparMouseClicked
        // TODO add your handling code here:
        txtID.setText(null);
        txtNome.setText(null);
        txtMorada.setText(null);
        txtTelefone.setText(null);
        txtEmail.setText(null);
        txtPerfil.setText(null);
        txtEstatus.setText(null);
        btnAdicionar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnApagar.setEnabled(true);
    }//GEN-LAST:event_lblLimparMouseClicked

    private void tb_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_UsuarioMouseClicked
        // TODO add your handling code here:
        int setar = tb_Usuario.getSelectedRow();
        txtID.setText(tb_Usuario.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tb_Usuario.getModel().getValueAt(setar, 1).toString());
        txtMorada.setText(tb_Usuario.getModel().getValueAt(setar, 2).toString());
        txtTelefone.setText(tb_Usuario.getModel().getValueAt(setar, 3).toString());
        txtEmail.setText(tb_Usuario.getModel().getValueAt(setar, 4).toString());
        txtPerfil.setText(tb_Usuario.getModel().getValueAt(setar, 5).toString());
        txtEstatus.setText(tb_Usuario.getModel().getValueAt(setar, 6).toString());
        btnAdicionar.setEnabled(false);
    }//GEN-LAST:event_tb_UsuarioMouseClicked

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // TODO add your handling code here:
        String sql = "select id_user as ID, nome_user as Nome, morada_user as Morada, telefone_user as Telefone, email_user as Email, perfil_user as Perfil, estatus_user as Estatus from tb_user where nome_user like ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, txtPesquisar.getText() + "%");
            rs = pst.executeQuery();
            tb_Usuario.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na Comunicação com o Banco de Dados\n" + e, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PainelCadastroUsuario;
    public static javax.swing.JButton btnAdicionar;
    public static javax.swing.JButton btnAlterar;
    public static javax.swing.JButton btnApagar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lblEmail;
    public static javax.swing.JLabel lblEstatus;
    public static javax.swing.JLabel lblID;
    public static javax.swing.JLabel lblLimpar;
    public static javax.swing.JLabel lblMorada;
    public static javax.swing.JLabel lblNome;
    public static javax.swing.JLabel lblPerfil;
    public static javax.swing.JLabel lblPesquisar;
    public static javax.swing.JLabel lblTelefone;
    public static javax.swing.JTable tb_Usuario;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtEstatus;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtMorada;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JTextField txtPerfil;
    public static javax.swing.JTextField txtPesquisar;
    public static javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
