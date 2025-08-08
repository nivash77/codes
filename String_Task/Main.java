// String Task problem ->
// The problem is to transform a given string by removing vowels and adding a dot before each consonant, while also converting uppercase consonants to lowercase.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.next();
       StringBuffer res = new StringBuffer();
        String vowels="aoyeuiAOYEUI";
        for(int i=0;i<str.length();i++){
            if(!vowels.contains(String.valueOf(str.charAt(i)))) {
                if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                   res.append( "." + Character.toLowerCase(str.charAt(i)));
                } else {
                    res.append( "." + str.charAt(i));
                }
            }
        }
        System.out.println(res.toString());
    }
}