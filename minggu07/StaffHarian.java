package minggu07;
public class StaffHarian extends Staff {
    public int jmlJamKerja;

    public StaffHarian() {
    }

    public StaffHarian(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(lembur, potongan, nama, alamat, umur, jk, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("---------Data Staff Harian---------");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja : "+jmlJamKerja);
        System.out.println("Gaji Bersih : Rp."+(gaji*jmlJamKerja+lembur-potongan));
    }
}