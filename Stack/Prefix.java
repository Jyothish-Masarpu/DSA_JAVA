package Stack;
import java.util.*;
class Prefix {
    public static void main(String[] args) {
        PrefixSolution obj = new PrefixSolution();
        String[] tokens = {"*", "+", "5", "3", "2"};
        System.out.println(obj.evaluatePrefix(tokens));
    }
}
class PrefixSolution {
    public int evaluatePrefix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = tokens.length - 1; i >= 0; --i) {
            String token = tokens[i];
            if(token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/") ||
               token.equals("%")) {
                int a = stack.pop();
                int b = stack.pop();
                if(token.equals("+")) {
                    stack.push(a + b);
                }
                else if(token.equals("-")) {
                    stack.push(a - b);
                }
                else if(token.equals("*")) {
                    stack.push(a * b);
                }
                else if(token.equals("/")) {
                    stack.push(a / b);
                }
                else {
                    stack.push(a % b);
                }
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
