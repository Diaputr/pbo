package kuis;
public class Member {
    private String id, nama;
    private Buku buku[];

    public Member() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Buku[] getBuku() {
        return buku;
    }

    public void setBuku(Buku[] buku) {
        this.buku = buku;
    }
    
    public void tampilData(){
        System.out.println("\t-- DATA MEMBER --");
        System.out.println("ID : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("------- DAFTAR PINJAMAN BUKU -------");
        for (Buku bk : buku) {
            bk.tampilData();
        }
    }
    
    public void tampilBukuTerbaru(){
        int baru = buku[0].getThnTerbit(), count = 0;
        for (int i = 1; i < buku.length; i++) {
            if(buku[i].getThnTerbit() > baru){
                baru = buku[i].getThnTerbit();
                count++;
            }
        }
        System.out.println("\t-- BUKU TERBARU --");
        buku[count].tampilData();
    }
    
    public void tampilBukuTerlama(){
        int lama = buku[0].getThnTerbit(), count = 0;
        for (int i = 1; i < buku.length; i++) {
            if(buku[i].getThnTerbit() < lama){
                lama = buku[i].getThnTerbit();
                count++;
            }
        }
        System.out.println("\t-- BUKU TERLAMA --");
        buku[count].tampilData();
    }
}