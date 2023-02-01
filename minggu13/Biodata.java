package minggu14;
import javax.swing.ButtonModel;
public class Biodata {
    private String nim, nama, jurusan, gender, alamat;
    private boolean baca, makan, tidur;

    public Biodata() {
    }

    public Biodata(String nim, String nama, String jurusan, String gender, String alamat, boolean baca, boolean makan, boolean tidur) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.gender = gender;
        this.alamat = alamat;
        this.baca = baca;
        this.makan = makan;
        this.tidur = tidur;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isBaca() {
        return baca;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public boolean isMakan() {
        return makan;
    }

    public void setMakan(boolean makan) {
        this.makan = makan;
    }

    public boolean isTidur() {
        return tidur;
    }

    public void setTidur(boolean tidur) {
        this.tidur = tidur;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----- Biodata -----\n");
        sb.append("NIM : ").append(nim).append("\n");
        sb.append("Nama : ").append(nama).append("\n");
        sb.append("Jurusan : ").append(jurusan).append("\n");
        sb.append("Gender : ").append(gender).append("\n");
        sb.append("Hobi : ");
        if (baca)
            sb.append("baca").append("\n");
        if (makan)
            sb.append("makan").append("\n");
        if (tidur)
            sb.append("tidur").append("\n");
        sb.append("\nAlamat : ").append(alamat).append("\n");
        return sb.toString();
    }
}