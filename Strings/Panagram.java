/*
Panagram: A panagram is a sentence that contains every letter of the 
alphabet at least once.
Example: "The quick brown fox jumps over the lazy dog" is a panagram.
*/
package Strings;
import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        boolean isPanagram = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                isPanagram = false;
                break;
            }
        }
        System.out.println(isPanagram ? "PANAGRAM" : "NOT PANAGRAM");
    }
}
