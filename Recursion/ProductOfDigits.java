package Recursion;
public class ProductOfDigits {
    static int prod(int n){
        if(n<10) return n;
        return n%10*prod(n/10);
    }
    public static void main(String[] args) {
        System.out.println("Product of digits of 105 is: " + prod(105));
    }
}
