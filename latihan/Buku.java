package latihan;
public class Buku {
    private String kode, judul, pengarang;

    public Buku(String kode, String judul, String pengarang) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }    
    
    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Judul : "+judul);
        System.out.println("Pengarang : "+pengarang);
    }
}