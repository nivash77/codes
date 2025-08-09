//Word Capitalization-> problem is to capitalize the first letter of a given string


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(str.charAt(0)>='a' && str.charAt(0)<='z') {
            System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
        } else {
            System.out.println(str);
        }
    }
}