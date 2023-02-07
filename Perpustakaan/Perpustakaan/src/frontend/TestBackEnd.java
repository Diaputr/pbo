package frontend;
import backend.*;
import java.util.ArrayList;
public class TestBackEnd {
    public static void main(String[] args) {
        //test kategori
        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");

        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();

        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();

        // test delete
//        kat3.delete();

        // test select all
//        ArrayList<Kategori> all = new Kategori().getAll();
//        System.out.println("All: " + all.size());
//        for (Kategori k : all) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }

        // test search
//        for (Kategori k : new Kategori().search("ilmiah")) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
        
//        test anggota
        Anggota a1 = new Anggota("Diah Putri", "Malang", "089263482239");
        Anggota a2 = new Anggota("Agus Yogi", "Malang", "082363442552");
        Anggota a3 = new Anggota("Hiko Yana", "Kyoto", "08836248232");

        // test insert
//        a1.save();
//        a2.save();
//        a3.save();

        // test update
//        a2.setAlamat("Kota Kucing");
//        a2.save();

//        // test delete
//        a3.delete();

        // test select all 
        
//        for (Anggota a : new Anggota().getAll()) {
//            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat());
//        }

        // test search
//        for (Anggota a : new Anggota().search("Malang")) {
//            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat());
//        }
        
        //test buku
        Kategori novel = new Kategori().getById(22);
        Kategori referensi = new Kategori().getById(20);
//
        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
//        buku1.save();
//        buku2.save();

        // test update
//        buku2.setJudul("Aljabar Linier");
//        buku2.save();

        // test delete
//        buku3.delete();

        // test select all
//        for (Buku b : new Buku().getAll()) {
//            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
//        }

        // test search
//        for (Buku b : new Buku().search("timun")) {
//            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
//        }

    }
}