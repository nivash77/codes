
//bit++ problem -> it contain the variable x with ++ or -- operators
//if it contain ++ then increase the value of x by 1 and if it contain -- then decrease the value of x by 1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int c=0;
        while(t-->0){
            String str=s.next();
            if(str.charAt(0)=='+'||str.charAt(str.length()-1)=='+'){
                c++;
            }
            else{
                c--;
            }

        }
        System.out.println(c);
    }
}