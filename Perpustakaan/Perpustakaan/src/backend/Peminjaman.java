package backend;
import java.util.ArrayList;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tglPinjam, tglKembali;

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tglPinjam, String tglKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }
    
    public Peminjaman getById(int id){
        Peminjaman pjm = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "p.*, a.*, b.* "
                + "FROM peminjaman p "
                + "LEFT JOIN anggota a "
                + "ON a.idanggota = p.idanggota "
                + "LEFT JOIN buku b "
                + "ON p.idbuku = b.idbuku"
                + "WHERE b.idpeminjaman = '"+id+"'");
        try {
            while (rs.next()) {                
                pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.setTglPinjam(rs.getString("tanggalpinjam"));
                pjm.setTglKembali(rs.getString("tanggalkembali"));
                pjm.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getBuku().setIdbuku(rs.getInt("idbuku"));
                pjm.getBuku().setJudul(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pjm;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> listPinjam = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "p.*, a.*, b.* "
                + "FROM peminjaman p "
                + "LEFT JOIN anggota a "
                + "ON a.idanggota = p.idanggota "
                + "LEFT JOIN buku b "
                + "ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {                
                Peminjaman pjm = new Peminjaman();
                pjm.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pjm.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pjm.getBuku().setIdbuku(rs.getInt("idbuku"));
                
                pjm.setTglPinjam(rs.getString("tanggalpinjam"));
                pjm.setTglKembali(rs.getString("tanggalkembali"));
                pjm.getAnggota().setNama(rs.getString("nama"));
                pjm.getBuku().setJudul(rs.getString("judul"));
                listPinjam.add(pjm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPinjam;
    }
    
    public void save(){
        if (getById(idPeminjaman).getIdPeminjaman()== 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES ("
                    + "  '" + this.getAnggota().getIdanggota() + "', "
                    + "  '" + this.getBuku().getIdbuku()+ "', "
                    + "  '" + this.tglPinjam + "', "
                    + "  '" + this.tglKembali + "' "
                    + "  )";
            this.idPeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.getAnggota().getIdanggota() 
                    + "', idbuku = '" + this.getBuku().getIdbuku()
                    + "', tanggalpinjam = '" + this.tglPinjam
                    + "', tanggalkembali = '" + this.tglKembali + "' WHERE "
                    + "idpeminjaman = '" + this.idPeminjaman + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '"+this.idPeminjaman+"'";
            DBHelper.executeQuery(SQL);
    }
}