//Sliding Window Maximum-> problem is to find the maximum value in each sliding window of size k in an array of integers.

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         if(nums.length<=1||k==1){
            return nums;
        }
        int sol[]=new int[nums.length-k+1];
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            while(!l.isEmpty() && l.getFirst()<i-k+1){
                l.pollFirst();
            }
            while(!l.isEmpty() && nums[l.getLast()]<nums[i]){
                l.pollLast();
            }
            l.addLast(i);
            if(i>=k-1){
                sol[i-k+1]=nums[l.getFirst()];
            }
        }
        return sol;
    }

}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int k = 3;
        int[] result = solution.maxSlidingWindow(nums, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]