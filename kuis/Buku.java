package kuis;
public class Buku {
    private String kode, judul, pengarang;
    private int thnTerbit;

    public Buku() {
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getThnTerbit() {
        return thnTerbit;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setThnTerbit(int thnTerbit) {
        this.thnTerbit = thnTerbit;
    }
    
    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Judul : "+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Tahun Terbit : "+thnTerbit);
        System.out.println("------------------------------------");
    }
}