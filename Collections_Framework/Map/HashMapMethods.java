package Collections_Framework.Map;
import java.util.*;
public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // put()
        map.put(101, "Java");
        map.put(102, "SQL");
        map.put(103, "Spring");
        map.put(104, "DSA");
        System.out.println("Map: " + map);
        // get()
        System.out.println("Value of 102: " + map.get(102));
        // getOrDefault()
        System.out.println("Value of 105: " + map.getOrDefault(105, "Not Found"));
        // containsKey()
        System.out.println("Contains key 103: " + map.containsKey(103));
        // containsValue()
        System.out.println("Contains value Java: " + map.containsValue("Java"));
        // remove()
        map.remove(104);
        System.out.println("After remove: " + map);
        // size()
        System.out.println("Size: " + map.size());
        // isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());
        // keySet()
        System.out.println("Keys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        // values()
        System.out.println("Values:");
        for (String value : map.values()) {
            System.out.println(value);
        }
        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}