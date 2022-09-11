package minggu02;
public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        
        k.operan1 = 3;
        k.operan2 = 5;
        k.tambah();
        System.out.println(k.hasil);
        k.kurang();
        System.out.println(k.hasil);
        k.kali();
        System.out.println(k.hasil);
        k.bagi();
        System.out.println(k.hasil);
    }
}