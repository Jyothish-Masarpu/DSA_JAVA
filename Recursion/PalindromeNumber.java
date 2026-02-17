package Recursion;
public class PalindromeNumber {
    static int reverse(int n,int res){
        if(n==0) return res;
        return reverse(n/10,res*10+n%10);
    }
    static String pal(int n){
        int rev=reverse(n,0);
        if(rev==n) return "Palindrome";
        return "Not Palindrome";
    }
	public static void main(String[] args) {
	    int n=12321;
	    System.out.println("Is "+n+" a palindrome? "+pal(n));
	}
}
