package minggu01;
public class Demo {
    public static void main(String[] args) {
        RiceCooker rc = new RiceCooker();
        rc.setTypeMerk("Magicku", "Xa-3529");
        rc.cetakInfo();
        rc.masakNasi(1);
        
        Blender bl = new Blender();
        System.out.println();
        bl.setMerk("Eanimu", 4, "Kaca");
        bl.cetakInfo();
        bl.buatJus("apel");
        
        Lemari lm = new Lemari();
        System.out.println("\n--LEMARI--");
        lm.setLemari("Kayu jati", 187);
        lm.cetakInfo();
        lm.simpanBenda("bendera");
        
        LemariBaju lb = new LemariBaju();
        System.out.println();
        lb.setLemari("Besi", 200);
        lb.setGantung(20);
        lb.cetakInfo();
        lb.simpanBaju(30);
        
        Brankas br = new Brankas();
        System.out.println();
        br.setLemari("Baja", 50);
        br.cetakInfo();
        br.simpanArsip("Black card");
    }
}