package minggu04;
public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        Pegawai asisten = new Pegawai("0002", "Diah Putri Nofianti");
        keretaApi.setAsisten(asisten);
        System.out.println(keretaApi.info());
    }
}