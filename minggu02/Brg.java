package minggu02;
public class Brg {
    public String namaBrg, jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang : "+namaBrg);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok : "+stok);
    }
    
    void tambahStok(int brgMasuk){
        stok+=brgMasuk;
        System.out.println("Stok baru adalah "+stok);
    }
}