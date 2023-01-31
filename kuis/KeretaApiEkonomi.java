package kuis;
public class KeretaApiEkonomi {
    private int hargaTiket;
    
    int hargaTotal(){
        return hargaTiket;
    }
    
    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }
}