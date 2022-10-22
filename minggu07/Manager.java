package minggu07;
public class Manager extends Karyawan {
    public int tunjangan;

    public Manager() {
    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan : Rp."+tunjangan);
        System.out.println("Total Gaji : Rp."+(super.gaji+tunjangan));
    }
}