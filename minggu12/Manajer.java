package minggu12;

/**
 *
 * @author Diah Putri
 */
public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(int tunjangan, String nama, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return super.getGaji(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTunjangan() {
        return tunjangan;
    }
    
    
}
