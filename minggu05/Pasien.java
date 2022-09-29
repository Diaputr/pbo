package latihan;
public class Pasien {
    public String nama, alamat, jenis;
    
    public void tampilData(){
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Jenis : "+jenis);
    }
    
    public int hitungTotalBiaya(){
        return hitungTarifDokter()+hitungTarifObat();
    }
    
    private int hitungTarifDokter(){
        if (jenis.equalsIgnoreCase("umum")) {
            return 7500;
        } else {
            return 0;
        }
    }
    
    private int hitungTarifObat(){
         if (jenis.equalsIgnoreCase("umum")) {
            return 15000;
        } else if (jenis.equalsIgnoreCase("asuransi")){
            return 12000;
        } else {
            System.out.println("Jenis pasien salah");
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Pasien p1 = new Pasien();
        p1.nama = "Anda";
        p1.jenis = "Umum";
        p1.alamat = "Malang";
        p1.tampilData();
        System.out.println("Biaya : Rp."+p1.hitungTotalBiaya());
        System.out.println("-----------------------------------------");
        Pasien p2 = new Pasien();
        p2.nama = "Saya";
        p2.jenis = "Asuransi";
        p2.alamat = "Malang";
        p2.tampilData();
        System.out.println("Biaya : Rp."+p2.hitungTotalBiaya());
        System.out.println("-----------------------------------------");
        Pasien p3 = new Pasien();
        p3.nama = "No Name";
        p3.jenis = "Tidak";
        p3.alamat = "Malang";
        p3.tampilData();
        System.out.println("Biaya : Rp."+p3.hitungTotalBiaya());
    }
}