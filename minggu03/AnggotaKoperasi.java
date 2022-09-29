package minggu03;
public class AnggotaKoperasi {
    private String nama, alamat;
    private float simpanan;

    public AnggotaKoperasi(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setNama(String n){
        nama = n;
    }
    
    public void setAlamat(String a){
        alamat = a;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public float getSimpanan(){
        return simpanan;
    }
    
    public void setor(float uang){
        simpanan += uang;
    }
    
    public void pinjam(float uang){
        simpanan -= uang;
    } 
}