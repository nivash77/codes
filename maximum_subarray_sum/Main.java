// Maximum Subarray Sum with Length k-> problem is to find the maximum sum of a subarray of length k in an array of integers without repeating elements.
import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,max=0;
        int st=0;
        Set<Integer> a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            while(a.contains(nums[i])){
                a.remove(nums[st]);
                sum-=nums[st];
                st++;
            }
            sum+=nums[i];
            a.add(nums[i]);
            if(i-st+1>k){
            a.remove(nums[st]);
            sum-=nums[st];
            st++;
            }
            if(i-st+1==k){
            max=Math.max(max,sum);
            //sum=0;
                }

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
        long result = solution.maximumSubarraySum(nums, k);
        System.out.println(result);
    }
}
// Input: nums = [1,2,3,4,5], k = 3
// Output: 12