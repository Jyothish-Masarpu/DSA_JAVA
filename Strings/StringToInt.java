/*
Leetcode: 8. String to Integer (atoi)
reference: https://leetcode.com/problems/string-to-integer-atoi/
Input: s = "1337c0d3"
Output: 1337
*/
package Strings;
public class StringToInt {
    public static void main(String[] args) {
        String s="1337c0d3";
        int res=myAtoi(s);
        System.out.println("result: " + res);
    }
    public static int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int i=0;
        int sign=1;
        long res=0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            res=res*10+(s.charAt(i)-'0');
            if(sign==-1 && -res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign==1 && res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;

        }
       return (int) res*sign; 
    }
}
