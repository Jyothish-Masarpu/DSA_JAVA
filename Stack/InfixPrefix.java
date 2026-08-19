package Stack;
/*
Infix:
(A+B^C)*(D-E/F)+G%H
Prefix:
+*+A^BC-D/EF%GH
*/
import java.util.*;
class InfixPrefix{
    public static void main (String[] args) {
        Sol obj=new Sol();
        String exp="(A+B^C)*(D-E/F)+G%H";
        System.out.println(obj.infixtoprefix(exp));
    }
}
class Sol{
    String infixtoprefix(String exp){
        StringBuilder reversed=new StringBuilder();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch=='('){
                reversed.append(')');
            }
            else if(ch==')'){
                reversed.append('(');
            }
            else{
                reversed.append(ch);
            }
        }
        String postfix=infixtopostfix(reversed.toString());
        return new StringBuilder(postfix).reverse().toString();
    }
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
