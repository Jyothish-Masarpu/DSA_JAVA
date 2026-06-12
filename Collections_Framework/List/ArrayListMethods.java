package Collections_Framework.List;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(10);
        list.add(20);
        list.add(30);
        // add at index
        list.add(1, 15);
        // get
        System.out.println("Element at index 2: " + list.get(2));
        // set - Replace value at index 0 with 100.
        list.set(0, 100);
        // contains
        System.out.println("Contains 20: " + list.contains(20));
        // indexOf
        System.out.println("Index of 30: " + list.indexOf(30));
        // remove by index
        list.remove(1);
        // remove by object
        list.remove(Integer.valueOf(20));
        // size
        System.out.println("Size: " + list.size());
        // isEmpty
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("List: " + list);
        // clear
        list.clear();
        System.out.println("List: " + list);
    }
}
