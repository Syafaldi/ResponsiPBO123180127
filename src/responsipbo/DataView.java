package responsipbo;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class DataView extends JFrame {
    JLabel lhome;
    JButton btnhome,btngaji,btndata,btnpetunjuk,btnadmin;
    static Object namaKolom[] = {"ID Pegawai","Nama","Posisi","Alamat","No HP","Gaji Pokok","Jam Lembur","Tunjangan","Pajak","Total Gaji"};
    JTable tabel;
    JScrollPane scrollPane;
    DefaultTableModel tableModel;
    public DataView(){
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
        btnhome = new JButton("Home");
        btngaji = new JButton("Gaji");
        btndata = new JButton("Data");
        btnpetunjuk = new JButton("Petunjuk");
        btnadmin = new JButton("Admin");
        
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        
        
        
        setLayout(null);
       
        
        add(btnhome);
        add(scrollPane);
        add(btngaji);
        add(btndata);
        add(btnpetunjuk);
        add(btnadmin);
       
        
        
        scrollPane.setBounds(100,10,950,500);
        btnhome.setBounds(10,10,90,50);
        btngaji.setBounds(10,70,90,50);
        btndata.setBounds(10,130,90,50);
        btnpetunjuk.setBounds(10,190,90,50);
        btnadmin.setBounds(10,250,90,50);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        
       
        
        
        setSize(1080,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }        
}
