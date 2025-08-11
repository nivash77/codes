//longest repeating characters replacement -> problem is to find the length of the longest substring that can be formed by replacing at most k characters

import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int st=0;
        int  s1[]=new int[26];
        int max=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            s1[s.charAt(i)-'A']++;
            c=Math.max(c,s1[s.charAt(i)-'A']);
            while(i-st-c+1>k){
                s1[s.charAt(st)-'A']--;
                st++;
            }
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
        int k = s.nextInt();
        int result = solution.characterReplacement(s1, k);
        System.out.println(result);
    }
}
// Input: s = "AABABBA", k = 1
// Output: 4