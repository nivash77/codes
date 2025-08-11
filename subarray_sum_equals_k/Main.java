//Subarray Sum Equals K-> the problem is to find the number of continuous subarrays that sum to a given integer k.

import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
      Map<Integer,Integer> m=new HashMap<>();
      m.put(0,1);
      int sum=0;
      int c=0;
      for(int i:nums){
        sum+=i;
        if(m.containsKey(sum-k)){
            c+=m.get(sum-k);
        }
        m.put(sum,m.getOrDefault(sum,0)+1);
      }
        return c;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int result = solution.subarraySum(nums, k);
        System.out.println(result);
    }
}
// Input: nums = [1,1,1], k = 2
// Output: 2