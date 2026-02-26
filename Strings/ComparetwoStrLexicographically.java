/*
package Strings;
public class ComparetwoStrLexicographically {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically smaller than \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str2 + "\"");
        }
    }
}
    */
//Method 2: without using compareTo() method
package Strings;
import java.util.Scanner;
public class ComparetwoStrLexicographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();
        sc.close();
        int minLength = Math.min(str1.length(), str2.length());
        int result = 0;
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if (result == 0) {
            result = str1.length() - str2.length();
        }
        if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically smaller than \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically equal to \"" + str2 + "\"");
        }
    }
}

