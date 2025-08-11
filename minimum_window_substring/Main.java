// Minimum Window Substring-> problem is to find the minimum window in string s that contains all characters of string t.

import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
       if(s.length()<t.length()||s.length()==0||t.length()==0||s==null||t==null)
       return "";
       int f[]=new int[128];
       for(int i=0;i<t.length();i++){
        f[t.charAt(i)]++;
       }
       int st=0,str=0;
       int count=t.length();
       int min=Integer.MAX_VALUE;
       int i=0;
       char ch[]=s.toCharArray();
      while(i<ch.length){
        if(f[ch[i++]]-- >0){
            count--;
        }
        while(count==0){
            if(i-st<min){
                str=st;
                min=i-st;
            }
            if(f[ch[st++]]++ == 0){
                count++;
            }
        }
       }
       return (min==Integer.MAX_VALUE)? "": new String(ch,str,min);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String t1 = s.nextLine();
        String result = solution.minWindow(s1, t1);
        System.out.println(result);
    }
}
// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"