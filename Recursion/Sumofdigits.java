package Recursion;
import java.util.*;
public class Sumofdigits {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
		long n=sc.nextLong();
        sc.close();
		System.out.println(sumofdigits(n));
	}
	static long sumofdigits(long n){
	    if(n==0) return 0;
	    return n%10+sumofdigits(n/10);
	}
}
