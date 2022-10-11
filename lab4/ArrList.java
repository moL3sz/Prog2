import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Rendezes implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        return Integer.compare(x, y);
    }
}

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(72);
        numbers.add(27);
        numbers.add(45);
        numbers.add(98);
        numbers.add(40);

        System.out.println(numbers.get(0));

        numbers.set(0, 21);
        numbers.remove(0);
        System.out.println(numbers.size());
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        System.out.println();
        for (Integer integer : numbers) {
            System.out.println(integer);

        }
        System.out.println();
        System.out.println("Sorting...");
        numbers.sort((x, y) -> y - x);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        System.out.println();
        String a[] = new String[] { "A", "B", "C", "D" };
        List<String> list = Arrays.asList(a);
        System.out.println("The list is" + list);

        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(1);
        linked.add(2);
        linked.add(3);
        linked.add(4);
        linked.add(5);

    }

}