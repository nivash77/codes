// Helpful Maths-> the problem is to sort the numbers in a mathematical expression

import java.util.*;
public  class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str[]=s.nextLine().split("\\+");
        Arrays.sort(str);
        String res=String.join("+", str);
        System.out.println(res);

        

    }
}