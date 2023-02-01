package minggu12;

/**
 *
 * @author Diah Putri
 */
public class TvJadul extends Elektronik {
    private String modeInput;

    public TvJadul() {
    }

    public TvJadul(String modeInput) {
        this.modeInput = modeInput;
    }

    public TvJadul(String modeInput, int voltase) {
        super(voltase);
        this.modeInput = modeInput;
    }
    
    public String getModeInput() {
        return modeInput;
    }
    
    
}
