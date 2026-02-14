package Recursion;
public class PowerOfANumber {
    static int pow(int b,int e){
        if(e==0) return 1;
        int halfpower=pow(b,e/2);
        if(e%2==0){
            return halfpower*halfpower;
        }
        else{
            return b*halfpower*halfpower;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
