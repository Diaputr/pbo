package minggu01;
public class Brankas extends Lemari{
    private String jenisArsip, sandi;
    
    public void simpanArsip(String ar){
        System.out.println("\n**"+ar+" disimpan di brankas**");
    }
    
    public void setSandi(String pw){
        sandi = pw;
    }
    
    public boolean isEempty(){
        sandi = "";
        return true;
    }
    
    @Override
    public void cetakInfo(){
        System.out.println("--BRANKAS--");
        super.cetakInfo();
        if (!isEempty()) {
            System.out.println("Sandi telah diatsur");
        } else {
            System.out.println("Sandi belum diatur");
        }
    }
}