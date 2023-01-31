package kuis;
public class MainQ2 {
    public static void main(String[] args) {
        Pembayaran p = new Pembayaran();
        KeretaApiEkonomi kae = new KeretaApiEksekutif();
        kae.setHargaTiket(2000);
        System.out.println("Harga total kereta api eksekutif Rp."+p.bayar(kae));
        
        Pesawat pes = new Pesawat();
        pes.setHargaTiket(5000);
        pes.setBiayaCheckIn(1000);
        System.out.println("Harga total pesawat Rp."+p.bayar(pes));
        
        KapalPesiar kp = new KapalPesiar();
        kp.setHargaTiket(6000);
        kp.setBiayaVisa(2000);
        kp.setBiayaReservasi(1000);
        System.out.println("Harga total kapal pesiar Rp."+p.bayar(kp));
        
        kae = new KeretaApiEkonomi();
        kae.setHargaTiket(1500);
        System.out.println("Harga total kereta api ekonomi Rp."+p.bayar(kae));
    }
}