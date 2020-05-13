package responsipbo;

import java.sql.*;
import javax.swing.JOptionPane;
public class PegawaiDAO {
    private Statement statement;
    private Connection koneksi;
    public PegawaiDAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/responsi_pbo";
            koneksi = DriverManager.getConnection(url,"root","");
            statement = koneksi.createStatement();
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Class not found : "+ex);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"SQL Exception : "+ex);
        }
    }
    
    public void Insert(PegawaiModel Model){
        try{
            String query = "INSERT INTO pegawai VALUES ('"+Model.getId_pegawai()+"','"+Model.getNama()+"','"+Model.getPosisi()+"','"+Model.getAlamat()+"','"+Model.getNo_hp()+"','"+Model.getGaji_pokok()+"','"+Model.getJam_lembur()+"','"+Model.getTunjangan()+"','"+Model.getPajak()+"','"+Model.getTotal_gaji()+"')";
            System.out.println(query);
            statement.executeUpdate(query);
        }catch(Exception sql){
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getJmldata(){
        int jmlData = 0;
        try{
            String query = "SELECT * FROM pegawai";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    public String[][] readPegawai(){
        try{
            int jmlData = 0;
            String data[][] = new String[getJmldata()][10];
            String query = "SELECT * FROM pegawai";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_pegawai");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("posisi");
                data[jmlData][3] = resultSet.getString("alamat");
                data[jmlData][4] = resultSet.getString("no_hp");
                data[jmlData][5] = resultSet.getString("gaji_pokok");
                data[jmlData][6] = resultSet.getString("jam_lembur");
                data[jmlData][7] = resultSet.getString("tunjangan");
                data[jmlData][8] = resultSet.getString("pajak");
                data[jmlData][9] = resultSet.getString("total_gaji");
                jmlData++;
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
}
