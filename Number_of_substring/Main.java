//Number of Substrings Containing All Three Characters-> the problem is to count the number of substrings that contain all three characters 'a', 'b', and 'c'.

import java.util.*;
class Solution {
    public int numberOfSubstrings(String s) {
        int f[]=new int[3];
        int l=0;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
            while(f[0]>0 && f[1]>0 && f[2]>0)
            {
                f[s.charAt(l)-'a']--;
                l++;
            }
            sum+=l;
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int result = solution.numberOfSubstrings(s1);
        System.out.println(result);
    }
}
// Input: s = "abcabc"
// Output: 10