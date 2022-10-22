package minggu07;
public class StaffTetap extends Staff{
    public String gol;
    public int asuransi;

    public StaffTetap() {
    }

    public StaffTetap(String nama, String alamat, int umur, String jk, int gaji, String gol, int asuransi, int lembur, int potongan) {
        super(lembur, potongan, nama, alamat, umur, jk, gaji);
        this.gol = gol;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetap(){
        System.out.println("---------Data Staff Tetap---------");
        super.tampilDataStaff();
        System.out.println("Golongan : "+gol);
        System.out.println("Jumlah Asuransi : Rp."+asuransi);
        System.out.println("Gaji Bersih : Rp."+(gaji+lembur-potongan-asuransi));
    }
}