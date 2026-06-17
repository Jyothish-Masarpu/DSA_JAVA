package Collections_Framework.List;
/*
Problem: Remove Duplicate Elements While Preserving Original Order
Input:
[1, 2, 2, 3, 1, 4]
Output:
[1, 2, 3, 4]
Approach:
Use a HashSet to track elements already seen.
If an element appears for the first time, add it to the result list.
This preserves the order of first occurrence.
Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.*;
public class RemoveDuplicatesPreserveOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int num : list) {
            if(seen.add(num)) {
                res.add(num);
            }
        }
        System.out.print("List after removing duplicates: ");
        System.out.println(res);
        sc.close();
    }
}