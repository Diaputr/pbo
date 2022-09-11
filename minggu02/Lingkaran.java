package minggu02;
public class Lingkaran {
    double phi, r;

    double hitungLuas(){
        return phi*r*r;
    }
    
    double hitungKeliling(){
        return phi*2*r;
    }
    
    public static void main(String[] args) {
        Lingkaran lr = new Lingkaran();
        lr.phi = 3.14;
        lr.r = 20;
        System.out.println("Keliling : "+lr.hitungKeliling());
        System.out.println("Luas : "+lr.hitungLuas());
    }
}