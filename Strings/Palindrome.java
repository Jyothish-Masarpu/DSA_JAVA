package Strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String s=sc.next();
        String reversed=new StringBuilder(s).reverse().toString();
        if(s.equals(reversed)){
            System.out.println("\""+s+"\" is a palindrome.");
        }
        else{
            System.out.println("\""+s+"\" is not a palindrome.");
        }
    }
}
