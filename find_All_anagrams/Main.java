//Find all anagrams of p in s -> problem is to find all starting indices of p's anagrams in s.

import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> a=new ArrayList<>();
        if(p.length()>s.length()){
                return a;
        }
        int s1[]=new int[26];
        int p1[]=new int[26];
        for(int i=0;i<p.length();i++){
            s1[s.charAt(i)-'a']++;
            p1[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1,p1)){
            a.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            s1[s.charAt(i)-'a']++;
            s1[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(s1,p1)){
                a.add(i-p.length()+1);
            }
        }
        return a;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String p1 = s.nextLine();
        List<Integer> result = solution.findAnagrams(s1, p1);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
//Input: s = "cbaebabacd", p = "abc"
//Output: [0, 6]