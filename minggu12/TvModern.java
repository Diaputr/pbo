package minggu12;

/**
 *
 * @author Diah Putri
 */
public class TvModern extends Elektronik {
    private String modeInput;

    public TvModern() {
    }

    public TvModern(String modeInput) {
        this.modeInput = modeInput;
    }

    public TvModern(String modeInput, int voltase) {
        super(voltase);
        this.modeInput = modeInput;
    }

    public String getModeInput() {
        return modeInput;
    }
       
}
