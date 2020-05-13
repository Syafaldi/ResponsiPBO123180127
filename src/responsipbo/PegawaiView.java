package responsipbo;

import java.awt.Font;
import javax.swing.*;

public class PegawaiView extends JFrame {
    JLabel lhome;
    JButton btnhome,btngaji,btndata,btnpetunjuk,btnadmin;
    public PegawaiView(){
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
        lhome = new JLabel("<html>Selamat Datang<br> Silahkan masuk ke menu gaji untuk melakukan perhitungan gaji<br> Jika mengalami kesulitan,klik menu petunjuk</html>");
        btnhome = new JButton("Home");
        btngaji = new JButton("Gaji");
        btndata = new JButton("Data");
        btnpetunjuk = new JButton("Petunjuk");
        btnadmin = new JButton("Admin");
        
        
        
        
        setLayout(null);
       
        
        add(btnhome);
        add(lhome);
        add(btngaji);
        add(btndata);
        add(btnpetunjuk);
        add(btnadmin);
       
        
        
        lhome.setBounds(200,10,300,300);
        btnhome.setBounds(10,10,90,50);
        btngaji.setBounds(10,70,90,50);
        btndata.setBounds(10,130,90,50);
        btnpetunjuk.setBounds(10,190,90,50);
        btnadmin.setBounds(500,10,100,30);
        lhome.setFont(new Font("Calibri", Font.BOLD, 20));
       
        
        
        setSize(620,520);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }        
}