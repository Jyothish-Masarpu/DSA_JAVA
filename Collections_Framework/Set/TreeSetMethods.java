package Collections_Framework.Set;
import java.util.*;
public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(70);
        set.add(20);
        set.add(60);
        System.out.println(set);
        System.out.println("First : " + set.first());
        System.out.println("Last : " + set.last());
        //higher() means the least element in this set strictly greater
        // than the given element, or null if there is no such element.
        System.out.println("Higher : " + set.higher(20));
        System.out.println("Lower : " + set.lower(40));
        System.out.println("Ceiling : " + set.ceiling(21));
        System.out.println("Floor : " + set.floor(21));
        System.out.println("Poll First : " + set.pollFirst());
        System.out.println("Poll Last : " + set.pollLast());
        System.out.println(set);
    }
}