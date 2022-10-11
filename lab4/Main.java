import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Auto kocsi1 = new Auto("Opel", "Corsa", 100);
        Auto kocsi5 = new Auto("Audi", "A2", 100);
        
        Auto kocsi2 = new Auto("Suzuki", "Turbo Swift", 230);
        Auto kocsi3 = new Auto();
        Auto kocsi4 = new Auto("Opel", "Corsa", 70);
        //kocsi2.setLoero(-80);
        
        System.out.println(kocsi1.getTipus());
        System.out.println(kocsi2.getTipus());
        System.out.println(kocsi3.getMarka());
        System.out.println(Auto.getCount());
        System.out.println(kocsi1.equals(kocsi4));
        ArrayList<Auto> autok = new ArrayList<>();
        autok.add(kocsi1);
        autok.add(kocsi2);
        autok.add(kocsi3);
        autok.add(kocsi4);
        autok.add(kocsi5);


        System.out.println(autok);

        Collections.sort(autok);
        System.out.println("\nRendezve az autok:");
        System.out.println(autok);

    }
}
