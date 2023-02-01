package minggu11;
public class Singa extends Binatang implements IKarnivora {
    private String suara, warnaBulu;

    public Singa(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan(){
        System.out.println("Jenis : Karnivora");
        System.out.println("Makanan : Daging");
    }
    
    public void displayData(){
        displayMakan();
        super.displayBinatang();
        System.out.println("Suara : "+suara);
        System.out.println("Warna Bulu : "+warnaBulu);
    }
}