package minggu02;
public class Barang {
     String kode, namaBrg;
     int hrgDasar;
     float diskon;
    
    int hitungHrgJual(){
        return (int) (hrgDasar - (diskon/100*hrgDasar));
    }
    
    void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBrg);
        System.out.println("Harga Dasar : Rp."+hrgDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("Harga jual : Rp."+hitungHrgJual());
    }
    
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "123";
        brg.namaBrg = "Game";
        brg.hrgDasar = 20000;
        brg.diskon = 5;
        brg.tampilData();
    }
}