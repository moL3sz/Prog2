import mikulas.*;

import java.util.*;

public class Main {
    public static void main(String[] args){



        Ajandék a1 = new Ajandék("Lambda2", 1.0d, 2000);
        Ajandék a2 = new Ajandék("Lambda1", 2.1d, 2000);
        Ajandék a3 = new Ajandék("Lambda1", 1.0d, 3000);
        Ajandék a4 = new Gyerekjáték("Kiskocsi", 2.0, 100000, 9);

        List<Ajandék> ajandékList = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));
        ajandékList.forEach((ajandek)->{
            System.out.println(ajandek.toString());
        });
        System.out.println("Rendezés után");
        Collections.sort(ajandékList);

        ajandékList.forEach((ajandek)->{
            System.out.println(ajandek.toString());
        });

        Puttony puttony = new Puttony("Neki");
        puttony.setAjandekok(ajandékList);
        System.out.println(puttony.toString());


    }
}