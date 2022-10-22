package minggu06;
public class Pegawai {
    protected String nip, nama, alamat;
    protected int gaji; 

    public Pegawai() {
    }
    
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public int getGaji() {
        return gaji;
    }
}