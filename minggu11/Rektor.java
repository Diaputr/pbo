package minggu11;
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat CUMLAUDE");
        System.out.println("Selamat! Silahkan perkenalan diri Anda..");
        mahasiswa.salamKenal();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("--------------------------------------------");
    }
}