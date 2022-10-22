package minggu07;
public class Inheritance1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.nama = "Vivin";
        m.alamat = "Jl. Vinolia";
        m.umur = 25;
        m.jk = "Perempuan";
        m.gaji = 3000000;
        m.tunjangan = 1000000;
        m.tampilDataManager();
        
        System.out.println();
        
        Staff s = new Staff();
        s.nama = "Lestari";
        s.alamat = "Malang";
        s.umur = 25;
        s.jk = "Perempuan";
        s.gaji = 2000000;
        s.lembur = 500000;
        s.potongan = 250000;
        s.tampilDataStaff();
 
        System.out.println();
        
        StaffTetap st  = new StaffTetap("Budi", "Malang", 20, "Laki-laki", 2000000, "2A", 100000, 200000, 250000);
        st.tampilStaffTetap();
        
        System.out.println();
        
        StaffHarian sh  = new StaffHarian(100, 100000, 50000, "Indah", "Malang", 27, "Perempuan", 10000);
        sh.tampilStaffHarian();
    }
}