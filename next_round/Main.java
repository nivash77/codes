// next_round problem -> find the number of participants who advance to the next round based on their scores.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
       int k=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=s.nextInt();
       }
       int count=0;
      
        for(int i=0;i<n;i++){
            if(a[i]>=a[k-1] && a[i]>0){
                count++;
            }
        }
        System.out.println(count);
       
    }
}