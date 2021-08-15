/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Mr. Wanny
 */
public class SQL {

    static Connection con = null;
    static String Driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/tecno";
    static String user = "root";
    static String password = "";

    public static Connection connect() {
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!\n" + e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
}
