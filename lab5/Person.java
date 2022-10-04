import java.util.Objects;

public class Person {
    private static int id = 0;
    String nev;
    Integer kor;

    public Person() {
        id++;
    }

    public Person(String nev, Integer kor) {
        this.nev = nev;
        this.kor = kor;
        id++;
    }
    public String getNev() {
        return this.nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getKor() {
        return this.kor;
    }

    public void setKor(Integer kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "{" +
            " nev='" + getNev() + "'" +
            ", kor='" + getKor() + "'" +
            "}";
    }
    public static int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(nev, person.nev) && Objects.equals(kor, person.kor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, kor);
    }




}

    