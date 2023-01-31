package latihan;
public class Lingkaran {
    float phi, r;
    
    float hitungLuas(){
        return phi*r*r;
    }
    
    float hitungKeliling(){
        return phi*2*r;
    }
    
    public static void main(String[] args) {
        Lingkaran lr = new Lingkaran();
        lr.phi = 3.14f;
        lr.r = 20;
        System.out.println("Keliling : "+lr.hitungKeliling());
        System.out.println("Luas : "+lr.hitungLuas());
    }
}