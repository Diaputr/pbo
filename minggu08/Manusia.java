package minggu08;
public class Manusia {
    
    public void bernafas(){
        System.out.println("Manusia harus bernafas");
    }
    
    public void makan(){
        System.out.println("Manusia harus makan");
    }
}

class Dosen extends Manusia {
    
    @Override
    public void makan(){
        System.out.println("Dosen harus makan");
    }
    
    public void lembur(){
        System.out.println("Dosen sering lembur");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan(){
        System.out.println("Mahasiswa harus makan");   
    }
    
    public void tidur(){
        System.out.println("Mahasiswa sering tidur");
    }
}

class Implementasi {
    public static void main(String[] args) {
        Manusia m = new Mahasiswa();
        Manusia man = new Dosen();
        System.out.println("=== Dosen ===");
        man.bernafas();
        man.makan();
        System.out.println("\n=== Mahasiswa ===");
        m.bernafas();
        m.makan();
    }
}