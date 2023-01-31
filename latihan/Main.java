package latihan;
public class Main {
    static void menu(){
        System.out.println("1. Daftar Buku");
        System.out.println("2. Daftar Anggota");
        System.out.println("3. Tambah Peminjaman");
        System.out.println("4. Keluar");
    }
    
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("1313", "Yohan", "1A");
        Mahasiswa m2 = new Mahasiswa("3825", "Bruno", "2A");
        Petugas p1 = new Petugas("2471", "Anja");
        Buku b1 = new Buku("23642", "Malang Melintang", "Riani Hiadika");
        Buku b2 = new Buku("41485", "Cara Menjadi UwU", "Neko Shima");
        Peminjaman pj = new Peminjaman("111", "01-01-2022", b1, m2, p1);
        pj.tampilData();
    }
}