package latihan;
public class PacMan {
    int x, y;
    
    void kanan(){
        if (x < 50){
            x += 5;
        }
    }
    
    void kiri(){
        if(x > 0){
            x -= 5;
        }
    }
    
    void atas(){
        if(y > 0){
            y -= 3;
        }
    }
    
    void bawah(){
        if(y < 25){
            y += 3;
        }
    }
    
    void tampilPosisi(){
        System.out.println("Posisi x : "+x);
        System.out.println("Posisi y : "+y);
    }
    
    public static void main(String[] args) {
        PacMan p = new PacMan();
        p.x = 45;
        p.atas();
        p.kiri();
        p.kanan();
        p.kanan();
        p.kanan();
        p.kiri();
        p.tampilPosisi();
    }
}