package latihan;
public class Bintang {
    int n;
    
    void gambarPersegiPenuh(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }
    
    void gambarPersegiKosong(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1) System.out.print("*");
                else {
                    if(j == 0 || j == n-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    void gambarSegitigaSiku(){
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j <= i; j++) {
                if (j == n-j) System.out.println(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    void gambarSegitigaSikuTerbalik(){
        for (int i = 0; i < n; i++) { 
            for (int j = n; j > i; j--) {
                if (j == n-j) System.out.println(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    void gambarSegitigaSikuBolakBalik(){
        //gambarSegitigaSiku();
        //gambarSegitigaSikuTerbalik();
    }
    
    void gambarSegitigaSikuCampur(){
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) {
                if (j == n-j) System.out.println(" ");
                else {
                    if (i%2 == 0) System.out.print(i);
                    else System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Bintang b = new Bintang();
        b.n = 5;
        b.gambarPersegiPenuh();
        b.gambarPersegiKosong();
        b.gambarSegitigaSiku();
        b.gambarSegitigaSikuTerbalik();
        //b.gambarSegitigaSikuBolakBalik();
        b.gambarSegitigaSikuCampur();
    }
}