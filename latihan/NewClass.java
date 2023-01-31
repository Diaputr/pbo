package latihan;
public class NewClass {
    public static void main(String[] args) {
        Mobil m1 = new Mobil("N2343AB", "Avanza", 5, 2200);
        Mobil m2 = new Mobil("N4535B", "Innova", 5, 3000);
        Mobil m3 = new Mobil("N67457CE", "Xenia", 5, 2000);
        Mobil m[] = {m1, m2, m3};
        
        System.out.println("--- Anggota Reguler ---");
        AnggotaReguler a1 = new AnggotaReguler("R001", "Toni", m);
        a1.tampilData();
        
        System.out.println();
        
        AnggotaPremium a2 = new AnggotaPremium("P001", "Budi", m);
        System.out.println("--- Anggota Premium ---");
        a2.tampilData();
    }
}