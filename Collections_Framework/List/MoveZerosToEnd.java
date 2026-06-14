package Collections_Framework.List;
/*
Problem: Move All Zeroes to the End While Preserving Order
Input:
[0, 1, 0, 3, 12]
Output:
[1, 3, 12, 0, 0]
Approach:
Use a pointer 'k' to track the position where the next non-zero
element should be placed.
First pass:
Move all non-zero elements to the front.
Second pass:
Fill the remaining positions with 0.
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) != 0) {
                list.set(k, list.get(i));
                k++;
            }
        }
        for (int i = k; i < n; i++) {
            list.set(i, 0);
        }
        System.out.println("Array after moving zeros to the end: " + list);
        sc.close();
    }
}
