package mikulas;

public class Gyerekjáték extends Ajandék {
    protected Integer korhatar;
    public Gyerekjáték(String nev, Double tomeg, Integer ar, Integer korhatar) {
        super(nev, tomeg, ar);
        this.korhatar =korhatar;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %d éves kortól!", this.korhatar) ;
    }
}
