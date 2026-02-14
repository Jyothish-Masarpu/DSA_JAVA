package Recursion;
public class SumOfFirstNNaturalnums {
    static int printnum(int n){
        if(n<=1) return n;
        return n+printnum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(printnum(100));
    }
}
