package Collections_Framework.List;
/*
Problem: Reverse an ArrayList Without Using Library Functions
Input:
[1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
Approach:
Use two pointers:
- left starts from the beginning
- right starts from the end
Swap elements at left and right positions,
then move both pointers towards the center.
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class ReverseArrayList {
    static void swap(List<Integer> list, int left, int right) {
        int temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            swap(list, left, right);
            left++;
            right--;
        }
        System.out.println("Reversed ArrayList: " + list);
        sc.close();
    }
}
