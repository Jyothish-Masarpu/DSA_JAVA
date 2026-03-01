package BitManipulation;
public class EvenOdd {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + " is " + (isEven(n) ? "even" : "odd"));
    }
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
