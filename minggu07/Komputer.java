package minggu07;
public class Komputer {
    public String merk;
    public int kecProsesor, sizeMemory;
    public String jnsProsesor;

    public Komputer() {
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData(){
        System.out.println("Merk : "+merk);
        System.out.println("Kecepatan Prosesor : "+kecProsesor);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("Jenis Prosesor : "+jnsProsesor);
    }
}