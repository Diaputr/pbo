package minggu12;

/**
 *
 * @author Diah Putri
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TvJadul) {
            System.out.println("Nyalakan tv jadul dengan input : "+((TvJadul) perangkat).getModeInput());
            System.out.println("Voltase tv : "+((TvJadul) perangkat).getVoltase());
        } else if (perangkat instanceof TvModern){
            System.out.println("Nyalakan tv modern dengan input : "+((TvModern) perangkat).getModeInput());
            System.out.println("Voltase tv : "+((TvModern) perangkat).getVoltase());
        }
    }
}
