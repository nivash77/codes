//Valid Triangle Number-> the problem is to count how many triplets (i, j, k) can form a triangle such that nums[i] + nums[j] > nums[k].

import java.util.*;
class Solution {
    public int triangleNumber(int[] nums) {
    Arrays.sort(nums);
     int a=0;
     int b=0;
     int c=0;
     for(int i=2;i<nums.length;i++)
     {
        a=0;
        b=i-1;
        while(a<b)
        {
            if(nums[a]+nums[b]>nums[i])
            {
                c+=b-a;
                b--;
            }
            else{
                a++;
            }
        }
     }   
     return c;
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
        int result = solution.triangleNumber(nums);
        System.out.println(result);
    }
}
// Input: nums = [2,2,3,4]
// Output: 3