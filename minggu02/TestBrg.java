package minggu02;
public class TestBrg {
    public static void main(String[] args) {
        Brg brg1 = new Brg();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        brg1.tambahStok(20);
    }
}