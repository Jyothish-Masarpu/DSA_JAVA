package Recursion;
public class TableOfANumber {
    static int table(int n,int i){
        if(i>10) return 0;
        System.out.println(n+" x "+i+" = "+n*i);
        return table(n,i+1);
    }
    public static void main(String[] args) {
        int n=5;
        table(n,1);
    }
}
