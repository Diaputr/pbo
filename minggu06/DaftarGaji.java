package minggu06;
public class DaftarGaji {
    private int jmlPegawai = 0;
    private Pegawai listPegawai[];
    
    public DaftarGaji(int gaji) {
        listPegawai = new Pegawai[3];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jmlPegawai] = p;
        jmlPegawai++;
    }
    
    public void printSemuaGaji(){
        for (int i = 0; i < jmlPegawai; i++) {
            System.out.println("Gaji "+listPegawai[i].getNama()+" : Rp."+listPegawai[i].getGaji());
        }
    }
}