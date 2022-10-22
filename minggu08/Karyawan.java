package minggu08;
public class Karyawan {
    private String nama, nip, gol;
    private double gaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getGol() {
        return gol;
    }

    public void setGol(String gol) {
        this.gol = gol;
        switch(gol.charAt(0)){
            case '1':this.gaji=5000000;
            break;
            case '2':this.gaji=3000000;
            break;
            case '3':this.gaji=2000000;
            break;
            case '4':this.gaji=1000000;
            break;
            case '5':this.gaji=750000;
            break;
        }
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}