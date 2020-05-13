package responsipbo;

public class PegawaiModel {
    private String id_pegawai,nama,posisi,alamat,no_hp,gaji_pokok,jam_lembur,tunjangan,pajak,total_gaji;
    public void setPegawaiModel(String id_pegawai,String nama,String posisi,String alamat,String no_hp,String gaji_pokok,String jam_lembur,String tunjangan,String pajak,String total_gaji){
        this.id_pegawai = id_pegawai;
        this.nama = nama;
        this.posisi = posisi;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.gaji_pokok = gaji_pokok;
        this.jam_lembur = jam_lembur;
        this.tunjangan = tunjangan;
        this.pajak = pajak;
        this.total_gaji = total_gaji;
    }
    public String getId_pegawai() {
        return id_pegawai;
    }
    public String getNama() {
        return nama;
    }
    public String getPosisi() {
        return posisi;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNo_hp() {
        return no_hp;
    }
    public String getGaji_pokok() {
        return gaji_pokok;
    }
    public String getJam_lembur() {
        return jam_lembur;
    }
    public String getTunjangan() {
        return tunjangan;
    }
    public String getPajak() {
        return pajak;
    }
    public String getTotal_gaji() {
        return total_gaji;
    }
    
    
}
