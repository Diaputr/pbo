package minggu11;
public class InterfaceMain {
    public static void main(String[] args) {
        //IBerprestasi prestasi = new IBerprestasi();
        
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        
        pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(masterCumlaude);
    }
}