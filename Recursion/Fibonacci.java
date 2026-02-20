package Recursion;
public class Fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        if(n<0){
            System.out.println("Input should be a non-negative integer.");
            return;
        }
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}
