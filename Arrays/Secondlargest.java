import java.util.*;
public class Secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE; 
        for(int num:arr){
            if(num>largest){
                secondlargest=largest;
                largest=num;
            }
            else if(num>secondlargest && num!=largest){
                secondlargest=num;
            }
        }
        System.out.println(secondlargest==Integer.MIN_VALUE?"No second largest element":"The second largest element is: " + secondlargest);
    }
}