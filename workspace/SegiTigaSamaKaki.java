package workspace;
public class SegiTigaSamaKaki {
    private int alas, tinggi;

    public SegiTigaSamaKaki(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public double hitungLuas(){
        return alas*tinggi/2;
    }
}