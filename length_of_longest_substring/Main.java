//Length of Longest Substring Without Repeating Characters-> problem is to find the length of the longest substring without repeating characters.

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean t[]=new boolean[128];
        int st=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            while(t[s.charAt(i)]){
                t[s.charAt(st)]=false;
                st++;
            }
            t[s.charAt(i)]=true;
            max=Math.max(max,i-st+1);
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int result = solution.lengthOfLongestSubstring(s1);
        System.out.println(result);
    }
}
// Input: s = "abcabcbb"
// Output: 3