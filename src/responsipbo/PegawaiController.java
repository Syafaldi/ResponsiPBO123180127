/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsipbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PegawaiController {
    PegawaiModel pegawaimodel;
    PegawaiView pegawaiview;
    PegawaiDAO pegawaidao;
    GajiView gajiview;
    DataView dataview;
    LoginView loginview;
    public PegawaiController(PegawaiModel pegawaimodel,PegawaiView pegawaiview,PegawaiDAO pegawaidao,GajiView gajiview,DataView dataview,LoginView loginview){
        this.pegawaimodel = pegawaimodel;
        this.pegawaiview = pegawaiview;
        this.pegawaidao = pegawaidao;
        this.gajiview = gajiview;
        this.dataview = dataview;
        this.loginview = loginview;
        
         if(pegawaidao.getJmldata()!=0){
            tampilkan();
        }else{
            JOptionPane.showMessageDialog(null,"Data tidak ada");
        }
        
       gajiview.btnhitung.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           try{
           int lembur = Integer.parseInt(gajiview.txtjamlembur.getText());
           int tunjangan = lembur*15000;
           int gaji = Integer.parseInt(gajiview.txtgajipokok.getText());
           int pajak = gaji/100*1;
           int total_gaji = gaji-pajak+tunjangan;
           gajiview.txttunjangan.setText(String.valueOf(tunjangan));
           gajiview.txtpajak.setText(String.valueOf(pajak));
           gajiview.txttotalgaji.setText(String.valueOf(total_gaji));
           }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null,"Harap isi semua field");
           }
       }
       });
       
       gajiview.btnsimpan.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           try{
               String id = gajiview.txtidpegawai.getText();
               String nama = gajiview.txtnama.getText();
               String no_hp = gajiview.txtnohp.getText();
               String posisi = gajiview.comboposisi.getSelectedItem().toString();
               String alamat = gajiview.txtalamat.getText();
               String gaji = gajiview.txtgajipokok.getText();
               String lembur = gajiview.txtjamlembur.getText();
               String tunjangan = gajiview.txttunjangan.getText();
               String pajak = gajiview.txtpajak.getText();
               String total = gajiview.txttotalgaji.getText();
               if(id.isEmpty() || nama.isEmpty() || posisi.isEmpty() || alamat.isEmpty() || gaji.isEmpty() || lembur.isEmpty() || tunjangan.isEmpty() || pajak.isEmpty() || total.isEmpty()){
                   JOptionPane.showMessageDialog(null, "Harap isi semua field");
               }
               else{
                   pegawaimodel.setPegawaiModel(id,nama,posisi,alamat,no_hp,gaji,lembur,tunjangan,pajak,total);
                   pegawaidao.Insert(pegawaimodel);
                   JOptionPane.showMessageDialog(null, "Data berhasil di Input");
               }
           }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "Gaji pokok dan jam lembur hanya bisa diisi angka");
           }
       }
       });
       
       pegawaiview.btngaji.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           pegawaiview.setVisible(false);
           gajiview.setVisible(true);
       }
       });
       
       pegawaiview.btnadmin.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           pegawaiview.setVisible(false);
           loginview.setVisible(true);
       }
       });
       
       pegawaiview.btndata.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           pegawaiview.setVisible(false);
           dataview.setVisible(true);
       }
       });
       
       gajiview.btnhome.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           gajiview.setVisible(false);
           pegawaiview.setVisible(true);
       }
       });
       gajiview.btnadmin.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           gajiview.setVisible(false);
           loginview.setVisible(true);
       }
       });
       gajiview.btndata.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           gajiview.setVisible(false);
           dataview.setVisible(true);
       }
       });
       
       dataview.btnhome.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           dataview.setVisible(false);
           pegawaiview.setVisible(true);
       }
       });
       dataview.btnadmin.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           dataview.setVisible(false);
           loginview.setVisible(true);
       }
       });
       dataview.btngaji.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           dataview.setVisible(false);
           gajiview.setVisible(true);
       }
       });
    }
    
     public void tampilkan(){
            String dataMahasiswa[][] = pegawaidao.readPegawai();
            dataview.tabel.setModel((new JTable(dataMahasiswa,DataView.namaKolom)).getModel());
    }
}
