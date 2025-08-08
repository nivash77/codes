/*Way Too Long Words problem -> 
The problem is given Words length is more than 10 means we have display first and last letters between display the length of letters in between the first and words letters;*/

 import java.util.*;
    public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            String str=s.next();
            if(str.length()>10){
                System.out.println(str.charAt(0)+""+(str.length()-2)+""+str.charAt(str.length()-1));
            }
            else{
                System.out.println(str);
            }
        }
    }
}
