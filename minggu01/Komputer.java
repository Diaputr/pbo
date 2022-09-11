package minggu01;
public class Komputer {
    private String processor;
    private int ram, hdd;
    
    void start(){
        System.out.println("--START--");
    }
    
    void shutdown(){
        System.out.println("--SHUTDOWN--");
    }
    
    void reboot(){
        System.out.println("--REBOOT--");
    }
    
    void display(){
        System.out.println("--DISPLAY--");
    }
}