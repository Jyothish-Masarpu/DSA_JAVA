import java.util.Scanner;
public class BuyandSellStock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int min=arr[0];
        int max=0;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        max=Math.max(max,i-min);
        }
        System.out.println(max);
    }
}

