/*
LeetCode Problem: 58. Length of Last Word
reference: https://leetcode.com/problems/length-of-last-word/
*/
package Strings;
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            else{
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        String input = "Hello World";
        int result = solution.lengthOfLastWord(input);
        System.out.println("Length of the last word in \"" + input + "\" is: " + result);
    }
}