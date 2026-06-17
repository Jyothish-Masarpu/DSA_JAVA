package Collections_Framework.List;
/*
Problem: Merge Two ArrayLists Without Duplicates
Input:
List1 = [1, 2, 3]
List2 = [3, 4, 5]
Output:
[1, 2, 3, 4, 5]
Approach:
Traverse both lists.
Use a HashSet to keep track of elements already added.
Add only unique elements to the result list.
Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/
import java.util.*;
public class MergeTwoListsWithoutDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in List 1: ");
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.print("Enter the elements of List 1: ");
        for(int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        System.out.print("Enter the number of elements in List 2: ");
        int m = sc.nextInt();
        List<Integer> list2 = new ArrayList<>();
        System.out.print("Enter the elements of List 2: ");
        for(int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int num : list1) {
            if(seen.add(num)) {
                res.add(num);
            }
        }
        for(int num : list2) {
            if(seen.add(num)) {
                res.add(num);
            }
        }
        System.out.print("Merged list without duplicates: ");
        System.out.println(res);
        sc.close();
    }
}
