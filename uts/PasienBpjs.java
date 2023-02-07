package uts;
public class PasienBpjs extends Pasien {
    
    @Override
    public int hitungBiaya(){
        int biaya = super.hitungBiaya();
        System.out.println("Potongan pasien BPJS*");
        return biaya-(biaya*1/100);
    }
}