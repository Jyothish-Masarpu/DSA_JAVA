package Collections_Framework.List;
/*
Problem: Find Largest and Smallest Element in an ArrayList
Input:
[10, 20, 30, 40, 50]
Output:
Smallest: 10
Largest: 50
Approach:
Initialize both minimum and maximum with the first element.
Traverse the ArrayList and update:
- max if a larger element is found
- min if a smaller element is found
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        if (n == 0) {
            sc.close();
            System.out.println("List is empty");
            return;
        }
        System.out.println("Enter elements: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 1; i < n; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
        sc.close();
    }
}
