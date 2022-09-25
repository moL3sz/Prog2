
/*
 * 
 * 
 * javac = Java Compile -> a byte kodot egy ugynevett java virtualis gépen (JVM) -on futtatja le interpreter modon.
 *  Utasitasrol utasitasra a bytekodot forditja le.
 * JVM -> ez lehetővé teszi h a java platform független legyen (32bit v 64bit, x64, x86, arm)
 */


class Kutya{

    private String nev;
    private double suly;
    private Boolean merges;

    public Kutya(){
        this.nev = "Buksi";
        this.suly = 5.2d;
    }
    public String getNev(){
        return this.nev;
    }
    public String Ugat(){
        return this.merges ? "GRrgrgr" : "Vauvau";
        
    }
    public void setMerges(Boolean merges){
        this.merges = merges;
    }

}

public class eloadas2{
    public static void main(String[] args){
        Kutya k1 = new Kutya();
        k1.setMerges(true);
        System.out.println(k1.Ugat());

        System.out.println(k1.getNev());
    }
}










/*
 * 
 * 
 * 
 * 

 a kutya lehet mérges és nem mérges

 mérges kutya -> grggrgr
 nem mérges -> vauvau
 más a viselkedes


 */




/*
 * 3. alapelv
 * 
 * Egységbezárás - Encapsulation
 * Öröklődés - Inheritance
 * Többalakúság - Polymoriphsm
 */



 /*
 * 3. alapelv
 * 
 * Példánynak van belső állapota -> kivülről nem modosihato csak belülről! (tilos publikus mezőket használni)
 * Öröklődés - Inheritance -> a gyermek osztály megörökli az ős felületét és megvalósítását.
 * Többalakúság - Polymoriphsm -> egy példány bármelyik felületén keresztül használhatjuk (k1 Kutya, k1 Object) 
 * 
 * 2. tétel
 * konstruktor -> beálltja az alap statet
 * megegyezik a neve az osztály nevét
 * ha nem alkotsz konstrutktort akkor is lesz automata, (explicit, publikus) 0 paraméteres - > egyetelen egy dolgot csinál -> az ős 0 paraméteres konstruktoart hivja meg
 * ba bármilyen konstruktort irunk akkor már nem lesz explicit konstruktorod
 * konstrukroban illik minden mezőr beállítani ugyanakkor nem muszáj,
 * ha egy mezőnek nem adok kezdő értéket, sem deklarációban sem konstruktorban akkor a mező a tipusanak megfelelőle alapértelemzett értek lesz
 * String = null;
 * int = 0;
 * 
 * egy lokális változo értékadás jobb oldálan nem használhatsz de mezőt igen
 * 
 * a konstrukotrokat hivasi láncba lehet helyezni (this, super)
 *
 */