package minggu11;
public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Hehehehe", "Abu-abu", "Kedelai", 4);
        keledai.displayData();
        System.out.println();
        Gorilla gorilla = new Gorilla("Haaum Hauum", "Hitam Manis", "Gulali", 4);
        gorilla.displayData();
        System.out.println();
        Singa singa = new Singa("Roaar Roaaar", "Coklat", "Cingacing", 4);
        singa.displayData();
    }
}