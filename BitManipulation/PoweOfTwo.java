package BitManipulation;
public class PoweOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("Is " + n + " a power of two? " + isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
