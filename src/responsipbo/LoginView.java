package responsipbo;

import java.awt.Font;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LoginView extends JFrame{
    JLabel lusername,lpassword;
    JTextField txtusername;
    JPasswordField txtpassword;
    JButton btnlogin,btnback;
    public LoginView(){
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
            java.util.logging.Logger.getLogger(GajiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GajiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GajiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GajiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        setTitle("Isi Data");
        lusername = new JLabel("Username");
        lpassword = new JLabel("Password");
        txtusername = new JTextField("");
        txtpassword = new JPasswordField("");
        btnlogin = new JButton("Login");
        btnback = new JButton("Back");
        
        
        
        setLayout(null);
        add(lusername);
        add(lpassword);
        add(txtusername);
        add(txtpassword);
        add(btnlogin);
        add(btnback);
        
        lusername.setBounds(75,25,70,30);
        lpassword.setBounds(75,65,70,30);
        txtusername.setBounds(155,25,100,30);
        txtpassword.setBounds(155,65,100,30);
        btnlogin.setBounds(75,105,70,30);
        btnback.setBounds(155,105,70,30);
      
       
        
        
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
