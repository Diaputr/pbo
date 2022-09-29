package kuis;
public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.setKode("111");
        b1.setJudul("Matahari Senja");
        b1.setPengarang("Anjasmara");
        b1.setThnTerbit(2002);
        
        Buku b2 = new Buku();
        b2.setKode("222");
        b2.setJudul("Indahnya Bulan");
        b2.setPengarang("Mariposa");
        b2.setThnTerbit(2018);
        
        Buku b3 = new Buku();
        b3.setKode("333");
        b3.setJudul("Nina Malam");
        b3.setPengarang("Kupu-kupu");
        b3.setThnTerbit(2010);
         
        Member m1 = new Member();
        m1.setId("M123");
        m1.setNama("Putri");
        Buku b[] = {b1, b2, b3};
        m1.setBuku(b);
        m1.tampilData();
        System.out.println();
        m1.tampilBukuTerbaru();
        m1.tampilBukuTerlama();
    }
}