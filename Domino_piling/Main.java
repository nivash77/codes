
// Domino_piling problem ->
// The problem is to find the maximum number of dominoes that can be placed on a m x n board without overlapping.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n=s.nextInt();
        System.out.println((int)((m*n)/2));
    }
}