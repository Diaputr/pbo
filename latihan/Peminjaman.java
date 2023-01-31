package latihan;
public class Peminjaman {
    private String kode, tanggal;
    private Buku bk;
    private Mahasiswa mhs;
    private Petugas pt;

    public Peminjaman(String kode, String tanggal, Buku bk, Mahasiswa mhs, Petugas pt) {
        this.kode = kode;
        this.tanggal = tanggal;
        this.bk = bk;
        this.mhs = mhs;
        this.pt = pt;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Buku getBk() {
        return bk;
    }

    public void setBk(Buku bk) {
        this.bk = bk;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    public Petugas getPt() {
        return pt;
    }

    public void setPt(Petugas pt) {
        this.pt = pt;
    }
    
    public void tampilData(){
        System.out.println("-----------------------------");
        System.out.println("Kode peminjaman : "+kode);
        System.out.println("Tanggal : "+tanggal);
        System.out.println("-----------------------------");
        System.out.println("Peminjam");
        mhs.tampilData();
        System.out.println("-----------------------------");
        System.out.println("Petugas");
        pt.tampilData();
        System.out.println("-----------------------------");
        System.out.println("Buku");
        bk.tampilData();
        System.out.println("-----------------------------");
    }
}