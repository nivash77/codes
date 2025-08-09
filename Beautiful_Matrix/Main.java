// Beautiful Matrix problem -> the given code calculates the number of moves required to move a '1' in a 5x5 matrix to the center position (2,2)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int[][] matrix = new int[n][n];
        int indexrow=-1, indexcol=-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1) {
                    indexrow = i;
                    indexcol = j;
                }
            }
        }
        int moves=0;
        if(indexcol!=-1 && indexrow!=-1){
            moves=Math.abs(2-indexrow)+Math.abs(2-indexcol);
        }
        System.out.println(moves);

    }
}