package kuis;
public class KeretaApiEksekutif extends KeretaApiEkonomi implements LayananEkstra {

    @Override
    int hargaTotal() {
        return super.hargaTotal() + karaoke() + restorasi(); 
    }
    
    @Override
    public int karaoke() {
        return 1000;
    }

    @Override
    public int restorasi() {
        return 2000;
    }
}