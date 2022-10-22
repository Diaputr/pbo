package minggu07;
public class Windows extends Laptop {
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur : "+fitur);
    }
}