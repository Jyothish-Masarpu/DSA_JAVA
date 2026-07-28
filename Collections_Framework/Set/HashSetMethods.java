package Collections_Framework.Set;
import java.util.*;
public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);   // Duplicate ignored
        System.out.println("After add(): " + set);
        // contains()
        System.out.println("Contains 20 : " + set.contains(20));
        // remove()
        set.remove(10);
        System.out.println("After remove(): " + set);
        // size()
        System.out.println("Size : " + set.size());
        // isEmpty()
        System.out.println("Is Empty : " + set.isEmpty());
        // addAll()
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);
        set.addAll(set2);
        System.out.println("After addAll(): " + set);
        // containsAll()
        System.out.println(set.containsAll(set2));
        // removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);
        // retainAll()
        HashSet<Integer> set3 = new HashSet<>();
        set3.add(20);
        set3.add(30);
        set.retainAll(set3);
        System.out.println("After retainAll(): " + set);
        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
        // iterator()
        HashSet<Integer> set4 = new HashSet<>();
        set4.add(100);
        set4.add(200);
        set4.add(300);
        Iterator<Integer> it = set4.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
