package Recursion;
public class CountDigitsOfaNum {
    public static int countdigits(int n){
        if(n==0) return 0;
        return 1+countdigits(n/10);
    }
    public static void main(String[] args) {
        int num=123;
        System.out.println(num==0?1:countdigits(num));
    }
}
