//Maximum Points you obtain from cards-> the problem is to find the maximum points you can obtain by picking cards from either begin or  end of an array of integers, with a limit on the number of cards you can pick.


import java.util.*;
class Solution {
    public int maxScore(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        for(int i=k-1;i>=0;i--){
            sum-=nums[i];
            sum+=nums[nums.length-k+i];
            max=Math.max(max,sum);
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
        int result = solution.maxScore(nums, k);
        System.out.println(result);
    }
}
// Input: nums = [1,2,3,4,5,6,1], k=3;
// Output: 12