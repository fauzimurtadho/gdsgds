package Model;

import java.util.Date;

public class Pengembalian {
    
    private Date tglPengembalian;
    private int banyakHariPinjam = 0;
    private Denda denda;

    public Pengembalian(Date tglPengembalian) {
        this.tglPengembalian = tglPengembalian; }
    
    public void kalkulatorPenghitungHari(Date tglPeminjaman, Date tglPengembalian){
        int banyakHari = 0;
        
        this.banyakHariPinjam = banyakHari;
    }

    public int getBanyakHariPinjam() {
        return banyakHariPinjam;    }

    public boolean isBayarDenda() {
        if (banyakHariPinjam <= 7){
            return true;
        }
        return false;
    }
    
    public int perhitunganDenda(){
        this.denda = new Denda(getBanyakHariPinjam());
        denda.setTotalDenda(denda.hitungDenda());
        return denda.getTotalDenda();
    }
    
    public void pembayaranDenda(int bayar){
        denda.setTotalDenda(denda.getTotalDenda()-bayar);
        if (denda.getTotalDenda() == 0)
            System.out.println("Denda sudah lunas");
        else
            System.out.println("Denda belum lunas");
    }
    
}
