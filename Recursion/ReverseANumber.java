package Recursion;
// Method 1//
/*
public class ReverseANumber {
    static String rev(int n){
        if(n==0) return "";
        return n%10+rev(n/10);
    }
	public static void main(String[] args) {
		System.out.println("rev(23456) = "+rev(23456));
	}
}
*/
// Method 2//
/*
public class ReverseANumber {
    static int rev(int n,int res){
        if(n==0) return res;
        return rev(n/10,res*10+n%10);
    }
    public static void main(String[] args) {
        System.out.println("rev(23456) = "+rev(23456,0));
    }
}
*/
// Method 3//
public class ReverseANumber {
    static int reverse=0;
    static void rev(int n){
        if(n==0) return;
        int digit=n%10;
        reverse=reverse*10+digit;
        rev(n/10);
    }
    public static void main(String[] args) {
        int n=12345;
        rev(n);
        System.out.println("reverse of "+n+" = "+reverse);
    }
}
