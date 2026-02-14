package Recursion;
public class NumbersFromNto1 {
    static int printnum(int s,int e){
        if(s<e) return 0;
        System.out.print(s+" ");
        return printnum(s-1, e);
    }
    public static void main(String[] args) {
        int n=25;
        printnum(n,1);
    }
}
