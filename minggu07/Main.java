package minggu07;
public class Main {
    public static void main(String[] args) {
        Mac m = new Mac("macOS", "Lithium-polymer", "MacBook Air", 3, 8, "M1");
        Windows w = new Windows("Windows 10", "Lithium-ion", "Lenovo Ideapad", 2, 4, "AMD");
        Pc p = new Pc(20, "Asus", 3, 4, "Intel core i5");
        System.out.println("------------------------------");
        System.out.println("\tTampil data Mac");
        System.out.println("------------------------------");
        m.tampilMac();
        System.out.println("------------------------------");
        System.out.println("     Tampil data Windows");
        System.out.println("------------------------------");
        w.tampilWindows();
        System.out.println("------------------------------");
        System.out.println("\tTampil data PC");
        System.out.println("------------------------------");
        p.tampilPc();
    }
}