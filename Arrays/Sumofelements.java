import java.util.Scanner;
public class Sumofelements {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        sc.close();
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
