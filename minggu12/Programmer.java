package minggu12;

/**
 *
 * @author Diah Putri
 */
public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(int bonus, String nama, int gaji) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return super.getGaji(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBonus() {
        return bonus;
    }
    
    
}
