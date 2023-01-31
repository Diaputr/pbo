package kuis;
public class Pembayaran {
    public int bayar(KeretaApiEkonomi kae) {
        return kae.hargaTotal();
    }

    public int bayar(LayananEkstra le) {
        int uang = 0;
        if (le instanceof KeretaApiEksekutif) {
            uang = ((KeretaApiEksekutif) le).hargaTotal();
        } else if (le instanceof KapalPesiar) {
            uang = ((KapalPesiar) le).hargaTotal();
        } else if (le instanceof Pesawat) {
            uang = ((Pesawat) le).hargaTotal();
        } 
        return uang;
    }
}