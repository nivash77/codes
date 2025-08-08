
//Threatre Square problem ->
//The problem is given the length of the square and the size of the square, we need to find the number of square tiles needed to cover the entire area of the square.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int m=s.nextInt();
        int a=s.nextInt();
        long x=(n+a-1)/a;
        long y=(m+a-1)/a;
        System.out.println(x*y);

    }
}
