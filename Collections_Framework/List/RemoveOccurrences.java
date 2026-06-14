package Collections_Framework.List;
/*
Problem: Remove All Occurrences of a Given Element
Input:
[10, 20, 30, 20, 40, 20]
x = 20
Output:
[10, 30, 40]
Approach:
Traverse from the end of the ArrayList.
If an element equals x, remove it.
Traversing backwards avoids skipping elements after removal.
*/
import java.util.*;
public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the element to remove: ");
        int x = sc.nextInt();
        sc.close();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(x)) {
                list.remove(i);
            }
        }
        System.out.println("List after removing all occurrences of " + x + ": " + list);
    }
}
