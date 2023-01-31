package kuis;
public class KapalPesiar implements LayananEkstra {
    private int biayaReservasi, biayaVisa, hargaTiket;
    
    public int hargaTotal(){
        return biayaReservasi + biayaVisa + hargaTiket + karaoke() + restorasi();
    }
    
    @Override
    public int karaoke() {
        return 3000;
    }

    @Override
    public int restorasi() {
        return 4000;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public int getBiayaReservasi() {
        return biayaReservasi;
    }

    public void setBiayaReservasi(int biayaReservasi) {
        this.biayaReservasi = biayaReservasi;
    }

    public int getBiayaVisa() {
        return biayaVisa;
    }

    public void setBiayaVisa(int biayaVisa) {
        this.biayaVisa = biayaVisa;
    }
}