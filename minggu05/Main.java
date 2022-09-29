package workspace;
public class Main {
    public static void main(String[] args) {
        SegiEmpat s4 = new SegiEmpat(5, 6);
        SegiTigaSamaKaki s3 = new SegiTigaSamaKaki(3, 2);
        SetengahLingkaran ling = new SetengahLingkaran(7);
        
        BangunCampuran bc = new BangunCampuran(s4, s3, ling);
        System.out.println(bc.hitungLuasTotal());
    }
}