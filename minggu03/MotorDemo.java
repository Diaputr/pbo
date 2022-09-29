package minggu03;
public class MotorDemo {
    public static void main(String[] args) {
        Motor m = new Motor();
        m.printStatus();
        m.tambahKecepatan();
        
        m.nyalakanMesin();
        m.printStatus();
        
        m.tambahKecepatan();
        m.printStatus();
        
        m.tambahKecepatan();
        m.printStatus();
        
        m.tambahKecepatan();
        m.printStatus();
        
        m.matikanMesin();
        m.printStatus();
    }
}