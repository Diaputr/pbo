package minggu01;
public class LemariBaju extends Lemari {
    private int jmlGantungan, jmlBaju;
    
    public void setGantung(int gt){
        jmlGantungan = gt;
    }
    
    public void simpanBaju(int bj){
        jmlBaju +=bj;
        if (jmlBaju <= jmlGantungan) {
            System.out.println(jmlBaju+" baju digantung");
        } else {
            System.out.println("**"+jmlGantungan+" baju digantung**");
            System.out.println("**"+(jmlBaju-jmlGantungan)+" baju dilipat**");
            System.out.println("----------------------");
            System.out.println("**Total "+jmlBaju+" baju**");
            System.out.println("----------------------");
        }
    }
    
    @Override
    public void cetakInfo(){
        System.out.println("--LEMARI BAJU--");
        super.cetakInfo();
        System.out.println("Gantungan : "+jmlGantungan+" pcs\n");
    }
}