//fruit into baskets-> problem is to find the maximum number of fruits that can be collected in two baskets, where each basket can only hold one type of fruit.

import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> a=new HashMap<>();
        int st=0,max=0;
        for(int i=0;i<fruits.length;i++){
            a.put(fruits[i],a.getOrDefault(fruits[i],0)+1);
            if(a.size()>2){
                while(a.containsKey(fruits[st])){
                    if(a.get(fruits[st])==1){
                        a.remove(fruits[st]);
                        st++;
                        break;
                    }
                    else{
                        a.put(fruits[st],a.get(fruits[st])-1);
                    }
                    st++;
                }

            }
            max=Math.max(i-st+1,max);
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] fruits = new int[n];
        for (int i = 0; i < n; i++) {
            fruits[i] = s.nextInt();
        }
        int result = solution.totalFruit(fruits);
        System.out.println(result);
    }
}
//Input: fruits = [1,2,1,2,3]
//Output: 4