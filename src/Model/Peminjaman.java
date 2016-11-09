package Model;

import java.util.ArrayList;
import java.util.Date;

public class Peminjaman {
    
    //private ArrayList pinjamBuku = new ArrayList<Buku>();
    private String kodePeminjaman;
    private Date tglPeminjaman, batasPeminjaman;
    private int nPeminjaman;
    //private Pengembalian pengembalianBuku = new Pengembalian();
    //private ArrayList anggota = new ArrayList<Anggota>();

    public Peminjaman(String kodePeminjaman, Date tglPeminjaman, Date batasPeminjaman) {
        this.kodePeminjaman = kodePeminjaman;
        this.tglPeminjaman = tglPeminjaman;
        this.batasPeminjaman = batasPeminjaman;
    }

    public String getKodePeminjaman() {
        return kodePeminjaman;  }

    public void setKodePeminjaman(String kodePeminjaman) {
        this.kodePeminjaman = kodePeminjaman;   }

    public Date getTglPeminjaman() {
        return tglPeminjaman;   }

    public void setTglPeminjaman(Date tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman; }

    public Date getBatasPeminjaman() {
        return batasPeminjaman; }

    public void setBatasPeminjaman(Date batasPeminjaman) {
        this.batasPeminjaman = batasPeminjaman; }
    
//    public void tambahPeminjaman(Buku bukuDipinjam){
//        pinjamBuku.add(bukuDipinjam);   }
    
    public void ubahPeminjaman(Date tglPinjam, Date batasPinjam){
        setTglPeminjaman(tglPinjam);
        setBatasPeminjaman(batasPinjam);
    }
    
//    public void updatePengembalian(Pengembalian pengembalianBuku){}
    
//    public int jumlahPinjamBuku(){
//        int jmlBuku = 0;
//        for (int i=0; i < pinjamBuku.size(); i++){
//            jmlBuku = jmlBuku + 1;
//        }
//        return jmlBuku; }
    
}
