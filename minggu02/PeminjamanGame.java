package minggu02;
public class PeminjamanGame {
    private String id, namaMember, namaGame;
    private int harga;

    public PeminjamanGame(String id, String namaMember, String namaGame, int harga) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.harga = harga;
    }
    
    void hitungHarga(int hari){
        harga*=hari;
    }
    
    void tampilData(){
        System.out.println("ID : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga : "+harga);
    }
    
    public static void main(String[] args) {
        PeminjamanGame pg = new PeminjamanGame("123", "Putra", "Yakusoku no Neverland", 5000);
        pg.hitungHarga(4);
        pg.tampilData();
    }
}