package Collections_Framework.List;
/*
Problem: Keep Only Common Elements Between Two ArrayLists
Input:
List1 = [1, 2, 2, 3]
List2 = [2, 3]
Output:
[2, 3]
Approach:
Store elements of the second list in a HashSet.
Traverse the first list.
If an element exists in the second list and has not been added before,
add it to the result list.
Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/
import java.util.*;
public class CommonElements {
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
        System.out.print("Enter the elements of List 2: ");
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        Set<Integer> set2 = new HashSet<>(list2);
        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int num : list1) {
            if(set2.contains(num) && seen.add(num)) {
                res.add(num);
            }
        }
        System.out.print("Common elements between the two lists: ");
        System.out.println(res);
        sc.close();
    }
}
