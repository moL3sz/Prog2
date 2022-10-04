
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // System.out.println(capitalCities);
        // System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        // capitalCities.clear();

        System.out.println(capitalCities.size());
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }
        for (String values : capitalCities.values()) {
            System.out.println(values);
        }
        for (String key : capitalCities.keySet()) {
            System.out.println(String.format("key: %s - value: %s", key, capitalCities.get(key)));
        }

        new HashMap<>() {
            {
                put("Zöldség", new ArrayList<String>(Arrays.asList("Répa", "Retek", "Karalábé", "Karfiol")));
                put("Gyömülcs", new ArrayList<String>(Arrays.asList("Alam", "Körte", "Szilva", "Barack")));
            }
        }.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        HashMap<Integer, Person> szemelyek = new HashMap<>();
        szemelyek.put(Person.getId(), new Person("A", 12));
        szemelyek.put(Person.getId(), new Person("B", 32));
        szemelyek.put(Person.getId(), new Person("C", 24));
        szemelyek.put(Person.getId(), new Person("D", 87));
        szemelyek.put(Person.getId(), new Person("E", 42));
        szemelyek.put(Person.getId(), new Person("F", 55));

        System.out.println(AtlagEletkor(szemelyek));
    }

    static Integer AtlagEletkor(HashMap<Integer, Person> szemelyek){
        Integer atlag= 0;
        for(var szemely : szemelyek.values()){
            atlag += szemely.getKor();
        }

        return atlag / szemelyek.size();
    }
}