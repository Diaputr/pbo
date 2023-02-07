package uts;
public class Pasien {
    public String nama;
    Obat[] ob;
    
    public int hitungBiaya(){
        int biaya = 0;
        for (Obat obat : ob) {
            biaya += obat.getHarga();
        }
        return biaya;
    }
    
    public void print(){
        System.out.println("Nama Pasien : "+nama);
        System.out.println("--- Daftar obat ---");
        for (int i = 0; i < ob.length; i++) {
            System.out.println("Obat "+(i+1));
            ob[i].print();
        }
        System.out.println("-----------------------");
        System.out.println("Biaya Total : "+hitungBiaya());
        System.out.println("-----------------------");
    }
}