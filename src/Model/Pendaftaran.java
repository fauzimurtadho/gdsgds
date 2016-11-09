package Model;

import java.util.Date;

public class Pendaftaran {
    
    private String kodeDaftar, notifikasi, nama, alamat, noTelp, email;
    private Date tgl;
    private int umur; //haruskah buat kalkulator umur?

    public Pendaftaran(String kodeDaftar, String nama, String alamat, String noTelp, String email) {
        this.kodeDaftar = kodeDaftar;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
        this.tgl = new Date();
    }

    public void setNama(String nama) {
        this.nama = nama;   }
    
    public String getNama() {
        return nama;    }
    
    public void setKodeDaftar(String kodeDaftar) {
        this.kodeDaftar = kodeDaftar;   }
    
    public void setUmur(int umur) {
        this.umur = umur;   }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;   }
    
    public String getAlamat() {
        return alamat;  }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;   }
    
    public String getNoTelp() {
        return noTelp;  }

    public void setEmail(String email) {
        this.email = email; }
    
    public String getEmail() {
        return email;   }

    public Date getTgl() {
        return tgl; }
    
    public String getNotifikasi() {
        return notifikasi;  }

    public void setNotifikasi(String notifikasi) {
        this.notifikasi = notifikasi;   }
    
}
