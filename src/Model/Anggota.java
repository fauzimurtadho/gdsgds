package Model;

public class Anggota {
    
    private String username, kodeAnggota;
    //private Pendaftaran pendaftaran = new pendaftaran();

    public Anggota(String username, String kodeAnggota) {
        this.username = username;
        this.kodeAnggota = kodeAnggota;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }
    
    
    
}
