package minggu03;
public class KoperasiDemo {
    public static void main(String[] args) {
        AnggotaKoperasi anggota1 = new AnggotaKoperasi("Puput", "Malang");
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
        anggota1.setNama("Diah Putri Nofianti");
        anggota1.setAlamat("Jl. Soekarno Hatta no. 10");
        anggota1.setor(100000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
        anggota1.pinjam(5000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
    }
}