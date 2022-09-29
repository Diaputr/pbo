package minggu03;
import java.util.Scanner;
public class TestKoperasi {
    static Anggota donny = new Anggota("111333444", "Donny", 5000000);
    static void menu() {
        System.out.println("-----------------------------------");
        System.out.println("\t--- PILIH MENU ---");
        System.out.println("1. Pinjam");
        System.out.println("2. Angsur");
        System.out.println("3. Keluar");
        System.out.println("-----------------------------------");
    }
    
    static void cekPinjam(){
        System.out.println("Jumlah pinjaman saat ini: Rp." + donny.getJumlahPeminjaman());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("   -- KOPERASI SIMPAN PINJAM --");
        System.out.println("-----------------------------------");
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: Rp." + donny.getLimitPeminjaman());
        int pilih, uang;
        do {
            menu();
            System.out.print("Masukkan pilihan : ");
            pilih = input.nextInt();
            System.out.println("-----------------------------------");
            switch (pilih) {
                case 1:
                    System.out.print("Pinjam uang : Rp.");
                    uang = input.nextInt();
                    donny.pinjam(uang);
                    cekPinjam();
                    break;
                case 2:
                    System.out.print("Bayar angsuran : Rp.");
                    uang = input.nextInt();
                    donny.angsur(uang);
                    cekPinjam();
                    break;
            }
        } while (pilih == 1 || pilih == 2);
    }
}