package minggu01;
public class Blender {
    private int jmlPisau;
    private String merk, bahanWadah;
    
    public void setMerk(String nama, int pisau, String wadah){
        merk = nama;
        jmlPisau = pisau;
        bahanWadah = wadah;
    }
    
    public void buatJus(String buah){
        System.out.println("**"+merk+" sedang membuat jus "+buah+"**");
    }
    
    public void cetakInfo(){
        System.out.println("--BLENDER--");
        System.out.println("Merk : "+merk);
        System.out.println("Bahan : "+bahanWadah);
        System.out.println("Mata pisau : "+jmlPisau+"\n");
    }
}