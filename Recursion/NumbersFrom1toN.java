package Recursion;
public class NumbersFrom1toN {
    static void printnum(int s,int e){
        if(s>e) return;
        System.out.print(s+" ");
        printnum(s+1, e);
    }
    public static void main(String[] args) {
        int n=100;
        printnum(1,n);
    }
}
