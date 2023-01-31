package kuis;
public class Pesawat implements LayananEkstra {
    private int biayaCheckIn, hargaTiket;
    
    public int hargaTotal(){
        return biayaCheckIn + hargaTiket + karaoke() + restorasi();
    }
    
    @Override
    public int karaoke() {
        return 5000;
    }

    @Override
    public int restorasi() {
        return 6000;
    }

    public int getBiayaCheckIn() {
        return biayaCheckIn;
    }

    public void setBiayaCheckIn(int biayaCheckIn) {
        this.biayaCheckIn = biayaCheckIn;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
}