package latihan;
public class Mobil {
    String noPlatMobil, merk;
    int jam, biayaSewaPerJam;

    public Mobil(String noPlatMobil, String merk, int jam, int biayaSewaPerJam) {
        this.noPlatMobil = noPlatMobil;
        this.merk = merk;
        this.jam = jam;
        this.biayaSewaPerJam = biayaSewaPerJam;
    }
    
    void tampilData(){
        System.out.println("No Plat Mobil : "+noPlatMobil);
        System.out.println("Merk : "+merk);
        System.out.println("Jumlah Jam Sewa : "+jam+" jam");
        System.out.println("Biaya Sewa Per Jam : Rp."+biayaSewaPerJam);
        System.out.println("------------------------------------");
    }
}