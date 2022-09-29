package minggu03;

public class Anggota {

    private int limit, jml;
    private String noKTP, nama;

    public Anggota(String noKTP, String nama, int limit) {
        this.noKTP = noKTP;
        this.limit = limit;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limit;
    }

    public int getJumlahPeminjaman() {
        return jml;
    }

    public void pinjam(int pinjaman) {
        if (pinjaman < limit) {
            jml += pinjaman;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    public void angsur(int angsuran) {
        if (jml > 0) {
            if (jml > angsuran) {
                if (angsuran >= (jml * 0.1)) {
                    jml -= angsuran;
                } else {
                    System.out.println("Maaf, angsuran minimal harus 10% dari jumlah pinjaman.");
                }
            } else {
                System.out.println("Pinjaman lunas, tersisa uang Rp." + (angsuran - jml));
                jml = 0;
            }
        } else {
            System.out.println(nama + " tidak memiliki pinjaman.");
        }
    }
}
