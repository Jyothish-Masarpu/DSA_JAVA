package Collections_Framework.Map;
import java.util.*;
public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        // put()
        map.put(40, "Java");
        map.put(10, "SQL");
        map.put(70, "Spring");
        map.put(20, "DSA");
        map.put(60, "HTML");
        System.out.println("Map: " + map);
        // get()
        System.out.println("Value of 20: " + map.get(20));
        // containsKey()
        System.out.println("Contains key 40: " + map.containsKey(40));
        // remove()
        map.remove(60);
        System.out.println("After remove: " + map);
        // firstKey()
        System.out.println("First key: " + map.firstKey());
        // lastKey()
        System.out.println("Last key: " + map.lastKey());
        // higherKey()
        System.out.println("Higher than 20: " + map.higherKey(20));
        // lowerKey()
        System.out.println("Lower than 40: " + map.lowerKey(40));
        // ceilingKey()
        System.out.println("Ceiling of 25: " + map.ceilingKey(25));
        // floorKey()
        System.out.println("Floor of 25: " + map.floorKey(25));
        // pollFirstEntry()
        System.out.println("First entry removed: " + map.pollFirstEntry());
        // pollLastEntry()
        System.out.println("Last entry removed: " + map.pollLastEntry());
        System.out.println("Map: " + map);
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
    }
}
