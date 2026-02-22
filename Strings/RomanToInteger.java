/*
Leetcode Problem: 13. Roman to Integer
reference: https://leetcode.com/problems/roman-to-integer/
*/
package Strings;
public class RomanToInteger {
    class Solution {  
     public int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}
    public static void main(String[] args) {
        Solution solution = new RomanToInteger().new Solution();
        String romanNumeral = "MCMXCIV";
        int result = solution.romanToInt(romanNumeral);
        System.out.println("The integer value of Roman numeral " + romanNumeral + " is: " + result);
    }
}
