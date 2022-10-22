package minggu06;
public class KelasA {
    protected int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void getNilai(){
        System.out.println("Nilai X : "+x);
        System.out.println("Nilai Y : "+y);
    }
}