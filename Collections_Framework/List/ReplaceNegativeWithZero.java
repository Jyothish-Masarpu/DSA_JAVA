package Collections_Framework.List;
/*
Problem: Replace All Negative Numbers with 0
Input:
[1, -2, 3, -4, 5]
Output:
[1, 0, 3, 0, 5]
Approach:
Traverse the ArrayList.
If an element is negative, replace it with 0 using set().
Otherwise, keep the element unchanged.
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class ReplaceNegativeWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (list.get(i) < 0) {
                list.set(i, 0);
            }
        }
        System.out.println("List after replacing negative numbers with 0: " + list);
        sc.close();
    }
}
