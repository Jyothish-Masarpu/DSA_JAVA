package Recursion;
public class PalindromeString {
    static String pal(String n,int l,int r){
        if(l>=r) return "Palindrome";
        if(n.charAt(l)!=n.charAt(r)){
            return "Not Palindrome";
        }
        return pal(n,l+1,r-1);
    }
	public static void main(String[] args) {
	    String s="level";
		System.out.println("Is "+s+" a palindrome? "+pal(s,0,s.length()-1));
	}
}
