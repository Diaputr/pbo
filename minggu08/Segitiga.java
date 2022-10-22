package minggu08;
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    
    public int keliling(int sudutA, int sudutB, int sudutC){
        return sudutA + sudutB + sudutC;
    }
    
    public double keliling(int sudutA, int sudutB){
        double sudutC = Math.sqrt(Math.pow(sudutA, 2) + Math.pow(sudutB, 2));
        return sudutA + sudutB + sudutC;
    }
}

class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Sudut : "+s.totalSudut(100));
        System.out.println("Keliling : "+s.keliling(3, 6));
        System.out.println("Keliling : "+s.keliling(3, 4, 5));
    }
}