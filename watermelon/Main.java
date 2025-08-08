//watermelon problem we have divide the given parts split into two parts so in this i use that given part is even and not in 2 means we can split into two parts

import java.util.*;
    public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0 && n!=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}