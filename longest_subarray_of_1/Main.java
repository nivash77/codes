// longest subarray of 1-> problem is to find the length of the longest subarray containing only 1's after removing one

import java.util.*;
class Solution {
    public int longestSubarray(int[] nums) {
        int z=1;
        int st=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z--;
            }
            while(z<0){
                if(nums[st]==0){
                    z++;
                }
                st++;
            }
            max=Math.max(max,i-st);
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int result = solution.longestSubarray(nums);
        System.out.println(result);
    }
}
//Input: nums = [1,1,0,1,1,1]
//Output: 5