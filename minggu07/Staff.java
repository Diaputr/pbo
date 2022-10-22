package minggu07;
public class Staff extends Karyawan {
    public int lembur, potongan;
    
    public Staff() {
    }

    public Staff(int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(nama, alamat, umur, jk, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur  : Rp."+lembur);
        System.out.println("Potongan : Rp."+potongan);
        System.out.println("Total Gaji : Rp."+(gaji+lembur-potongan));
    }
}