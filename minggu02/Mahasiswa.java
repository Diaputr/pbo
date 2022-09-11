package minggu02;
public class Mahasiswa {
    public String alamat, nama, kelas;
    public int nim;

    public void tampilBiodata(){
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Kelas : "+kelas);
    }
}