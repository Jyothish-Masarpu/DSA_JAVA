/*
Leetcode Problem: 20. Valid Parentheses
reference: https://leetcode.com/problems/valid-parentheses/
*/
package Stack;
import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray())
        {
            switch (ch)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String input = "{[]})";
        boolean result = solution.isValid(input);
        System.out.println("Is the string \"" + input + "\" valid? " + result);
    }
}
