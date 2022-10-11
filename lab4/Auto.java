import java.util.Comparator;
import java.util.Objects;

public class Auto implements Comparable<Auto>, Comparator<Auto> {
    private String marka;
    private String tipus;
    private int loero;
    private static int count = 0;

    public Auto(String marka, String tipus, int loero) {
        this.marka = marka;
        this.tipus = tipus;
        this.loero = loero;
        Auto.count++;
    }

    public Auto() {
        this.marka = "";
        this.loero = 0;
        this.tipus = "";
        Auto.count++;
    }

    public Auto(String marka, int loero) {
        this.marka = marka;
        this.tipus = "?";
        this.loero = loero;
        Auto.count++;
    }

    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return this.tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getLoero() {
        return this.loero;
    }

    public void setLoero(int loero) throws Exception {
        if (loero < 0) {
            System.out.println("0-n ál nagyobb lőerő kell");
            throw new Exception("0-n ál nagyobb lőerő kell");
        }
        this.loero = loero;
    }

    public static int getCount() {
        return Auto.count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Auto)) {
            return false;
        }
        Auto auto = (Auto) o;
        return Objects.equals(marka, auto.marka) && Objects.equals(tipus, auto.tipus) && loero == auto.loero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, tipus, loero);
    }

    @Override
    public String toString() {
        return "{" +
                " marka='" + getMarka() + "'" +
                ", tipus='" + getTipus() + "'" +
                ", loero='" + getLoero() + "'" +
                "}";
    }

    public int compareTipus(Auto a1, Auto a2){
        return a1.getTipus().compareTo(a2.getTipus());
    }

    @Override
    public int compare(Auto a1, Auto a2) {
        if (a1.getLoero() < a2.getLoero()){
            return -1;
        }
        else if(a1.getLoero() > a2.getLoero()){
            return 1;
        }
        else{
            return compareTipus(a1, a2);
        }
    }

    @Override
    public int compareTo(Auto a) {
        return compare(this, a);
    }

}
