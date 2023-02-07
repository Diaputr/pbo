package uts;
public class Obat {
    private int harga;
    private String merk;

    public Obat(){
    }
    
    public Obat(int harga, String merk) {
        this.harga = harga;
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void print(){
        System.out.println("  Merk : "+merk);
        System.out.println("  Harga : "+harga);
    }
}