package Collections_Framework.Set;
import java.util.*;
public class LinkedHashSetMethods {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(10);
        System.out.println(set);
        System.out.println(set.contains(50));
        set.remove(20);
        System.out.println(set);
        for(Integer x : set){
            System.out.println(x);
        }
    }
}