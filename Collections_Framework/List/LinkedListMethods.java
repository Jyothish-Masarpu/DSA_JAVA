package Collections_Framework.List;
import java.util.*;
public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.contains(20));
        System.out.println(list.size());
    }
}
