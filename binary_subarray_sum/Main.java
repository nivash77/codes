//Number of Sub-arrays with Given Sum-> the problem is to count the number of subarrays that sum to a given integer goal.
import java.util.Scanner;
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int a[]=new int[nums.length+1];
        a[0]=1;
        int count=0;
        for(int i:nums){
            sum+=i;
            if(sum>=goal)
            count+=a[sum-goal];

            a[sum]++;
            
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int goal = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int result = solution.numSubarraysWithSum(nums, goal);
        System.out.println(result);
    }
} 
// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4