package Collections_Framework.List;
/*
Problem: Check Whether the ArrayList is Sorted or Not
Input:
[1, 2, 3, 4, 5]
Output:
true
Approach:
Traverse the ArrayList and compare each element
with its previous element.
If any element is smaller than its previous element,
the list is not sorted.
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (list.get(i) < list.get(i - 1)) {
                sorted = false;
                break;
            }
        }
        System.out.println("Is the list sorted? " + sorted);
        sc.close();
    }
}
