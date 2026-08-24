package Strings;
import java.util.*;
public class ReverseStringWordWise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sc.close();
        int end=str.length()-1;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                int start=i+1;
                for(int j=start;j<=end;j++){
                    sb.append(str.charAt(j));
                }
                sb.append(' ');
                end=i-1;
            }
        }
        for(int i=0;i<=end;i++){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
