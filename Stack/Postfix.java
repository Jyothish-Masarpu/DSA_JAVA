package Stack;
import java.util.*;
class Postfix {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] tokens = {"5", "3", "+", "2", "*"};
        System.out.println(obj.evaluatepostfix(tokens));
    }
}
class Solution {
    public int evaluatepostfix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/") ||
               token.equals("%")) {
                int b = stack.pop();
                int a = stack.pop();
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
