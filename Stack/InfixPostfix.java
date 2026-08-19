package Stack;
/*
Infix:
(A+B)*C-D/E

Postfix:
AB+C*DE/-
*/
import java.util.*;
class InfixPostfix{
    public static void main (String[] args) {
        IP obj=new IP();
        String exp="(A+B)*C-D/E";
        System.out.println(obj.infixtopostfix(exp));
    }
}
class IP{
    String infixtopostfix(String exp){
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && stack.peek()!='(' && (precedence(stack.peek())>precedence(ch) || (precedence(stack.peek())==precedence(ch) && ch!='^'))){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    int precedence(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/' || ch=='%') return 2;
        if(ch=='+'|| ch=='-') return 1;
        return 0;
    }
}
