package Recursion;
import java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num=sc.nextLong();
        sc.close();
        if(num<0){
            System.out.println("Enter a positive number");
            return;
        }
        System.out.println("Factorial of "+num+" is: "+fact(num));
    }
    static long fact(long n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}
