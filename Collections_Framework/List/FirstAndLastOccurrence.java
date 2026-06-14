package Collections_Framework.List;
/*
Problem: Find First and Last Occurrence Index of a Given Element
Input:
[10, 20, 30, 20, 40, 20]
x = 20
Output:
First Occurrence: 1
Last Occurrence: 5
Approach:
Traverse the ArrayList once.
When the element is found for the first time, store its index in 'first'.
Keep updating 'last' whenever the element is found.
If the element is not present, both indices remain -1.
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the element to find: ");
        int x = sc.nextInt();
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (list.get(i).equals(x)) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
        sc.close();
    }
}
