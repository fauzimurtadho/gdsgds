package Model;

import java.util.Date;

public class Buku {
    
    private String judul, pengarang, penerbit, sinopsis, kodeBuku;
    private Date tahunTerbit;
    private int jumlahBuku;

    public Buku(String judul, String pengarang, String penerbit, String kodeBuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;   }

    public void setJudul(String judul) {
        this.judul = judul; }

    public String getPengarang() {
        return pengarang;   }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang; }

    public String getPenerbit() {
        return penerbit;    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;   }

    public String getSinopsis() {
        return sinopsis;    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;   }

    public Date getTahunTerbit() {
        return tahunTerbit; }

    public void setTahunTerbit(Date tahunTerbit) {
        this.tahunTerbit = tahunTerbit; }

    public int getJumlahBuku() {
        return jumlahBuku;  }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;   }
    
    public void tambahBuku(int nBukuTambahan){
        setJumlahBuku( getJumlahBuku() + nBukuTambahan);    }
    
    public void kurangBuku(){
        setJumlahBuku( getJumlahBuku() - 1);    }
    
    public void cariBuku(String namaPengarang){}
    
    //public void cariBuku(String judulBuku){}
    
    //public void cariBuku(){}
    
}
