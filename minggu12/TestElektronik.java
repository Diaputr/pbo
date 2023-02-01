package minggu12;

/**
 *
 * @author Diah Putri
 */
public class TestElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TvJadul tvj = new TvJadul("DVI", 220);
        TvModern tvm = new TvModern("HDMI", 220);
        
        indro.nyalakanPerangkat(tvj);
        indro.nyalakanPerangkat(tvm);
    }
}
