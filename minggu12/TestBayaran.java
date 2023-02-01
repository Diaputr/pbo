package minggu12;

/**
 *
 * @author Diah Putri
 */
public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer(50, "Agus", 800);
        Programmer prog = new Programmer(30, "Budi", 600);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran Manajer Rp."+hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer Rp."+hr.hitungBayaran(prog));
    }
}
