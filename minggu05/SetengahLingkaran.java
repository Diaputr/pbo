package workspace;
public class SetengahLingkaran {
    private int jariJari;

    public SetengahLingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungLuas(){
        return (Math.PI*jariJari*jariJari)/2;
    }
}