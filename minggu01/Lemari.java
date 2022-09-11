package minggu01;
public class Lemari {
    String bahan;
    int ukuran;
    
    public void setLemari(String bhn, int uk){
        bahan = bhn;
        ukuran = uk;
    }
    
    public void simpanBenda(String benda){
        System.out.println("\n**Menyimpan "+benda+" di dalam lemari**");
    }
    
    public void cetakInfo(){
        System.out.println("Bahan : "+bahan);
        System.out.println("Ukuran : "+ukuran+" cm");
    }
}