//max_consecutive_ones-> problem is to find the maximum number of consecutive 1's in a binary array.

import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int st=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k--;
            }
            while(k<0){
                if(nums[st]==0){
                    k++;
                }
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
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int k = s.nextInt();
        int result = solution.longestOnes(nums, k);
        System.out.println(result);
    }
}

//Input: nums = [1,1,0,0,1,1,1,0], k = 2
//Output: 6