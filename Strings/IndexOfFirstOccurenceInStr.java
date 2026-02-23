/*
Leetcode Problem: 28. Implement strStr()
reference: https://leetcode.com/problems/implement-strstr/
*/
package Strings;
public class IndexOfFirstOccurenceInStr {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        for(int i=0;i<=haystack.length()-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        IndexOfFirstOccurenceInStr solution = new IndexOfFirstOccurenceInStr();
        String haystack = "hello";
        String needle = "ll";
        int result = solution.strStr(haystack, needle);
        System.out.println("The index of the first occurrence of \"" + needle + "\" in \"" + haystack + "\" is: " + result);
    }
}
