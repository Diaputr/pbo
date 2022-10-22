package minggu06;
public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("D123", "Ariana", "Jl. Sudirman");
        Dosen d2 = new Dosen("D234", "Boby", "Jl. Maliaro");
        Dosen d3 = new Dosen("D345", "Chiara", "Jl. Presiden");
        DaftarGaji dg = new DaftarGaji(100000);
        dg.addPegawai(d1);
        dg.addPegawai(d2);
        dg.addPegawai(d3);
        d1.setGaji(1000000);
        d2.setGaji(2000000);
        d3.setGaji(3000000);
        dg.printSemuaGaji();
    }
}