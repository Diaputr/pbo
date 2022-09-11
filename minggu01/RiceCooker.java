package minggu01;
public class RiceCooker {
    private String merk, tipe;
    
    void setTypeMerk(String nama, String kode){
        merk = nama;
        tipe = kode;
    }
    
    int colokListrik(int x){
        if (x==0) {
            System.out.println("**"+merk+" tidak terhubung ke listrik**");
        } else if (x==1){
            System.out.println("**"+merk+" terhubung ke listrik**");
        }
        return x;
    }
        
    void masakNasi(int y){
        int z = colokListrik(y);
        if (z==0) {
            System.out.println("**"+merk+" tidak bisa menanak nasi**");
        } else if (z==1){
            System.out.println("**"+merk+" menanak nasi**");
        }
    }

    void cetakInfo(){
        System.out.println("--RICE COOKER--");
        System.out.println("Merk : "+merk);
        System.out.println("Tipe : "+tipe+"\n");
    }
}