package latihan;
public class AnggotaPremium extends AnggotaReguler {

    public AnggotaPremium(String id, String nama, Mobil[] mob) {
        super.id = id;
        super.nama = nama;
        super.mob = mob;
    }
    
    @Override
    double hitungBiayaPendaftaran(){
        return biaya+(biaya*0.1);
    }
    
    @Override
    double hitungBiayaSewa(){
        int jml = 0;
        for (Mobil mob1 : mob) {
            jml += (mob1.biayaSewaPerJam*mob1.jam);
        }
        return jml-(jml*0.05);
    }
}