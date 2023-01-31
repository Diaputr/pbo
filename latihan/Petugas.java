package latihan;
public class Petugas {
    private String nip, nama;

    public Petugas(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
    }
}