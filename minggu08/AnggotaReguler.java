package latihan;
public class AnggotaReguler {
    String id, nama;
    Mobil[] mob;
    static final int biaya = 1000;

    public AnggotaReguler() {
    }
    
    public AnggotaReguler(String id, String nama, Mobil[] mob) {
        this.id = id;
        this.nama = nama;
        this.mob = mob;
    }
    
    double hitungBiayaPendaftaran(){
        return biaya;
    }
    
    double hitungBiayaSewa(){
        int jml = 0;
        for (Mobil mob1 : mob) {
            jml += (mob1.biayaSewaPerJam*mob1.jam);
        }
        return jml;
    }
    
    void tampilData(){
        System.out.println("ID Anggota : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("------------------------------------");
        for (Mobil mobil : mob) {
            mobil.tampilData();
        }
        System.out.println("Biaya Pendaftaran : Rp."+hitungBiayaPendaftaran());
        System.err.println("Biaya Sewa : Rp."+hitungBiayaSewa());
    }
}