//Team problem in codeforces -> the problem no of problems friends solve least two solve


import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][]=new int[n][3];
        int count=0;
        for (int i = 0; i < n; i++) {
            a[i][0] = s.nextInt();
            a[i][1] = s.nextInt();
            a[i][2] = s.nextInt();
            int k=a[i][0]+a[i][1]+a[i][2];
            if(k>=2){
                count++;
            }
        }
        System.out.println(count);

    }
}