package latihan;
public class RekeningTabungan {
    public String noRek, namaNasabah, alamat;
    public int saldo;
    
    public void tarik(int uang){
        saldo -= uang;
    }
    
    public void setor(int uang){
        saldo += uang;
    }
    
    public void tampilData(){
        System.out.println("No. Rekening : "+noRek);
        System.out.println("Nama Nasabah : "+namaNasabah);
        System.out.println("Alamat : "+alamat);
        System.out.println("Saldo : Rp."+saldo);
        System.out.println("-----------------------------------------");
    }
    
    public static void main(String[] args) {
       RekeningTabungan rt = new RekeningTabungan();
       rt.noRek = "213892PWJ";
       rt.namaNasabah = "Putri";
       rt.alamat = "Malang";
       rt.saldo = 630000;
       rt.tampilData();
       rt.tarik(200000);
       rt.tampilData();
       rt.setor(350000);
       rt.tampilData();
    }
}