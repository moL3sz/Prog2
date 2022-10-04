import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HSet {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HashSet<String> gyomolcsok = new HashSet();
        gyomolcsok.add("banan");
        gyomolcsok.add("körte");
        gyomolcsok.add("körte");
        gyomolcsok.add("alma");
        gyomolcsok.add("szilva");

        System.out.println(gyomolcsok);
        System.out.println(gyomolcsok.contains("körte"));
        gyomolcsok.remove("alma");
        System.out.println(gyomolcsok.size());
        for (String gyomolcs : gyomolcsok) {
            System.out.println(gyomolcs);
        }

        Set<Person> persons = new HashSet<>();
        persons.add(new Person("a", 11));
        persons.add(new Person("a", 6));
        persons.add(new Person("b", 3));
        persons.add(new Person("e", 16));
        persons.add(new Person("c", 15));
        persons.add(new Person("c", 5));

        Iterator<String> it = gyomolcsok.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterator<Person> pit = persons.iterator();
        while (pit.hasNext()) {
            Person p = pit.next();
            if (p.getKor() <= 5) {
                pit.remove();
            }
        }
        Iterator<Person> pit2 = persons.iterator();
        Integer id = 0;
        HashMap<Integer, Person> hashmap = new HashMap<>();
        while (pit2.hasNext()) {
            hashmap.put(id++, pit2.next());
        }
        System.out.println(hashmap);
    }
}
