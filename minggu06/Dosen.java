package minggu06;
public class Dosen extends Pegawai {
    private int jumlahSKS;
    private static int tarifSKS = 50000;
    
    public Dosen(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return super.getGaji()+(jumlahSKS*tarifSKS); 
    }
}