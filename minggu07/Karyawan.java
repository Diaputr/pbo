package minggu07;
public class Karyawan {
    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan() {
    }

    public Karyawan(String nama, String alamat, int umur, String jk, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void tampilDataKaryawan(){
        System.out.println("Nama\t: "+nama);
        System.out.println("Alamat\t: "+alamat);
        System.out.println("Gender\t: "+jk);
        System.out.println("Umur\t: "+umur+" th");
        System.out.println("Gaji\t: Rp."+gaji);
    }
}