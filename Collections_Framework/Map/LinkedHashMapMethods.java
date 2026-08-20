package Collections_Framework.Map;
import java.util.*;
public class LinkedHashMapMethods {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        // put()
        map.put(103, "Spring");
        map.put(101, "Java");
        map.put(104, "DSA");
        map.put(102, "SQL");
        System.out.println("Map: " + map);
        // get()
        System.out.println("Value of 101: " + map.get(101));
        // getOrDefault()
        System.out.println(
            "Value of 105: " + map.getOrDefault(105, "Not Found")
        );
        // containsKey()
        System.out.println("Contains key 102: " + map.containsKey(102));
        // remove()
        map.remove(104);
        System.out.println("After remove: " + map);
        // size()
        System.out.println("Size: " + map.size());
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