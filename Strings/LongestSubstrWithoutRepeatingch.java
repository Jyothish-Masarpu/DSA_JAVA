/*
Leetcode Problem: 3. Longest Substring Without Repeating Characters
reference: https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/
package Strings;
import java.util.HashMap;
public class LongestSubstrWithoutRepeatingch {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0, left = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }
            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubstrWithoutRepeatingch solution = new LongestSubstrWithoutRepeatingch();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
    }
}
