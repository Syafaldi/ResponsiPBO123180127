package responsipbo;


import javax.swing.*;

public class GajiView extends JFrame {
    JLabel lidpegawai,lnama,lposisi,lalamat,lnohp,lgajipokok,ljamlembur,ltunjangan,lpajak,ltotalgaji;
    JTextField txtidpegawai,txtnama,txtalamat,txtnohp,txtgajipokok,txtjamlembur,txttunjangan,txtpajak,txttotalgaji;
    JButton btnhitung,btnsimpan,btnhome,btngaji,btndata,btnpetunjuk,btnadmin;
    JComboBox<String> comboposisi;
    public GajiView(){
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
        lidpegawai = new JLabel("ID Pegawai");
        lnama = new JLabel("Nama");
        lposisi = new JLabel("Posisi");
        lalamat = new JLabel("Alamat");
        lnohp = new JLabel("No HP");
        lgajipokok = new JLabel("Gaji Pokok");
        ljamlembur = new JLabel("Jam Lembur");
        ltunjangan = new JLabel("Tunjangan");
        lpajak = new JLabel("Pajak");
        ltotalgaji = new JLabel("Total Gaji");
        btnhitung = new JButton("Hitung");
        btnhome = new JButton("Home");
        btngaji = new JButton("Gaji");
        btndata = new JButton("Data");
        btnpetunjuk = new JButton("Petunjuk");
        btnadmin = new JButton("Admin");
        btnsimpan = new JButton("Simpan");
        comboposisi = new javax.swing.JComboBox<>();
        comboposisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Direktur", "Manager", "Programmer","Marketing","Surveyor" }));
        txtidpegawai = new JTextField("");
        txtnama = new JTextField("");
        txtalamat = new JTextField("");
        txtnohp = new JTextField("");
        txtgajipokok = new JTextField("");
        txtjamlembur = new JTextField("");
        txttunjangan = new JTextField("");
        txtpajak = new JTextField("");
        txttotalgaji = new JTextField("");
        
        
        
        
        setLayout(null);
        add(lidpegawai);
        add(lnama);
        add(lposisi);
        add(lalamat);
        add(lnohp);
        add(lgajipokok);
        add(ljamlembur);
        add(ltunjangan);
        add(lpajak);
        add(ltotalgaji);
        
        add(btnhome);
        add(btnhitung);
        add(btngaji);
        add(btndata);
        add(btnpetunjuk);
        add(btnadmin);
        add(btnsimpan);
        
        add(txtidpegawai);
        add(txtnama);
        add(comboposisi);
        add(txtalamat);
        add(txtnohp);
        add(txtgajipokok);
        add(txtjamlembur);
        add(txttunjangan);
        add(txtpajak);
        add(txttotalgaji);
        
        btnhome.setBounds(10,10,90,50);
        btngaji.setBounds(10,70,90,50);
        btndata.setBounds(10,130,90,50);
        btnpetunjuk.setBounds(10,190,90,50);
        
        lidpegawai.setBounds(120,10,70,30);
        lnama.setBounds(120,50,70,30);
        lposisi.setBounds(120,90,70,30);
        lalamat.setBounds(120,130,70,30);
        lnohp.setBounds(120,170,70,30);
        lgajipokok.setBounds(120,210,70,30);
        ljamlembur.setBounds(120,250,80,30);
        ltunjangan.setBounds(120,290,70,30);
        lpajak.setBounds(120,330,70,30);
        ltotalgaji.setBounds(120,370,70,30);
        
        txtidpegawai.setBounds(230,10,100,30);
        txtnama.setBounds(230,50,150,30);
        comboposisi.setBounds(230,90,130,30);
        txtalamat.setBounds(230,130,250,30);
        txtnohp.setBounds(230,170,150,30);
        txtgajipokok.setBounds(230,210,100,30);
        txtjamlembur.setBounds(230,250,100,30);
        txttunjangan.setBounds(230,290,100,30);
        txtpajak.setBounds(230,330,100,30);
        txttotalgaji.setBounds(230,370,100,30);
       
        btnhitung.setBounds(150,420,100,30);
        btnsimpan.setBounds(360,420,100,30);
        btnadmin.setBounds(500,10,100,30);
        
        
        setSize(620,520);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
    }
}
