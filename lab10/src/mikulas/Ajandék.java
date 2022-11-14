package mikulas;


public class Ajandék implements Comparable<Ajandék> {

    protected String nev;
    protected Double tomeg;
    protected Integer ar;

    public Ajandék(String nev, Double tomeg, Integer ar) {
        this.nev = nev;
        this.tomeg = tomeg;
        this.ar = ar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ajandék ajandék = (Ajandék) o;

        if (this.nev.equals(ajandék.nev) && Math.abs(this.tomeg - ajandék.tomeg) <= 1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s (%s kg) %s Ft", this.nev, this.tomeg, this.ar) ;
    }

    @Override
    public int compareTo(Ajandék o) {
        if (o.ar.equals(this.ar)) {
            return this.nev.compareTo(o.nev);
        } else {
            return this.ar.compareTo(o.ar) *-1;
        }
    }
}
