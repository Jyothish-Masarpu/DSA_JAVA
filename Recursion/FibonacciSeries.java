package Recursion;
public class FibonacciSeries {
    static void fib(int a,int b,int n){
        if(n==0) return;
        System.out.print(a+" ");
        fib(b,a+b,n-1);
    }
	public static void main(String[] args) {
	    int n=8;
        System.out.println("Fibonacci Series of " + n + " numbers:");
		fib(0,1,n);
	}
}
